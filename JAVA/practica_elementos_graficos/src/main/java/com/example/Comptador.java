package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Comptador extends JFrame{
    private JLabel etiquetComptador;
    private int comptador = 0;
    private Timer timer;

    public Comptador(){

        setTitle("Comptador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,100);
        setLayout(new FlowLayout());


        etiquetComptador = new JLabel("0");
        etiquetComptador.setFont(new Font("Arial", Font.BOLD, 20));
        add(etiquetComptador);

        timer = new Timer(1000, new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){
                comptador++;
                etiquetComptador.setText(String.valueOf(comptador));
            }

        });

        timer.start();
        setVisible(true);

    }

 public static void main (String [] args){
    new Comptador();
}
        
}

