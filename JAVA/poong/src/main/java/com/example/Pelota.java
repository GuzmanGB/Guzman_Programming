package com.example;

public class Pelota {

    private int x, y;
    private int dx, dy;
    private final int RADI = 10;

    public Pelota(int startX, int startY) {
        this.x = startX;
        this.y = startY;
        this.dx = 5;
        this.dy = 5;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDX() {
        return dx;
    }

    public int getDY() {
        return dy;
    }

    public int getRADI() {
        return RADI;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDX(int dx) {
        this.dx = dx;
    }

    public void setDY(int dy) {
        this.dy = dy;
    }
}
