/* GUZMAN GARCIA BORSANI */
/* 45371302F */
/* 24-01-2025 */

package com.example;

import java.util.Random; // Se importa la utilidad del random para poder usarlo posteriormente

public class botifarro extends torrada implements graella, menjar { // Se incializa la clase "botifarro" siendo una extensión de la superclase "torrada" e implementando las interfaces de "graella" y "menjar"
    Random rand = new Random(); //Se inicializa la utilidad del random para generar numeros aleatorios enteros.
    protected boolean coentBotifarro; // Se incializa una variable protegido de tipo booleano llamado "coentBotifarro".

    public botifarro(boolean coent) { // Se inicia el constructor de la clase "botifarro", inicializado por una variable de tipo boolean
        this.coentBotifarro = coent; //Se le indica al objeto anteriormente mencionado que tenga el mismo valor con el que se instancia el constructor
    }

    public boolean getCoent() { //Creación de un método para devolver el valor del objeto booleano "coentBotifarro"
        return coentBotifarro;
    }

    public void setCoent(Boolean coentBo) { //Creación de un método para establecer un valor al objeto booleano "coentBotifarro" 
        this.coentBotifarro = coentBo;
    }

    @Override //Se llama al método "estaFet" del padre "torrada" para sobreescribirlo segun las instrucciones inferiores.
    public boolean estaFet() { //En el método se usa una formula de % para que 7 de cada 10 veces se devuelva un valor falso, y que de 3 de cada 10 se devuelva un verdadero
        int numRand = rand.nextInt(10) + 1;

        if (numRand <= 7) {
            return false;
        }

        else {
            return true;
        }
    }

    @Override // Se llama al método de la interficie "graella" para sobreescribirlo e imprimir un mensaje por pantalla cuando se ejecute. 
    public void posarCarnAGraella() {
        System.out.println("He possat el botifarró a la graella");
    }

    @Override // Este método funciona igual que el anterior.
    public void llevarCarnDeGraella() {
        System.out.println("Ja puc llevar el botifarró de la graella");
    }

    @Override // Se llama al método de la interficie "menjar" para sobreescribirlo e imprimir un mensaje por pantalla cuando se ejecute dependiendo de unas instrucciones.
    public void assaborir() { // Cuando el valor del objeto "coentBotifarro" sea verdadero imprimirá un mensaje por pantalla, y cuando sea falso imprimirá otro.
        if (coentBotifarro == true) {
            System.out.println("Estic assaborint el botifarro i es coent");
        } else {
            System.out.println("Estic assaborint el botifarro i no es coent");

        }

    }

    @Override // Se llama al método de la interficie "menjar" para sobreescribirlo e imprimir un mensaje por pantalla cuando se ejecute dependiendo de unas instrucciones.
    public boolean crema() { //Usando el método de aleatoriedad, 5 de cada 10 veces se imprimirá un mensaje por pantalla y devolverá un valor falso, y en la otra mitad devolverá un mensaje diferente y un valor verdadero
        int numRand = rand.nextInt(10) + 1;

        if (numRand <= 5) {
            System.out.println("El botifarró no crema");
            return false;
        }

        else {
            System.out.println("El botifarró crema");
            return true;
        }
    }

}
