let contador = 0;

function sumarContador() {
    // Si el contador llega a 10, actualiza los botones
    if (contador == 10) {
        var botonContador = document.getElementById('botonContador');
        botonContador.classList.remove('botonContador');
        botonContador.classList.add('contadorDesaparece');

        var botonReiniciar = document.getElementById('botonReiniciar');
        botonReiniciar.classList.remove('botonReiniciar');
        botonReiniciar.classList.add('contadorAparecer');
    }

    // Incrementa el contador y actualiza el párrafo
    var paragraph = document.getElementById('paragrafo');
    contador += 1;
    paragraph.textContent = contador;
}

function reiniciarContador() {
    // Reinicia el contador a cero y actualiza el párrafo
    var paragraph = document.getElementById('paragrafo');
    contador = 0;
    paragraph.textContent = "0";

    // Restaura la visibilidad de los botones
    var botonContador = document.getElementById('botonContador');
    botonContador.classList.remove('contadorDesaparece');
    botonContador.classList.add('botonContador');

    var botonReiniciar = document.getElementById('botonReiniciar');
    botonReiniciar.classList.remove('contadorAparecer');
    botonReiniciar.classList.add('botonReiniciar');
}

function newParagraph() {
    const textUser = document.getElementById('textarea1').value; // Obtiene el valor del textarea
    var divCom = document.getElementById('divComments');
    
    var newPar = document.createElement('p');
    divCom.appendChild(newPar);

    newPar.textContent = textUser;
}

function eliminarParag() {
    var divCom = document.getElementById('divComments');

    // Si hay párrafos, elimina el último
    var paragraphs = divCom.querySelectorAll('p');
    if (paragraphs.length > 0) {
        var removePar = paragraphs[paragraphs.length - 1];
        removePar.remove();
    }
}
