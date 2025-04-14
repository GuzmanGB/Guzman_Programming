document.addEventListener('DOMContentLoaded', () => {
    const form = document.querySelector('form');

    form.addEventListener('submit', (event) => {
        event.preventDefault(); // Prevenir el envío normal del formulario

        // Obtener los valores de los campos
        const origen = document.getElementById('origen').value;
        const destino = document.getElementById('destino').value;
        const fechaInicio = document.getElementById('fecha_inicio').value;
        const fechaFin = document.getElementById('fecha_fin').value;
        const adultos = document.getElementById('adultos').value;
        const ninos = document.getElementById('ninos').value;
        const descuento = document.getElementById('descuento').value;

        // Validaciones
        const today = new Date().toISOString().split('T')[0]; // Fecha actual en formato YYYY-MM-DD

        // Validación de origen y destino
        if (origen === '' || destino === '') {
            alert("Por favor, selecciona origen y destino.");
            return;
        }
        if (origen === destino) {
            alert("El origen y el destino no pueden ser iguales.");
            return;
        }

        // Validación de fechas
        if (fechaInicio < today) {
            alert("La fecha de inicio no puede ser en el pasado.");
            return;
        }
        if (fechaFin < today || fechaFin <= fechaInicio) {
            alert("La fecha de fin debe ser posterior a la de inicio y no puede ser en el pasado.");
            return;
        }

        // Validación de adultos y niños
        if (adultos < 1) {
            alert("El número de adultos debe ser al menos 1.");
            return;
        }
        if (ninos < 0) {
            alert("El número de niños no puede ser negativo.");
            return;
        }

        // Validación del descuento de residente
        if (descuento === 'Residente' && !((origen === 'Palma' && (destino === 'Madrid' || destino === 'Barcelona')) ||
            (destino === 'Palma' && (origen === 'Madrid' || origen === 'Barcelona')))) {
            alert("El descuento de residente solo es aplicable para vuelos entre Palma y Madrid o Barcelona.");
            return;
        }

        // Si pasa la validación, redirigimos a una página con los datos
        const params = new URLSearchParams({
            origen,
            destino,
            fechaInicio,
            fechaFin,
            adultos,
            ninos,
            descuento
        });

        // Redirigir a la página de resultados con los parámetros
        window.location.href = `resultado.html?${params.toString()}`;
    });
});
