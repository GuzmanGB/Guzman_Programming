/* GUZMAN GARCIA BORSANI */
/* 45371302F */
/* 24-01-2025 */

package com.example;

public class torrada { //Se inicializa la clase torrada

    protected String festivitat; // Se inicializa una variable protegido de tipo String llamado "festivitat".
    protected String any; // Se inicializa una variable protegido de tipo String llamado "any".

    public torrada() { //Se inicia el constructor de la clase torrada instanciando las 2 anteriores variables mencionadas.
        this.festivitat = "Sant Sebastià";
        this.any = "2025";
    }

    public String getFestivitat() { // Se crea un método que devuelve la variable "festividad" cuando se le llama
        return festivitat;
    }

    public String getAny() { // Se crea un método que devuelve la variable "any" cuando se le llama
        return any;
    }

    public void setFestivitat(String setFestivitat) { //Creación de un método para establecer un valor al objeto String "festivitat" 
        this.festivitat = setFestivitat;
    }

    public void setAny(String setAny) { //Creación de un método para establecer un valor al objeto String "any" 
        this.any = setAny;
    }

}

interface graella { //Creación de una interfície la cual contiene 2 métodos vacios y 1 de tipo booleano 
    void posarCarnAGraella();

    void llevarCarnDeGraella();

    boolean estaFet();

}

interface menjar { //Creación de una interfície la cual contiene 1 métodos vacio y 1 de tipo booleano 
    void assaborir();

    boolean crema();

}