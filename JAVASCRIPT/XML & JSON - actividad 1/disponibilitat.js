// Variable global para saber si se trabaja en XML o JSON
let estatConversio = "xml";

async function cercarDisponibilitat() {
  // Obtener los valores introducidos en los inputs del formulario
  const origen = document.getElementById("origen").value;
  const desti = document.getElementById("desti").value;
  const adults = document.getElementById("adults").value;
  const infants = document.getElementById("infants").value;
  const dataInici = document.getElementById("dataInici").value;
  const dataFi = document.getElementById("dataFi").value;

  // Comprueba si algún campo está vacío y si es así muestra un aviso
  if (!origen || !desti || !adults || !infants || !dataInici || !dataFi) {
    alert("Tots els camps són obligatoris.");
    return;
  }

  // Borra todo el contenido anterior que haya en las cabeceras de resultado
  document.getElementById("disponibilitat").textContent = "";
  document.getElementById("resultatsVols").textContent = "";
  document.getElementById("resultatsHotels").textContent = "";
  document.getElementById("conversio").textContent = "";
  estatConversio = "xml";

  // Crea un texto para insertar en el HTML como XML con los datos del formulario
  const xml = `
<disponibilitat>
  <origen>${origen}</origen>
  <desti>${desti}</desti>
  <adults>${adults}</adults>
  <infants>${infants}</infants>
  <dataInici>${dataInici}</dataInici>
  <dataFi>${dataFi}</dataFi>
</disponibilitat>
  `.trim();

  // Muestra el XML linea a linea dentro de <p> para mantener el formato
  document.getElementById("disponibilitat").textContent = xml;

  const respostaVols = await fetch("vols.json");
  const vols = await respostaVols.json();

  // Filtrar solo los vuelos que coinciden con origen y destino
  const volsFiltrats = vols.filter(v => v.origen === origen && v.desti === desti);

  if (volsFiltrats.length === 0) {
    // Si no hay vuelos disponibles muestra el mensaje
    document.getElementById("resultatsVols").textContent = "No s'han trobat vols disponibles.";
  } 
  
    else {
    // Si hay vuelos, crea texto con la información de cada vuelo
    let textVols = "";
    for (let i = 0; i < volsFiltrats.length; i++) {
      textVols += `Vol de ${volsFiltrats[i].origen} a ${volsFiltrats[i].desti} - Preu: ${volsFiltrats[i].preu} €\n`;
    }

    // Muestra cada linea de los resultados que haya dentro de un paragrafo 
    document.getElementById("resultatsVols").innerHTML = textVols
      .split("\n")
      .filter(line => line.trim() !== "")
      .map(line => `<p>${line}</p>`)
      .join("");
  }

  // Cargar el archivo hotels.xml y convertirlo en objeto DOM
  const respostaHotels = await fetch("hotels.xml");
  const textHotels = await respostaHotels.text();
  const parser = new DOMParser();
  const xmlDoc = parser.parseFromString(textHotels, "application/xml");

  // Crear array con todos los elementos <hotel>
  const hotels = Array.from(xmlDoc.getElementsByTagName("hotel"));

  const hotelsFiltrats = hotels
    .filter(h => h.getElementsByTagName("desti")[0].textContent === desti)
    .map(h => ({
      nom: h.getElementsByTagName("nom")[0].textContent,
      desti: h.getElementsByTagName("desti")[0].textContent,
      preu: parseFloat(h.getElementsByTagName("preu")[0].textContent),
    }));

  if (hotelsFiltrats.length === 0) {

    document.getElementById("resultatsHotels").textContent = "No s'han trobat hotels disponibles.";
  } 
  
  else {
    let textHotels = "";
    for (let i = 0; i < hotelsFiltrats.length; i++) {
      textHotels += `Hotel: ${hotelsFiltrats[i].nom} - Preu: ${hotelsFiltrats[i].preu} €\n`;
    }

    document.getElementById("resultatsHotels").innerHTML = textHotels
      .split("\n")
      .filter(line => line.trim() !== "")
      .map(line => `<p>${line}</p>`)
      .join("");
  }

}

function convertir() {

  const conversioElement = document.getElementById("conversio");
  const xmlText = document.getElementById("disponibilitat").textContent;

  if (!xmlText.trim()) {
    conversioElement.textContent = "No existeix cap XML per convertir.";
    return;
  }

  if (estatConversio === "xml") {

    const parser = new DOMParser();
    const xmlDoc = parser.parseFromString(xmlText, "application/xml");

    const json = {
      origen: xmlDoc.getElementsByTagName("origen")[0].textContent,
      desti: xmlDoc.getElementsByTagName("desti")[0].textContent,
      adults: xmlDoc.getElementsByTagName("adults")[0].textContent,
      infants: xmlDoc.getElementsByTagName("infants")[0].textContent,
      dataInici: xmlDoc.getElementsByTagName("dataInici")[0].textContent,
      dataFi: xmlDoc.getElementsByTagName("dataFi")[0].textContent,
    };

    conversioElement.textContent = JSON.stringify(json, null, 2);
    estatConversio = "json";
  } 
  
  else {
    const json = JSON.parse(conversioElement.textContent);

    const xml = `
<disponibilitat>
  <origen>${json.origen}</origen>
  <desti>${json.desti}</desti>
  <adults>${json.adults}</adults>
  <infants>${json.infants}</infants>
  <dataInici>${json.dataInici}</dataInici>
  <dataFi>${json.dataFi}</dataFi>
</disponibilitat>
    `.trim();

    conversioElement.textContent = xml;
    estatConversio = "xml";
  }
}
