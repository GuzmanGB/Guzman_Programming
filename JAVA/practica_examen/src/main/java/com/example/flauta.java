package com.example;

public class flauta extends instrumento implements viento {
    private String nombreFla;

    public flauta(String nombreFla) {
        super(nombreFla, "Viento");
        this.nombreFla = nombreFla;
    }

    @Override
    public void interpretar() {
        System.out.println(nombreFla + ": Tocando una melodía con la flauta");
    }

    @Override
    public void afinarViento() {
        System.out.println(nombreFla + ": Afinando la flauta");
    }

    @Override
    public void hacerSonar() {
        System.out.println(nombreFla + ": Haciendo sonar la flauta");
    }
}
