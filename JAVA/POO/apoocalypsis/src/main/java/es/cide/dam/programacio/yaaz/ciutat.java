/**************************************/
/* Nom: Guzman Garcia Borsani         */
/* DNI/NIE: 45371302F                 */
/* Data: 28/11/2024                   */
/* Exercici: PROU3EX01                */
/**************************************/

package es.cide.dam.programacio.yaaz; // Declaracion del paquete donde está ubicada esta clase 

import java.util.Random;

public class ciutat { // Declaración de la clase ciutat

    private int tamaño; // Se crea la variable para almacenar el número entero del tamaño de la ciudad
    private String nombre; // Se crea la variable para almacenar el nombre de esta ciudad
    private zombie[] ruta; // Array de objetos zombie que representa una ruta en la ciudad
    private Random random = new Random();

    public ciutat(int tamañoCiudad, String nombreCiudad) { // Constructor que inicializa los atributos de la ciudad
        this.tamaño = tamañoCiudad; // Inicializa el tamaño de la ciudad con el valor recibido anteriormente
        this.nombre = nombreCiudad; // Inicializa el nombre de la ciudad con el valor recibido anteriormente
        this.ruta = new zombie[tamañoCiudad]; // Inicializa el array de zombies con el tamaño de la ciudad

        for (int i = 0; i < ruta.length; i++) { // Este for servirá para completar el array de ruta con objetos zombies

            int numero = random.nextInt(10); // Genera un número entre 0 y 9

            if (numero == 0) {
                ruta[i] = new superZombie();
            }
            
            else{
                ruta[i] = new zombie(); // Crea un nuevo zombie y lo asigna a cada posición de la ruta
            }   

        }
    }

    public int getTamaño() { // Método para obtener el tamaño de la ciudad
        return tamaño; // Devuelve el valor del tamaño
    }

    public String getNombreCiudad() {
        return nombre;
    }

    public void setTamañoCiudad(int tamañoCiudad) {// Método para establecer un nuevo tamaño a la ciudad
        this.tamaño = tamañoCiudad; // Asigna el valor proporcionado al tamaño
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombre = nombreCiudad;
    }

    public zombie posicioRuta(int posicio) { // Método para obtener un zombie en una posición específica de la ruta
        return ruta[posicio]; // Devuelve el zombie en la posición indicada
    }

}