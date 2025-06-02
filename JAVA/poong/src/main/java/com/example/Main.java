package com.example;

import java.awt.*;
import javax.swing.*;

public class Main extends Poong{

    public static void main(String[] args) {

        new Poong();
        
        SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame("PING PONG");
            Main panel = new Main();
            Color colorHexBck = Color.decode("#118ab2");

            panel.setBackground(colorHexBck);
            frame.addKeyListener(panel);
            frame.add(panel);
            frame.setSize(1000, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        });
    }

}