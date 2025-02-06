/**************************************/
/* Nom: Guzman Garcia Borsani         */
/* DNI/NIE: 45371302F                 */
/* Data: 13/12/2024                   */
/* Exercici: PROU3EX03                */
/**************************************/

package com.example;

public class Main { // Se crea la clase principal main donde se gestionarán todos los objetos creados anteriormente

    
        public static void main(String[] args) { 

        eina martell = new martell(1.5, "Metall"); //Se llama al objeto "martell" mediante su objeto padre y se le instancia el valor de las 2 variables que solicita
        eina destornillador = new destornillador(0.7, "Acer"); // Lo mismo con "destornillador"
        eina serra = new serra(2.3, "Fusta"); // Lo mismo con "serra"
        
        mostrarEina(martell); //Mediante el método creado anteriormente dentro del main se llama a uno de los objetos hijos para que impriman sus datos dentro de las instrucciones del método mostrarEina
        mostrarEina(destornillador);
        mostrarEina(serra);
    }
    
    public static void mostrarEina(eina unaEina) { 
        //Se crea un método estático llamado "mostrarEina" el cual llama al objeto padre "eina" que se instancia como "unaEina" para poder usar sus metodos en el main
        
        unaEina.utilizar(); 
        //Para empezar se llama al metodo utilizar de "eina" que imprimirá en terminal una frase
        System.out.println("Eina: " + unaEina.getNomEina() + ", Pes: " + unaEina.getPes() + " kg, Material: " + unaEina.getMaterial()); 
        //Se imprime por terminal el valor de la variable "nom" de la herramienta solicitada, el valor de la variable "pes" y el valor de la variable "material" 
        System.out.println("--------------------------------------"); //Imprime unas lineas visuales
    }

}