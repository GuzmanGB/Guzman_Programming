package es.cide.dam.programacio.yaaz;

import java.util.Random;

public class novaCiutat extends ciutat {

    Random random = new Random();

    private artefacte[] ObrirEnCasDEmergencia;

    public novaCiutat(int tamañoCiudad, String nombreCiudad) {
        super(tamañoCiudad, nombreCiudad);

        this.ObrirEnCasDEmergencia = new artefacte[tamañoCiudad];

        for (int i = 1; i < ObrirEnCasDEmergencia.length; i++) {

            double artefacteRand = random.nextDouble(0.0, 1.0);

                if (artefacteRand < 0.01) { // Arma de foc: 1%
                    ObrirEnCasDEmergencia[i] = new armaFoc(15);
                }

                else if (artefacteRand < 0.04) { // Arma d’acer: 3%
                    ObrirEnCasDEmergencia[i] = new armaAcer(15);
                }

                else if (artefacteRand < 0.09) { // Farmaciola: 5%
                    ObrirEnCasDEmergencia[i] = new farmaciola(5);
                }

                else if (artefacteRand < 0.19) { // Escudo: 10%
                    ObrirEnCasDEmergencia[i] = new escud(18);
                }

                else if (artefacteRand > 0.20) {
                    ObrirEnCasDEmergencia[i] = null;
                }
            
            
        }

    }

    public artefacte mostrarArtefactesCaixa(int posicio, supervivent supervivent) {

        for (int i = posicio; i == posicio; i++) {

            if (ObrirEnCasDEmergencia[i] != null) {
                System.out.println("HAY UN ARTEFACTO EN ESTA CAJA!\n Se ha encontrado un "
                        + ObrirEnCasDEmergencia[i].getNameArtefacte() + "\n");

                if (ObrirEnCasDEmergencia[i].getNameArtefacte() == "Arma de Foc") {
                    System.out.println("Se le multiplicará el ataque del superviviente por "
                            + ObrirEnCasDEmergencia[i].getValorArtefacte());
                    supervivent.setFuerzaSupervivent((int) supervivent.getFuerzaSupervivent()
                            * (int) ObrirEnCasDEmergencia[i].getValorArtefacte());
                    System.out.println(
                            "El ataque del superviviente ahora es " + supervivent.getFuerzaSupervivent() + "\n");
                }

                else if (ObrirEnCasDEmergencia[i].getNameArtefacte() == "Arma de Acer") {
                    System.out.println("Se le sumará el ataque del superviviente por "
                            + ObrirEnCasDEmergencia[i].getValorArtefacte());
                    supervivent.setFuerzaSupervivent(
                            supervivent.getFuerzaSupervivent() + (int) ObrirEnCasDEmergencia[i].getValorArtefacte());
                    System.out.println(
                            "El ataque del superviviente ahora es " + supervivent.getFuerzaSupervivent() + "\n");
                }

                else if (ObrirEnCasDEmergencia[i].getNameArtefacte() == "Escudo") {
                    System.out.println("Se le multiplicará la defensa del superviviente por "
                            + ObrirEnCasDEmergencia[i].getValorArtefacte());
                    supervivent.setDefensaSupervivent((int) supervivent.getDefensaSupervivent()
                            * (int) ObrirEnCasDEmergencia[i].getValorArtefacte());
                    System.out.println(
                            "La defensa del superviviente ahora es " + supervivent.getDefensaSupervivent() + "\n");
                } else if (ObrirEnCasDEmergencia[i].getNameArtefacte() == "Farmaciola") {
                    System.out.println("Se le sumara la vida del superviviente por "
                            + ObrirEnCasDEmergencia[i].getValorArtefacte());
                    supervivent.setSalutSupervivent((int) supervivent.getSalutSupervivent()
                            + (int) ObrirEnCasDEmergencia[i].getValorArtefacte());
                    System.out
                            .println("La vida del superviviente ahora es " + supervivent.getSalutSupervivent() + "\n");
                }
            }

            else if (ObrirEnCasDEmergencia[i] == null) {
                System.out.println("No hay nada en esta caja\n");
            }

        }

        return ObrirEnCasDEmergencia[posicio];

    }

}
