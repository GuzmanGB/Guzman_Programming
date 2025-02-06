package com.example;


public class Main {


    public static void main(String[] args) {

        guitarra guitarra = new guitarra("Fender Stratocaster");
        tambor tambor = new tambor("Tambor Yamaha");
        flauta flauta = new flauta("Flauta Yamaha");
        
        guitarra.mostrarInformacion();
        guitarra.afinarCuerdas();
        guitarra.tocarArpegios();
        guitarra.interpretar(); 
        
        System.out.println();
        
        tambor.mostrarInformacion();
        tambor.afinarTambor();
        tambor.tocarTambor();
        tambor.interpretar(); 
        
        System.out.println();
        
        flauta.mostrarInformacion();
        flauta.afinarViento();
        flauta.hacerSonar();
        flauta.interpretar(); 



    }
}