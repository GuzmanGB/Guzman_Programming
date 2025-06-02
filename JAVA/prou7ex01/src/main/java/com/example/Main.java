package com.example;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Main extends JFrame {
    private JTextField nombreFicheroField; // Campo de texto para ingresar el nombre del archivo
    private JTextArea areaTexto; // Área de texto para mostrar y editar el contenido del archivo
    private JCheckBox anadirCheck; // Checkbox para determinar si se añade o se sobrescribe el archivo
    private JButton leerButton; // Botón para leer el archivo
    private JButton escribirButton; // Botón para escribir en el archivo

    public Main() {
        // Configuración de la ventana principal
        setTitle("Editor de ficheros de texto");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setResizable(false); 

        // Panel superior
        JPanel panelSuperior = new JPanel(new BorderLayout()); // Panel con diseño
        panelSuperior.add(new JLabel("Nombre del fichero:"), BorderLayout.WEST); // Etiqueta a la izquierda

        // Campo de texto para ingresar el nombre del archivo
        nombreFicheroField = new JTextField();
        panelSuperior.add(nombreFicheroField, BorderLayout.CENTER); // Añade el campo de texto al centro del panel
        add(panelSuperior, BorderLayout.NORTH); // Añade el panel superior a la parte norte de la ventana


        // Panel central
        areaTexto = new JTextArea(); // Crea un área de texto
        JScrollPane scroll = new JScrollPane(areaTexto); // Envuelve el área de texto en un JScrollPane para permitir desplazamiento
        add(scroll, BorderLayout.CENTER); // Añade el JScrollPane al centro de la ventana


        // Panel inferior
        JPanel panelInferior = new JPanel(); // Panel para los botones y el checkbox
        leerButton = new JButton("Leer"); // Botón para leer el archivo
        escribirButton = new JButton("Escribir"); // Botón para escribir en el archivo
        anadirCheck = new JCheckBox("Añadir"); // Checkbox para decidir si se añade o se sobrescribe

        // Añade los botones y el checkbox al panel inferior
        panelInferior.add(leerButton);
        panelInferior.add(escribirButton);
        panelInferior.add(anadirCheck);
        add(panelInferior, BorderLayout.SOUTH); // Añade el panel inferior a la parte sur de la ventana

        // Acción de leer en el botón
        leerButton.addActionListener(e -> {
            // Obtiene el nombre del archivo desde el campo de texto
            String nombreFichero = nombreFicheroField.getText();
            File fichero = new File(nombreFichero); // Crea un objeto File con el nombre del archivo

            // Verifica si el archivo existe
            if (!fichero.exists()) {
                JOptionPane.showMessageDialog(this, "El fichero no existe", "Error", JOptionPane.ERROR_MESSAGE);
                // Muestra un mensaje de error si el archivo no existe
                return;
            }

            // Lee el archivo
            try (BufferedReader lector = new BufferedReader(new FileReader(fichero))) {
                areaTexto.setText(""); // Limpia el área de texto antes de mostrar el contenido
                String linea;
                while ((linea = lector.readLine()) != null) { // Lee línea por línea el archivo
                    areaTexto.append(linea + "\n"); // Añade cada línea al área de texto
                }
            } catch (IOException ex) {
                // Si ocurre un error al leer el archivo, muestra un mensaje de error
                JOptionPane.showMessageDialog(this, "Error leyendo el fichero", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Accion del botón de Escribir
        escribirButton.addActionListener(e -> {
            // Obtiene el nombre del archivo
            String nombreFichero = nombreFicheroField.getText();
            boolean anadir = anadirCheck.isSelected(); // Verifica si el checkbox Añadir está seleccionado mediante un booleano

            // Trata de empezar a escribir el contenido del área de texto en el archivo
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreFichero, anadir))) { // Si ha ido bien el
                escritor.write(areaTexto.getText()); // Escribe el texto del área en el archivo
                // Muestra un mensaje de éxito
                JOptionPane.showMessageDialog(this, "Texto escrito correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (IOException ex) {
                // Si ocurre un error al escribir el archivo, muestra un mensaje de error
                JOptionPane.showMessageDialog(this, "Error escribiendo el fichero", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    // Método que inicia la aplicación
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }
}
