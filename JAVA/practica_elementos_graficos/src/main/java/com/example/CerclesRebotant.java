package com.example;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CerclesRebotant extends JPanel  implements ActionListener{

    private int x = 50, y = 50;
    private int dx = 2, dy = 2;
    private final int RADI = 20;
    private final int DELAY = 10;
    private Timer timer;
    private Image imatge = new ImageIcon("src\\main\\resources\\DVD-Video_Logo.svg.png").getImage();


    public CerclesRebotant() {
        setBackground(Color.WHITE);
        timer = new Timer(DELAY, this);
        timer.start();
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(imatge, x, y, RADI * 2, RADI * 2, this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (x + 2 * RADI >= getWidth() || x <= 0) {
            dx = -dx;
        }

        if (y + 2 * RADI >= getHeight() || y <= 0) {
            dy = -dy;
        }

        x += dx;
        y += dy;
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame("Circulo rebotante");
            CerclesRebotant panel = new CerclesRebotant();
            panel.setBackground(Color.BLUE);
            frame.add(panel);
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(3);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        });
    }

}
