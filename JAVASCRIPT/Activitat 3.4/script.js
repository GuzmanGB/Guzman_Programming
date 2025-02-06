
function increaseFontSize() {
    var paragraph = document.getElementById('paragrafo');
    var currentSize = window.getComputedStyle(paragraph).getPropertyValue('font-size');
    var newSize = (parseFloat(currentSize) * 1.2) + 'px';
    paragraph.style.fontSize = newSize;
}


function decreaseFontSize() {
    var paragraph = document.getElementById('paragrafo');
    var currentSize = window.getComputedStyle(paragraph, null).getPropertyValue('font-size');
    var newSize = (parseFloat(currentSize) / 1.2) + 'px';
    paragraph.style.fontSize = newSize;
}


function changeTextColor() {
    var paragraph = document.getElementById('paragrafo');
    var randomColor = '#' + Math.floor(Math.random() * 16777215).toString(16);
    paragraph.style.color = randomColor;
}


function newParagraph() {
    var textUser = prompt("Introduce lo que quieres que diga el parágrafo: ");
    var paragraph = document.getElementById('newParagrafo');
    paragraph.textContent = textUser;

}


function removeText() {
    var paragraph = document.getElementById('newParagrafo');
    paragraph.textContent = "";

}

function addClass() {
    var paragraph = document.getElementById('paragrafo');
    paragraph.classList.add("estilo-nuevo");
}

function removeClass() {
    var paragraph = document.getElementById('paragrafo');
    paragraph.classList.remove("estilo-nuevo");
}

function toggleTranslation() {
    var paragraph = document.getElementById('paragrafo');
    if (paragraph.textContent === "Esto es un texto de prueba para comprobar el cambio de idioma") {
        paragraph.textContent = "This is a test text to check the change of the language";
    } else {
        paragraph.textContent = "Esto es un texto de prueba para comprobar el cambio de idioma";
    }
}

function changeButtonColor(event) {
    event.target.style.backgroundColor = "blue";
}

function resetButtonColor(event) {
    event.target.style.backgroundColor = "";
}



document.getElementById("botonTraductor").addEventListener("click", toggleTranslation);
document.getElementById("botonEncima").addEventListener("mouseover", changeButtonColor);
document.getElementById("botonEncima").addEventListener("mouseout", resetButtonColor);