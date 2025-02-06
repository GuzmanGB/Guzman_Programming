package es.cide.dam.programacio.yaaz;

import java.util.Random;

public class farmaciola extends artefacte {
    Random random = new Random();

    private double valorArtefacteFA;
    private String nameFA;

    public farmaciola(int pes) {
        super(pes);
        this.valorArtefacteFA = random.nextDouble(1, 15);
        this.nameFA="Farmaciola";
    }

    @Override
    public double getValorArtefacte() {
        return this.valorArtefacteFA;
    }

    @Override
    public void setValorArtefacto(double setValorArtefacte) {
        this.valorArtefacteFA = setValorArtefacte;
    }
    
    @Override
    public String getNameArtefacte() {
        return this.nameFA;
    }
    

}
