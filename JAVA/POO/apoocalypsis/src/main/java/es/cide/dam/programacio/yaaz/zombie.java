/**************************************/
/* Nom: Guzman Garcia Borsani         */
/* DNI/NIE: 45371302F                 */
/* Data: 28/11/2024                   */
/* Exercici: PROU3EX01                */
/**************************************/

package es.cide.dam.programacio.yaaz; // Declaracion del paquete donde está ubicada esta clase

import java.util.Random; // Importa la funcionalidad Random para generar un número aleatorio

public class zombie { // Declaro la clase zombie como publica
    protected int salutZombie; // Se crea la variable para almacenar el número entero de la salud del zombie
    protected int fuerzaZombie; // Se crea la variable para almacenar el número entero de la fuerza del zombie
    protected int defensaZombie;// Se crea la variable para almacenar el número entero de la defensa del zombie
    Random random = new Random();// Se instancia clase Random para generar los números aleatorios

    public zombie() { // Constructor que inicializa el zombie
        this.salutZombie = 20; // Asigna a la variable salud un valor de 20
        this.fuerzaZombie = 5; // Asigna a la variable fuerza un valor de 5
        this.defensaZombie = 5; // Asigna a la variable defensa un valor de 5
    }

    public int getSalutZombie() { // Método para obtener la salud del zombie
        return salutZombie; // Devuelve el valor de la salud
    }

    public int getFuerzaZombie() {
        return fuerzaZombie;
    }

    public int getDefensaZombie() {
        return defensaZombie;
    }

    public void setSalutZombie(int salutZombieN) {// Método para establecer una nueva salud
        this.salutZombie = salutZombieN; // Asigna el valor proporcionado a la salud.
    }

    public void setFuerzaZombie(int fuerzaZombieN) {
        this.fuerzaZombie = fuerzaZombieN;
    }

    public void setDefensaZombie(int defensaZombieN) {
        this.defensaZombie = defensaZombieN;
    }

    public int ataca() { // Método que le asigna un valor aleatorio entre un mínimo y un máximo a la variable atacaZombie
        int fuerzaZombieN = random.nextInt(fuerzaZombie); // Genera un valor aleatorio entre 0 y la fuerza máxima
        return fuerzaZombieN; // Devuelve el valor del ataque
    }

    public int defensat() { // Método que le asigna un valor aleatorio entre un mínimo y un máximo a la variable defensatZombie
        int defensaZombieN = random.nextInt(defensaZombie);
        return defensaZombieN;
    }

}