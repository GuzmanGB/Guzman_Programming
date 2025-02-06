package es.cide.dam.programacio.yaaz;

import java.util.Random;

public class escud extends artefacte {
    Random random = new Random();

    private double valorArtefacteES;
    private String nameES;

    public escud(int pes) {
        super(pes);
        this.valorArtefacteES = random.nextDouble(0.9, 1.5);
        this.nameES = "Escudo";
    }

    @Override
    public double getValorArtefacte() {
        return this.valorArtefacteES;
    }

    @Override
    public void setValorArtefacto(double setValorArtefacte) {
        this.valorArtefacteES = setValorArtefacte;
    }

        @Override
    public String getNameArtefacte() {
        return this.nameES;
    }

}
