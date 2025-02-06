package es.cide.dam.programacio.yaaz;

import java.util.Random;

public class armaFoc extends artefacte {

    Random random = new Random();

    private double valorArtefacteAF;
    private String nameAF;

    public armaFoc(int pes) {

        super(pes);
        this.valorArtefacteAF = random.nextDouble(0.9, 1.5);
        this.nameAF = "Arma de Foc";
    }
    
    @Override
    public double getValorArtefacte() {
        return this.valorArtefacteAF;
    }

    @Override
    public void setValorArtefacto(double setValorArtefacte) {
        this.valorArtefacteAF = setValorArtefacte;
    }

    @Override
    public String getNameArtefacte() {
        return this.nameAF;
    }

}
