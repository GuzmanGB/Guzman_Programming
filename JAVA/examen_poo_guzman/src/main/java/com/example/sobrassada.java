/* GUZMAN GARCIA BORSANI */
/* 45371302F */
/* 24-01-2025 */

package com.example;

import java.util.Random; // Se importa la utilidad del random para poder usarlo posteriormente

public class sobrassada extends torrada implements graella, menjar { // Se incializa la clase "sobrassada" siendo una extensión de la superclase "torrada" e implementando las interfaces de "graella" y "menjar"

    Random rand = new Random();//Se inicializa la utilidad del random para generar numeros aleatorios enteros.

    public sobrassada() { // Se inicia el constructor de la clase "sobrassada"
    }

    @Override
    public boolean estaFet() { //Se llama al método "estaFet" del padre "torrada" para sobreescribirlo segun las instrucciones inferiores.
        int numRand = rand.nextInt(10) + 1; //En el método se usa una formula de % para que 5 de cada 10 veces se devuelva un valor falso, y que de la otra mitad se devuelva un verdadero

        if (numRand <= 5) {
            return false;
        }

        else {
            return true;
        }
    }

    @Override // Se llama al método de la interficie "graella" para sobreescribirlo e imprimir un mensaje por pantalla cuando se ejecute. 
    public void posarCarnAGraella() {
        System.out.println("He possat la sobrassada a la graella");
    }

    @Override // Este método funciona igual que el anterior.
    public void llevarCarnDeGraella() {
        System.out.println("Ja puc llevar la sobrassada de la graella");
    }

    @Override
    public void assaborir() { // Este método funciona igual que los anteriores.
        System.out.println("Estic assaborint la sobrassada");
    }

    @Override // Se llama al método de la interficie "menjar" para sobreescribirlo e imprimir un mensaje por pantalla cuando se ejecute dependiendo de unas instrucciones.
    public boolean crema() { //Usando el método de aleatoriedad, 5 de cada 10 veces se imprimirá un mensaje por pantalla y devolverá un valor falso, y en la otra mitad devolverá un mensaje diferente y un valor verdadero
        int numRand = rand.nextInt(10) + 1;

        if (numRand <= 5) {
            System.out.println("La sobrassada no crema encara");
            return false;
        }

        else {
            System.out.println("La sobrassada crema!");
            return true;
        }
    }

}
