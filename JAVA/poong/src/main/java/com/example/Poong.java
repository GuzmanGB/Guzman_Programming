package com.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Poong extends JPanel implements ActionListener, KeyListener {

    private Pelota pelota;
    private Paletas paleta1, paleta2;
    private int punt1 = 0, punt2 = 0;
    private Timer timer;
    private boolean up1, down1, up2, down2;
    private String name1, name2;

    public Poong() {
        SwingUtilities.invokeLater(() -> {
            timer = new Timer(15, this);
            timer.start();
            pelota = new Pelota(getWidth() / 2, getHeight() / 2);
        });
        name1 = "Jugador 1";
        name2 = "Jugador 2";
        paleta1 = new Paletas(30, 200);
        paleta2 = new Paletas(934, 200); // x:964 borde ventana
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Color colorHex = Color.decode("#00000"); // Rojo-anaranjado (ejemplo)

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(colorHex);

        // Pelota
        g2d.fillOval(pelota.getX(), pelota.getY(), pelota.getRADI() * 2, pelota.getRADI() * 2);

        // Paleta Izquierda
        g2d.fillRect(paleta1.getX(), paleta1.getY(), paleta1.getWidth(), paleta1.getHeight());
        // Paleta Derecha
        g2d.fillRect(paleta2.getX(), paleta2.getY(), paleta2.getWidth(), paleta2.getHeight());

        // Puntuaciones
        g2d.setFont(new Font("Arial", Font.BOLD, 40));
        g2d.drawString((name1 + ": " + String.valueOf(punt1)), getWidth() / 7, 50);
        g2d.drawString((name2 + ": " + String.valueOf(punt2)), 630, 50);

        // Linea en medio
        int centerX = getWidth() / 2;
        int centerY = getHeight();
        int ancholinea = 2;
        float linea[] = { 10, 10 };
        g2d.setStroke(new BasicStroke(ancholinea, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 0, linea, 15));
        g2d.drawLine(centerX, 0, centerX, centerY);
    }

    private void moverPelota() {
        int x = pelota.getX();
        int y = pelota.getY();
        int dx = pelota.getDX();
        int dy = pelota.getDY();
        int RADI = pelota.getRADI();

        // Rebote con las paredes superior e inferior
        if (y <= 0 || y + RADI * 2 >= getHeight()) {
            dy = -dy;
        }

        // Rebote con las paletas:

        // Rebote con las paleta 1
        if (x <= paleta1.getX() + paleta1.getWidth() && y >= paleta1.getY()
                && y <= paleta1.getY() + paleta1.getHeight()) {
            dx = -dx;
            x = paleta1.getX() + paleta1.getWidth();
            dx++;
        }
        // Rebote con las paleta 2
        if (x + RADI * 2 >= paleta2.getX() && y >= paleta2.getY() && y <= paleta2.getY() + paleta2.getHeight()) {
            dx = -dx;
            x = paleta2.getX() - (2 * RADI);
            dx--;
        }

        // Puntuacio jugador izquierda
        if (x + RADI * 2 >= getWidth()) {
            x = getWidth() / 2 - RADI;
            y = getHeight() / 2 - RADI;
            dx = -dx;
            dx = 5;
            punt1++;
        }

        if (x <= 0) { // Punto para el jugador derecho
            x = getWidth() / 2 - RADI;
            y = getHeight() / 2 - RADI;
            dx = -dx;
            dx = 5;
            punt2++;
        }

        pelota.setX(x + dx);
        pelota.setY(y + dy);
        pelota.setDX(dx);
        pelota.setDY(dy);
    }

    private void moverPaletas() {
        if (up1) {
            paleta1.moveUp();
        }
        if (down1) {
            paleta1.moveDown(getHeight());
        }
        if (up2) {
            paleta2.moveUp();
        }
        if (down2) {
            paleta2.moveDown(getHeight());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                up1 = true;
                break;
            case KeyEvent.VK_S:
                down1 = true;
                break;
            case KeyEvent.VK_UP:
                up2 = true;
                break;
            case KeyEvent.VK_DOWN:
                down2 = true;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                up1 = false;
                break;
            case KeyEvent.VK_S:
                down1 = false;
                break;
            case KeyEvent.VK_UP:
                up2 = false;
                break;
            case KeyEvent.VK_DOWN:
                down2 = false;
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        moverPelota();
        moverPaletas();
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

}
