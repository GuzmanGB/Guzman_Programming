package com.example;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.channels.AcceptPendingException;

public class Main {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Ficha de Película");

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);
        ventana.setLayout(new GridLayout(9, 1));
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false); // Hace que el usuario no pueda poner en pantalla completa la ventana

        // PANEL TITULO PELICULA
        JPanel panelTitulo = new JPanel(new GridBagLayout());
        JLabel labelPelicula = new JLabel("Título de la película:    ");
        JTextField fieldPelicula = new JTextField(15);

        panelTitulo.add(labelPelicula);
        panelTitulo.add(fieldPelicula);
        // PANEL TITULO PELICULA

        // PANEL GENERO PELICULA
        JPanel panelGenero = new JPanel(new GridBagLayout());
        JLabel labelGenero = new JLabel("Género:    ");
        JComboBox boxGenero = new JComboBox<String>();

        boxGenero.addItem("Acción");
        boxGenero.addItem("Comèdia");
        boxGenero.addItem("Drama");
        boxGenero.addItem("Terror");
        boxGenero.addItem("Ciencia Ficción");

   
        panelGenero.add(labelGenero);
        panelGenero.add(boxGenero);
        // PANEL GENERO PELICULA

        // PANEL AÑO PELICULA
        JPanel panelAño = new JPanel(new GridBagLayout());
        JLabel labelAño = new JLabel("Año de estreno:    ");
        JSlider sliderAños = new JSlider(1900, 2025, 1956);

        sliderAños.setMinorTickSpacing(5);
        sliderAños.setMajorTickSpacing(25);
        sliderAños.setPaintTicks(true);


        panelAño.add(labelAño);
        panelAño.add(sliderAños);
        // PANEL AÑO PELICULA

        // PANEL AÑO SELECCIONADO PELICULA
        JPanel panelAñoSel = new JPanel();
        JLabel labelAñoInf = new JLabel("Año seleccionado:   ");
        JLabel labelNumAño = new JLabel("");

        panelAñoSel.add(labelAñoInf);
        panelAñoSel.add(labelNumAño);
        // PANEL AÑO SELECCIONADO PELICULA

        JPanel panelBotonFicha = new JPanel();
        JButton botonMostFi = new JButton("Mostrar Ficha");

        panelBotonFicha.add(botonMostFi);

        JPanel panelFicha = new JPanel();
        JLabel labelPeli = new JLabel("");
        JLabel labelFicha = new JLabel("");

        panelFicha.add(labelPeli); // se tiene que hacer visible cuando se le de al boton de encima
        panelFicha.add(labelFicha);

        JPanel panelVocal = new JPanel();
        JLabel labelVocal = new JLabel("Selecciona una vocal:   ");
        JComboBox boxVocal = new JComboBox<String>();

        boxVocal.addItem("A");
        boxVocal.addItem("E");
        boxVocal.addItem("I");
        boxVocal.addItem("O");
        boxVocal.addItem("U");

        panelVocal.add(labelVocal);
        panelVocal.add(boxVocal);

        JPanel panelBotonVocal = new JPanel();
        JButton botonVocal = new JButton("Contar vocales");

        panelBotonVocal.add(botonVocal);

        JPanel panelNumVoc = new JPanel();
        JLabel labelNV = new JLabel("Número de vocales: ");
        JLabel labelNumVoc = new JLabel("");

        panelNumVoc.add(labelNV);
        panelNumVoc.add(labelNumVoc);

        // Funcionalidad para saber el año de la pelicula del slider (lo imprime en un
        // label)
        sliderAños.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int value = sliderAños.getValue();
                labelNumAño.setText(String.valueOf(value));
            }
        });

        botonMostFi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                labelPeli.setText("Película: ");
                if (boxGenero.getSelectedItem() == "Terror") {
                    JOptionPane.showMessageDialog(null, "Ha escogido el Género de TERROR", "Advertencia", 2);
                }
                labelFicha.setText(fieldPelicula.getText() + " | Género: " + boxGenero.getSelectedItem()+ " | Año: " + labelNumAño.getText());

            }
        });

        fieldPelicula.addKeyListener(new KeyListener() {
            int contadorVocales = 0;
            
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (boxVocal.getSelectedItem() == "A") {

                    if (e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {

                        contadorVocales++;
                        labelNumVoc.setVisible(false);
                        labelNumVoc.setText(String.valueOf(contadorVocales));

                    }
                }

                else if (boxVocal.getSelectedItem() == "E") {

                    if (e.getKeyChar() == 'e' || e.getKeyChar() == 'E') {

                        contadorVocales++;
                        labelNumVoc.setVisible(false);
                        labelNumVoc.setText(String.valueOf(contadorVocales));

                    }
                }

                else if (boxVocal.getSelectedItem() == "I") {

                    if (e.getKeyChar() == 'i' || e.getKeyChar() == 'I') {

                        contadorVocales++;
                        labelNumVoc.setVisible(false);
                        labelNumVoc.setText(String.valueOf(contadorVocales));

                    }
                }

                else if (boxVocal.getSelectedItem() == "O") {

                    if (e.getKeyChar() == 'o' || e.getKeyChar() == 'O') {

                        contadorVocales++;
                        labelNumVoc.setVisible(false);
                        labelNumVoc.setText(String.valueOf(contadorVocales));

                    }
                }

                else if (boxVocal.getSelectedItem() == "U") {

                    if (e.getKeyChar() == 'u' || e.getKeyChar() == 'U') {

                        contadorVocales++;
                        labelNumVoc.setVisible(false);
                        labelNumVoc.setText(String.valueOf(contadorVocales));

                    }
                }
            }

        });

        botonVocal.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                labelNumVoc.setVisible(true);

            }

        });





        ventana.add(panelTitulo);
        ventana.add(panelGenero);
        ventana.add(panelAño);
        ventana.add(panelAñoSel);
        ventana.add(panelBotonFicha);
        ventana.add(panelFicha);
        ventana.add(panelVocal);
        ventana.add(botonVocal);
        ventana.add(panelNumVoc);

        ventana.setVisible(true);
    }
}