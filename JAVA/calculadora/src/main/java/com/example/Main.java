package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        try { //LOOK & FEEL PARA CAMBIAR ESTILO VENTANA 
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

        //CREACIÓN DE VENTANA
        JFrame ventana = new JFrame("Calculadora"); //Se crea la ventana con el nombre "Calculadora"
        ventana.setSize(400, 300); //Se establece un tamaño a la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Se indica a la ventana la forma de cerrar el programa
        ventana.setLayout(new GridLayout(4, 1)); //Se indica a la ventana que se distribuya con 4 lineas y 1 columna

        ventana.setResizable(false); //Hace que el usuario no pueda poner en pantalla completa la ventana
        ventana.setLocationRelativeTo(null); //Coloca la ventana en medio de la pantalla
 
        //CREACION DEL PANEL DEL PRIMER NUMERO
        JPanel panelPrimNum = new JPanel(new FlowLayout()); //Se crea el panel del primer número 
        panelPrimNum.add(new JLabel("Introduzca 1er número: ")); //Se crea una etiqueta que indica un texto
        JTextField campoNum1 = new JTextField(15); //Se crea un campo de texto con una medida de 15 columnas
        panelPrimNum.add(campoNum1); //Se añade el campo de texto al panel

        //CREACION DEL PANEL DEL SEGUNDO NUMERO (con las mismas funciones que el primero)
        JPanel panelSegNum = new JPanel(new FlowLayout());
        panelSegNum.add(new JLabel("Introduzca 2ndo número: "));
        JTextField campoNum2 = new JTextField(15);
        panelSegNum.add(campoNum2);

        //CREACION DE LOS BOTONES PARA OPERACIONES
        JPanel operacionesBotones = new JPanel(new GridLayout(1, 4)); //Se crea el panel para los botones que harán las operaciones, con un tamaño de 1 fila y 4 columnas

        JButton botonSuma = new JButton("+"); //Creación de un boton con el simbolo de "+"
        JButton botonResta = new JButton("-");
        JButton botonMulti = new JButton("*");
        JButton botonDivi = new JButton("/");
        operacionesBotones.add(botonSuma); // Se añade el boton de suma al panel anterior
        operacionesBotones.add(botonResta);
        operacionesBotones.add(botonMulti);
        operacionesBotones.add(botonDivi);

        //CREACION DEL PANEL PARA REPRESENTAR LOS RESULTADOS
        JPanel panelResult = new JPanel(new FlowLayout());  //Se crea el panel del resultado de las operaciones
        panelResult.add(new JLabel("Resultado: ")); //Se crea una etiqueta con el texto de "Resultado: "
        JLabel campoResultado = new JLabel("0.0"); //Se crea una etiqueta donde se insertará el resultado de la operación
        panelResult.add(campoResultado); //Se inserta la etiqueta del resultado numerico dentro del panel de "panelResult"

        //SE AÑADE A LA VENTANA TODOS LOS PANELES
        ventana.add(panelPrimNum); //Se añade a la ventana el panel del primer número ...
        ventana.add(panelSegNum);
        ventana.add(operacionesBotones);
        ventana.add(panelResult); //...

        //SE CREA LA FUNCIÓN PARA DARLE UNA ACCIÓN A LOS BOTONES
        ActionListener operador = new ActionListener() {  // Se llama a la clase "ActionListener" para darle a los botones una funcionalidad, el método se llamará operador
            
            @Override
            public void actionPerformed(ActionEvent e) { 
                
                try {

                    double num1 = Double.parseDouble(campoNum1.getText()); //Crea una variable de tipo double, cambia el texto en String del campo de texto del primer número a un tipo double y guarda este número en la variable creada
                    double num2 = Double.parseDouble(campoNum2.getText());
                    double resultado = 0; //Crea una variable de tipo double iniciandola a 0

                        if (e.getSource() == botonSuma) { // Compara el objeto que solicita la acción, y si es igual hace la operación inferior
                            resultado = num1 + num2; //Guarda en la variable resultado la suma del numero 1 y el numero 2
                        } 
                        
                        else if (e.getSource() == botonResta) {
                            resultado = num1 - num2;
                        } 
                        
                        else if (e.getSource() == botonMulti) {
                            resultado = num1 * num2;
                        } 
                        
                        else if (e.getSource() == botonDivi) {

                            if (num2 == 0) {
                                // Si el segundo número insertado es un 0 aparecerá un ventana con un mensaje de error
                                JOptionPane.showMessageDialog(null, "No se puede dividir por 0", "Mensaje de Error", 0);
                            }
                                resultado = num1 / num2;
                        }

                    campoResultado.setText(String.valueOf(resultado)); //Imprime en la etiqueta del resultado el valor que da la variable "resultado" transformandola en String
                } 
                
                catch (NumberFormatException exc) 
                {
                    //Si se imprime un carácter inválido en los cuadros de texto aparecerá una ventana con un mensaje de error
                    JOptionPane.showMessageDialog(null, "Ha insertado un caracter inválido", "Mensaje de Error", 0);
                }
            }
        };

        //SE AÑADE LAS FUNCIONALIDADES, CREADAS ANTERIORMENTE, A LOS BOTONES
        botonSuma.addActionListener(operador); //añade al boton suma la instruccion que tiene el método "operador"
        botonResta.addActionListener(operador);
        botonMulti.addActionListener(operador);
        botonDivi.addActionListener(operador);

        ventana.setVisible(true); //SE HACE VISIBLE LA VENTANA

    }
}