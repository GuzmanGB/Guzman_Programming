package com.example;

public class gos extends animal implements terrestre{
    
    public gos(String nombreGos){
        super(nombreGos, "Mamifero");
    }

    @Override
    public void caminar(){
        System.out.println(nombreA + "Estoy caminando!");
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombreA + "Bup, Bup");
    }

}
