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

