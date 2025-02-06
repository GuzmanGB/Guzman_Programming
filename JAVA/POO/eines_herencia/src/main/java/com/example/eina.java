/**************************************/
/* Nom: Guzman Garcia Borsani         */
/* DNI/NIE: 45371302F                 */
/* Data: 13/12/2024                   */
/* Exercici: PROU3EX03                */
/**************************************/

package com.example;

public class eina {
    //Aqui se crean las variables que se van a usar la clase "eina"
    private double pes; 
    private String material;
    private String nom;
    
    // Se inicia el constructor de la clase eina solicitando 2 variables (1 double y 1 string)
    public eina(double pesEina, String materialEina) { 
        this.pes = pesEina; //Se asigna el valor de la variable privada "pes" mediante la variable "pesEina" creada al iniciar el constructor
        this.material = materialEina; //Se asigna el valor de la variable privada "material" mediante la variable "materialEina" creada al iniciar el constructor
        this.nom = "einaX"; //Se establece un valor a la variable de "nom"
    }

    // Aqui comienzan los métodos

    public double getPes() { //Se crea un metodo getter para poder saber el valor de la variable "pes"
        return this.pes;
    }

    public String getMaterial() { //Se crea un metodo getter para poder saber el valor de la variable "material"
        return this.material;
    }

    public void setPes(double pesEina) { //Se crea un metodo setter para poder modificar el valor de la variable "pes"
        this.pes = pesEina;
    }
    
    public void setMaterial(String materialEina) { //Se crea un metodo setter para poder modificar el valor de la variable "material"
        this.material = materialEina;
    }
   
    public void utilizar() { //Se crea un metodo que ingresa por terminal una frase
        System.out.println("Utilitzant una eina genèrica");
    }
    
    public String getNomEina(){ //Se crea un metodo getter para poder saber el valor de la variable "nom"
        return this.nom;
    }
}
