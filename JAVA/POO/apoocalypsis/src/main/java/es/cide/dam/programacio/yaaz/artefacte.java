package es.cide.dam.programacio.yaaz;

public class artefacte {

    private int pesArt;
    private double valorArtefacte;
    private String nameArtefacte;

    // CONSTRUCTOR:

    public artefacte(int newPes) {
        this.pesArt = newPes;

    }

    // MÉTODOS:

    // Peso
    public int getPes() {
        return this.pesArt;
    }

    public void setPes(int newPes) {
        this.pesArt = newPes;
    }

    // Valor Artefacte:
    public double getValorArtefacte() {
        return this.valorArtefacte;
    }

    public void setValorArtefacto(double setValorArtefacte) {
        this.valorArtefacte = setValorArtefacte;
    }

     // Nombre Artefacte:
    public String getNameArtefacte() {
        return this.nameArtefacte;
    }

    public void setNameArtefacto(String setNameArtefacto) {
        this.nameArtefacte = setNameArtefacto;
    }

}
