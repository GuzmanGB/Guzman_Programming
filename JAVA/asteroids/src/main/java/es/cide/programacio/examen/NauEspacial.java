package es.cide.programacio.examen;

import java.awt.*;

import javax.swing.ImageIcon;

class NauEspacial {
    private int x, y; // Posició de la nau espacial
    private final int ample = 100; // Ample de la nau espacial
    private final int alt = 120; // Alt de la nau espacial
    Image mfImage;

    public NauEspacial(int x, int y) {
        this.x = x;
        this.y = y;
        mfImage = new ImageIcon(getClass().getResource("/mf.png")).getImage(); // Cargar la imagen de la pelota

    }

    public void moureEsquerra() {
        x -= 10; // Mou la nau cap a l'esquerra
    }

    public void moureDreta() {
        x += 10; // Mou la nau cap a la dreta
    }

    public void moverArriba() {
        y -= 10; //Mueve la nave para arriba
    }

    public void moverAbajo() {
        y += 10; //Mueve la nave para abajo
    }

    public void dibuixar(Graphics g) {
        g.drawImage(mfImage, x, y, ample,alt,null); // Metodo para dibujar la nave 
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAmple() {
        return ample;
    }

    public int getAlt() {
        return alt;
    }
}