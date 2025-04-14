package es.cide.programacio.examen;

import java.awt.*;
import java.util.Random;

import javax.swing.ImageIcon;

class Asteroide {
    private int x, y; // Posició de l'asteroide
    private final int radi = 50; // Radi de l'asteroide
    private int velocitat; // Velocitat de l'asteroide
    Image asteroide;

    public Asteroide(int amplePanell) {
        Random aleatori = new Random();
        x = aleatori.nextInt(amplePanell - radi * 2) + radi; // Posició x aleatòria
        y = 0; // Comença a la part superior del panell
        velocitat = aleatori.nextInt(9) + 5; // Velocitat aleatòria entre 4 i 9
        asteroide = new ImageIcon(getClass().getResource("/a.png")).getImage(); // Cargar la imagen del asteroide
    }

    public void moure() {
        y += velocitat; // Mou l'asteroide cap avall
    }

    public void dibuixar(Graphics g) {
        g.drawImage(asteroide, x, y,  radi * 2 , radi * 2, null); // Dibuja el asteroide usando la imagen
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadi() {
        return radi;
    }
    
}
