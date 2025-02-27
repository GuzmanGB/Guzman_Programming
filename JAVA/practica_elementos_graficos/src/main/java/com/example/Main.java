package com.example;

import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame finestra = new JFrame("Dibujo de Java Swing");
        JPanel panel = new JPanel(){

            private Image imatge = new ImageIcon("src\\main\\resources\\imatge.png").getImage();

            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                g2d.drawLine(50, 50, 200, 50);

                g2d.drawRect(50, 70, 100, 50);

                g2d.setColor(Color.blue);
                g2d.fillRect(200,70, 100, 50);

                g2d.setColor(Color.RED);
                g2d.drawOval(50, 150, 50, 50);

                g2d.fillOval(150, 150, 50, 50);

                g2d.setColor(Color.green);

                g2d.drawArc(250,150,50,50,0,180);

                int[] xPoints = {100,125,150};
                int[] yPoints = {250,200,250};
                g2d.setColor(Color.pink);
                g2d.drawPolygon(xPoints,yPoints,3);

                g2d.setColor(Color.black);
                g2d.drawString("AshgdiASHj", 50,300);

                g2d.drawImage(imatge,200, 250, this);

            }

        };

        finestra.add(panel);
        finestra.setSize(400,400);
        finestra.setDefaultCloseOperation(3);
        finestra.setVisible(true);


    }
}