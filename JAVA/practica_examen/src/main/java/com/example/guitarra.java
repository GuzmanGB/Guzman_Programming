package com.example;

public class guitarra extends instrumento implements cuerdas{
    
    private String nombreGui;

    public guitarra(String nombreGui){
        super(nombreGui, "Cuerda");
        this.nombreGui = nombreGui;
    }

   @Override
    public void interpretar(){
        System.out.println(nombreGui + ": Tocando una melodía con la guitarra");
    }

    @Override
    public void afinarCuerdas(){
        System.out.println(nombreGui + ": Afinando el tambor");
    }

    @Override
    public void tocarArpegios(){
        System.out.println(nombreGui + ": Tocando un arpegio");
    }
}
