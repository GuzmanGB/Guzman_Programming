package com.example;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Examen");

        ventana.setSize(450, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new GridLayout(4, 1));
        ventana.setLocationRelativeTo(null);

        // SLIDER
        JPanel panelSlider = new JPanel(new FlowLayout());
        panelSlider.setBackground(Color.CYAN);

        JSlider slider = new JSlider(0, 100, 50);

        JLabel sliderNum = new JLabel("50");
        panelSlider.add(slider);
        panelSlider.add(sliderNum);

        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue();
                sliderNum.setText(String.valueOf(value));
            }
        });
        // SLIDER

        // CHECKBOX
        JPanel panelCheckBox = new JPanel(new FlowLayout());
        panelCheckBox.setBackground(Color.RED);

        JCheckBox checkBox = new JCheckBox("Si marcas sale un mensaje te lo juro mi brodi");
        panelCheckBox.add(checkBox);

        JLabel checkLabel = new JLabel();
        panelCheckBox.add(checkLabel);

        checkBox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {

                JDialog dialogoChekbox = new JDialog();
                dialogoChekbox.setLocationRelativeTo(null);

                dialogoChekbox.setSize(250, 100);

                JLabel labelDialogo1 = new JLabel("Has marcado el checkbox");
                JLabel labelDialogo2 = new JLabel("Has desmarcado el checkbox");

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    dialogoChekbox.add(labelDialogo1);
                    dialogoChekbox.setVisible(true);
                    System.out.println("Marcado");
                }

                else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    dialogoChekbox.add(labelDialogo2);
                    dialogoChekbox.setVisible(true);
                    System.out.println("Desmarcado");
                }
            }

        });
        // CHECKBOX

        // PANEL RATON ENCIMA
        JPanel panelLabelRaton = new JPanel(new GridLayout());
        JLabel labelRaton = new JLabel();

        panelLabelRaton.add(labelRaton);
        panelLabelRaton.setBackground(Color.GREEN);

        panelLabelRaton.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                labelRaton.setText("Ha entrado en el panel con el ratón");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                labelRaton.setText("Ha salido del panel con el ratón");
            }

        });
        // PANEL RATON ENCIMA

        // PANEL TEXT FIELD
        JPanel panelTextField = new JPanel(new FlowLayout());

        JTextField textField = new JTextField(20);
        JLabel labelTF2 = new JLabel("Este es el total de as: ");
        JLabel labelTF = new JLabel();

        panelTextField.add(textField);
        panelTextField.add(labelTF2);
        panelTextField.add(labelTF);

        textField.addKeyListener(new KeyListener() {
            int contador = 0;

            @Override
            public void keyTyped(KeyEvent e) {

                if (e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {

                    contador++;
                    labelTF.setText(String.valueOf(contador));

                }

            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

        });


        

        // PANEL TEXT FIELD

        ventana.add(panelSlider);
        ventana.add(panelCheckBox);
        ventana.add(panelLabelRaton);
        ventana.add(panelTextField);

        ventana.setVisible(true);
    }
}

