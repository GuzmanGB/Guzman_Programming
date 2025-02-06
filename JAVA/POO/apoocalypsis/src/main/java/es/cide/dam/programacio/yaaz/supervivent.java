/**************************************/
/* Nom: Guzman Garcia Borsani         */
/* DNI/NIE: 45371302F                 */
/* Data: 28/11/2024                   */
/* Exercici: PROU3EX01                */
/**************************************/

package es.cide.dam.programacio.yaaz; // Declaracion del paquete donde está ubicada esta clase

import java.util.Random;   // Importa la funcionalidad Random para generar un número aleatorio

public class supervivent {  // Declaro la clase supervivent como publica

    private int salut; // Se crea la variable para almacenar el número entero de la salud del superviviente
    private int fuerza; // Se crea la variable para almacenar el número entero de la fuerza del superviviente
    private int defensa; // Se crea la variable para almacenar el número entero de la defensa del superviviente
    private String nombre; // Se crea la variable para almacenar el nombre del superviviente

    Random random = new Random(); // Se instancia clase Random para generar los números aleatorios

    public supervivent(String nombreX) { // Constructor que inicializa el superviviente con un nombre
        this.salut = 100; //Asigna a la variable salud un valor de 100
        this.fuerza = 10; //Asigna a la variable salud un valor de 10
        this.defensa = 10; //Asigna a la variable salud un valor de 10
        this.nombre = nombreX; // Asigna el nombre dado como parámetro
    }

    public int getSalutSupervivent() { // Método para obtener la salud del superviviente
        return salut; // Devuelve el valor de la salud
    }

    public int getFuerzaSupervivent() {
        return fuerza;
    }

    public int getDefensaSupervivent() {
        return defensa;
    }

    public String getNameSupervivent() {
        return nombre;
    }

    public void setSalutSupervivent(int salutSupervivent) {  // Método para establecer una nueva salud
        this.salut = salutSupervivent; // Asigna el valor proporcionado a la salud
    }

    public void setFuerzaSupervivent(int fuerzaSupervivent) {
        this.fuerza = fuerzaSupervivent;
    }

    public void setDefensaSupervivent(int defensaSupervivent) {
        this.defensa = defensaSupervivent;
    }

    public int ataca() { // Método que le asigna un valor aleatorio entre un mínimo y un máximo a la variable fuerzaSuperviviente
        int fuerzaSupervivent = random.nextInt(fuerza); // Genera un valor aleatorio entre 0 y la fuerza máxima
        return fuerzaSupervivent; // Devuelve el valor del ataque
    }

    public int defensat() { // Método que le asigna un valor aleatorio entre un mínimo y un máximo a la variable defensatSupervivent
        int defensaSupervivent = random.nextInt(defensa);
        return defensaSupervivent;
    }

}