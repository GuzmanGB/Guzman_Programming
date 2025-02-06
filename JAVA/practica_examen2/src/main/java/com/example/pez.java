package com.example;

public class pez extends animal implements acuatico{
    
    public pez(String nombrePez){
        super(nombrePez, "Acuático");
    }

    @Override
    public void nadar(){
        System.out.println("Estoy nadando!");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Blub, Blub");
    }

    
}