let colors = ['red', 'blue', 'green', 'yellow', 'purple', 'orange'];
let colorIndex = 0;


function addImg() {
    const imageUrl = document.getElementById('imageUrl').value;
    
    if (imageUrl) {
        const galeria = document.getElementById('galeria');

        const imatgeContainer = document.createElement('div');
        imatgeContainer.classList.add('imatge-container');

        const imatge = document.createElement('img');
        imatge.src = imageUrl;
        imatge.classList.add('imatge');
        imatge.style.borderColor = colors[colorIndex];


        const botonEliminar = document.createElement('button');
        botonEliminar.textContent = 'Eliminar';
        botonEliminar.classList.add('botons');
        botonEliminar.onclick = function() {
            imatgeContainer.remove();
        };

        const botonCanviarBorde = document.createElement('button');
        botonCanviarBorde.textContent = 'Canviar Borde';
        botonCanviarBorde.classList.add('botons');
        botonCanviarBorde.onclick = function() {
            colorIndex = (colorIndex + 1) % colors.length;
            imatge.style.borderColor = colors[colorIndex];
        };


        imatgeContainer.appendChild(imatge);
        imatgeContainer.appendChild(botonEliminar);
        imatgeContainer.appendChild(botonCanviarBorde);
        galeria.appendChild(imatgeContainer);

    }
    
}

function remTodo() {
    const galeria = document.getElementById('galeria');
    galeria.innerHTML = '';
}