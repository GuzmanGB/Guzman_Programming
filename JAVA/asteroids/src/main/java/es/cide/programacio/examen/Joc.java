package es.cide.programacio.examen;

import javax.swing.*;

public class Joc {
    public static void main(String[] args) {
        // Crea la finestra principal
        JFrame finestra = new JFrame("El corredor de Kessel");
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setResizable(false); // No permite redimensionar la ventana
        finestra.setSize(800, 600); // Mida de la finestra
        finestra.add(new JocPanel()); // Afegeix el panell del joc
        finestra.setLocationRelativeTo(null); // Centra la finestra
        finestra.setVisible(true); // Fa que la finestra sigui visible
    }
}