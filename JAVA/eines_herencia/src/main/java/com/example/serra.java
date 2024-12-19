/**************************************/
/* Nom: Guzman Garcia Borsani         */
/* DNI/NIE: 45371302F                 */
/* Data: 13/12/2024                   */
/* Exercici: PROU3EX03                */
/**************************************/

package com.example;

public class serra extends eina { //Se crea la clase "serra" que hace de hijo del objeto "eina"

    private String nom; //Se instacia una variable de tipo String con llamada "nom"
    
    public serra(double pesSerra , String materialSerra){ //Se inicia el constructor de la clase "serra" mediante la solicitud de una variable Double y una variable String
        super(pesSerra , materialSerra); //Gracias a este metodo "super" se puede llamar al constructor del objeto "eina" 
        this.nom="Serra"; //Se establece un valor a la variable de "nom"
    }

    @Override //Se usa Override para poder sobreescribir un método que ya existe en el objeto padre
    public void utilizar() { //Se crea un metodo que ingresa por terminal una frase
        System.out.println("Tallant amb la serra.");
    }
    
    @Override
    public String getNomEina(){ //Se crea un metodo getter para poder saber el valor de la variable "nom"
        return this.nom;
    }

}
