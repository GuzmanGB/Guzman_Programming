package com.example;

public class Paletas {

    private int x, y; // Posición de la paleta
    private final int width = 20, height = 110; // Tamaño de la paleta
    private final int dy = 15; // Velocidad de movimiento

    public Paletas(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void moveUp() {
        if (y > 0) {
            y -= dy;
        }
    }

    public void moveDown(int panelHeight) {
        if (y + height < panelHeight) {
            y += dy;
        }
    }
}
