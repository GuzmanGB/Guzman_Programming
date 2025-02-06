package com.example;

import java.util.Random;

public class zoologico{

    private int tam_zoo;
    private animal[] animales;
    
    gos gos = new gos("Gos");
    aguila aguila = new aguila("Aguila");
    pez pez = new pez("Pez");

    public zoologico(int tamany_zoologico) {

        this.tam_zoo = tamany_zoologico;
        this.animales = new animal[tamany_zoologico];


        for (int i = 0; i < animales.length; i++) {

            Random rand = new Random();

            int a = rand.nextInt(10);

            if (a <= 3) {
                animales[i] = new gos("Gos");
            }

            else if (a <= 6) {
                animales[i] = new aguila("Aguila");
            }

            else if (a <= 9) {
                animales[i] = new pez("Pez");
            }
        }
    }


    public void muestraAnimales(){

        for (int i = 0; i < tam_zoo; i++) {

            if (animales[i].nombreA == "Gos") {
                gos.mostrarInformacion();
                System.out.println(animales[i].nombreA + ": "); gos.emitirSonido();
                System.out.println(animales[i].nombreA + ": "); gos.caminar();
            } 
            
            else if (animales[i].nombreA == "Aguila") {
                aguila.mostrarInformacion();
                System.out.println(animales[i].nombreA + ": "); aguila.emitirSonido();
                System.out.println(animales[i].nombreA + ": "); aguila.volar();
            } 
            
            else if (animales[i].nombreA == "ez") {
                pez.mostrarInformacion();
                System.out.println(animales[i].nombreA + ": "); pez.emitirSonido();
                System.out.println(animales[i].nombreA + ": "); pez.nadar();
            }
        }
    }
}
