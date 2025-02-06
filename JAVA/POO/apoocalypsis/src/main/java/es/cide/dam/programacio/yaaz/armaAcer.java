package es.cide.dam.programacio.yaaz;

import java.util.Random;

public class armaAcer extends artefacte {

    Random random = new Random();

    private double valorArtefacteAA;
    private String nameAA;

    public armaAcer(int pes) {
        super(pes);
        this.valorArtefacteAA = random.nextDouble(1, 15);
        this.nameAA = "Arma de Acer";
    }

    @Override
    public double getValorArtefacte() {
        return this.valorArtefacteAA;
    }

    @Override
    public void setValorArtefacto(double setValorArtefacte) {
        this.valorArtefacteAA = setValorArtefacte;
    }

    @Override
    public String getNameArtefacte() {
        return this.nameAA;
    }

}
