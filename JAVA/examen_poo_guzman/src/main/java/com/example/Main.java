/* GUZMAN GARCIA BORSANI */
/* 45371302F */
/* 24-01-2025 */

package com.example;

public class Main {
    public static void main(String[] args) {

        torrada torrada = new torrada(); // Se instancia la clase "torrada" para poder hacer uso de sus métodos.
        botifarro botifarro = new botifarro(true); // Se instancia la clase "botifarro" para poder hacer uso de sus métodos, iniciandola con un booleano "true".
        sobrassada sobrassada = new sobrassada(); // Se instancia la clase "sobrassada" para poder hacer uso de sus métodos.

        System.out.println("Benvingut a la torrada de " + torrada.getFestivitat() + " " + torrada.getAny()); // Se imprime por consola un mensaje que contiene el valor de la variable "festivitat" y "any" de la clase torrada.
        System.out.println("He comprat un botifarró"); 
        System.out.println("He comprat una sobrassada");
        botifarro.posarCarnAGraella(); // Se llama a un método de la clase "botifarro" que imprime un mensaje por pantalla.
        sobrassada.posarCarnAGraella(); // Se llama a un método de la clase "sobrassada" que imprime un mensaje por pantalla.

        System.out.println("Vaig a mirar si están fets: ");
        while (botifarro.estaFet() == false || sobrassada.estaFet() == false) { // Se inicia un bucle que hace mientras el método "estaFet" de butifarra y de sobrassada sean "falso" no saldrá del bucle

            if (botifarro.estaFet() == false && sobrassada.estaFet() == false) { //Se inicia una instruccion que dependiendo de qué métodos sean falsos o verdaderos imprimirá un mensaje u otro mientras se ejecute el bucle.
                System.out.println("El botifarró està cru i la sobrassada està cru. He d'esperar.");
            }

            else if (botifarro.estaFet() == true && sobrassada.estaFet() == false) {
                System.out.println("El botifarró està fet i la sobrassada està cru. He d'esperar.");
            }

            else if (botifarro.estaFet() == false && sobrassada.estaFet() == true) {
                System.out.println("El botifarró està cru i la sobrassada està fet. He d'esperar.");
            }
        }

        System.out.println("El botifarró està fet i la sobrassada està fet. Ja puc anar a sopar."); // En el momento que las dos variables sean verdaderas, saldrá del bucle y se imprimrirá este mensaje.

        botifarro.assaborir(); // Se llama a un método de la clase "botifarro" que imprime un mensaje por pantalla.
        botifarro.crema(); // Se llama a un método de la clase "botifarro" que imprime un mensaje por pantalla.
        sobrassada.assaborir(); // Se llama a un método de la clase "sobrassada" que imprime un mensaje por pantalla.
        sobrassada.crema(); // Se llama a un método de la clase "sobrassada" que imprime un mensaje por pantalla.
       
        System.out.println("Au, ja está tot fet! Visca " + torrada.getFestivitat()); // Se imprime por consola un mensaje que contiene el valor de la variable "festivitat".
    }
}