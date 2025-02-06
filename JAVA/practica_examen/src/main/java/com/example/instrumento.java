package com.example;

public abstract class instrumento {

    private String nombreIns;
    private String tipoIns;

    public instrumento(String nombreIns, String tipoIns) { // Constructor de instrumento inicializado con 2 variables de tipo String
        this.nombreIns = nombreIns;
        this.tipoIns = tipoIns;
    }

    public void mostrarInformacion() { // muestra por consola las variables de nombre y tipo
        System.out.println("Instrumento: " + nombreIns + ", Tipo: " + tipoIns);
    }

    public abstract void interpretar();

}

interface cuerdas { //crea la interficie cuerdas con 2 metodos

    public void afinarCuerdas();

    public void tocarArpegios();

}

interface percusion { //crea la interficie percusion con 2 metodos

    public void afinarTambor();

    public void tocarTambor();

}

interface viento { //crea la interficie viento con 2 metodos

    public void afinarViento();

    public void hacerSonar();
}