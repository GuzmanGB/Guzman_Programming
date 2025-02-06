package com.example;

public class aguila extends animal implements volador{
    
    public aguila(String nombreAgui){
        super(nombreAgui, "Volador");
    }

    @Override
    public void volar(){
        System.out.println(nombreA + "Estoy volando!");
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombreA + "Screech!");
    }

    
}
