package com.example;

public class tambor extends instrumento implements percusion{
    
    private String nombreTamb;

    public tambor(String nombreTamb){
        super(nombreTamb, "Percusión");
        this.nombreTamb = nombreTamb;
    }

    @Override
    public void interpretar(){
        System.out.println(nombreTamb + ": Tocando una melodía con la guitarra");
    }


    @Override
    public void afinarTambor(){
        System.out.println(nombreTamb + ": Afinando el tambor");
    }

    @Override
    public void tocarTambor(){
        System.out.println(nombreTamb + ": Golpeando el tambor");
    }


}
