package com.example;

abstract class animal {
    
    protected String nombreA;
    protected String tipoA;

    public animal(String nombreAni, String tipoAni){
        this.nombreA = nombreAni;
        this.tipoA = tipoAni;
    }

    public void mostrarInformacion(){
        System.out.println("Animal: " + nombreA + ", Tipo: " + tipoA);
    }

    abstract void emitirSonido();

}


interface terrestre {
    void caminar();
}


interface volador {
    void volar();
}


interface acuatico {
    void nadar();    
}