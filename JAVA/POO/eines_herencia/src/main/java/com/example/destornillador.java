/**************************************/
/* Nom: Guzman Garcia Borsani         */
/* DNI/NIE: 45371302F                 */
/* Data: 13/12/2024                   */
/* Exercici: PROU3EX03                */
/**************************************/

package com.example;

public class destornillador extends eina { //Se crea la clase "destornillador" que hace de hijo de la clase "eina"

    private String nom; //Se instacia una variable de tipo String con llamada "nom"

    public destornillador(double pesDestornillador, String materialDestornillador) {  //Se inicia el constructor de la clase "destornillador" mediante la solicitud de una variable Double y una variable String
        super(pesDestornillador, materialDestornillador); //Gracias a este metodo "super" se puede llamar al constructor del objeto "eina" 
        this.nom="Destornillador"; //Se establece un valor a la variable de "nom"
    }

    @Override //Se usa Override para poder sobreescribir un método que ya existe en el objeto padre
    public void utilizar() { //Se crea un metodo que ingresa por terminal una frase
        System.out.println("Tornant cargols amb el destornillador.");
    }

    @Override
    public String getNomEina(){ //Se crea un metodo getter para poder saber el valor de la variable "nom"
        return this.nom;
    }
}