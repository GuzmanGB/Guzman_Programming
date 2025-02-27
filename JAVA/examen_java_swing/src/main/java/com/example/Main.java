package com.example;

//Se importan todas las clases de java necesarias para el programa
import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {

        // VENTANA
        JFrame frame = new JFrame("Reservas de Hotel"); // Se crea una ventana para albergar todos los objetos
                                                        // posteriormente creados (con el titulo de "Reservas de Hotel")
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Se crea una operación para poder cerrar la ventana
                                                              // cuando sea visible
        frame.setSize(500, 500); // Se establece el tamaño de la ventana
        frame.setLayout(new GridLayout(7, 1)); // Se establecen 7 filas de GridLayout y 1 columna para ordenar los
                                               // objetos
        frame.setLocationRelativeTo(null); // Hace que la ventana aparezca en medio de la pantalla del usuario
        frame.setResizable(false); // Hace que el usuario no pueda poner en pantalla completa la ventana

        // NOMBRE
        JPanel panelNombre = new JPanel(new GridBagLayout()); // Se crea un panel nuevo iniciado con un GridLayout para
                                                              // ordenarlo dentro de la ventana
        JLabel labelNombre = new JLabel("Nombre:    "); // Se crea una etiqueta de texto donde pondrá "Nombre:"
        JTextField fielNombre = new JTextField(15); // Se crea un cuadro de texto con una medida de longitud de 15
                                                    // columnas
        panelNombre.add(labelNombre); // Se añaden al panel los objetos anteriormente creados
        panelNombre.add(fielNombre);

        // DNI
        JPanel panelDNI = new JPanel(new GridBagLayout()); // Mismo funcionamiento que el anterior panel pero ahora se
                                                           // añade un label vacio que se rellenará mas tarde
        JLabel labelDNI = new JLabel("DNI:    ");
        JTextField fielDNI = new JTextField(15);
        JLabel labelOKKO = new JLabel("");
        panelDNI.add(labelDNI);
        panelDNI.add(fielDNI);
        panelDNI.add(labelOKKO);

        // DATE
        JPanel panelDate = new JPanel(new GridBagLayout()); // Se crea un panel nuevo (mismo funcionamiento que los dos
                                                            // anteriores)
        JLabel labelDate = new JLabel("Fecha Check-in: (dd/MM/yyyy) ");
        JTextField fieldDate = new JTextField("20/02/2025", 15); // Se crea un cuadro de texto iniciado con una fecha
                                                                 // dentro
        panelDate.add(labelDate);
        panelDate.add(fieldDate);

        // HOTEL SELECCION
        JPanel panelHoteles = new JPanel(new GridBagLayout()); // Este panel será diferente ya que albergará una caja
                                                               // para que el usuario escoja diferentes Hoteles
        JLabel labelHotel = new JLabel("Hotel:    ");
        String[] hoteles = new String[] { "Hotel Mar", "Hotel Illa", "Hotel Muntanya" }; // Se inicia una variable de
                                                                                         // tipo array para guardar
                                                                                         // datos de tipo "String" para
                                                                                         // usar posteriormente
        JComboBox<String> comboBoxHotel = new JComboBox(hoteles); // Se inicia un objeto de tipo JComboBox que albergará
                                                                  // los datos del anterior array creado
        panelHoteles.add(labelHotel);
        panelHoteles.add(comboBoxHotel);
        // HOTEL SELECCION

        // SLIDER
        JPanel panelNoches = new JPanel(new GridBagLayout()); // En este panel se añadirá un objeto Slider que indicará
                                                              // las noches disponibles de cada hotel, dependiendo del
                                                              // hotel escogido en el ComboBox, las noches cambiarán
        JSlider nocheSlider = new JSlider(1, 7); // Crea un objeto Slider con unos valores de 1 a 7
        nocheSlider.setPaintTicks(true); // Debajo del slider se pinta unos ticks para representar visualmente el tamaño
                                         // del slider
        nocheSlider.setPaintLabels(true); // Funciona similar al anterior pero ahora pintará los numeros respectivos
                                          // debajo de los ticks
        nocheSlider.setMajorTickSpacing(1); // Indica a los ticks la medida máxima que hay de saltos entre los ticks
        nocheSlider.setMinorTickSpacing(0);// Indica a los ticks la medida mínima que hay de saltos entre los ticks
        panelNoches.add(nocheSlider);
        // SLIDER

        // INFO
        JPanel panelBotonRes = new JPanel(new GridBagLayout()); // En este punto se crean dos paneles para dar
                                                                // funcionalidad en un botón sobre una etiqueta vacía,
                                                                // la cual posteriormente se rellenará
        JButton botonReserva = new JButton("Guardar reserva");
        panelBotonRes.add(botonReserva);
        JPanel panelInfo = new JPanel(new GridBagLayout());
        JLabel labelInfo = new JLabel("");
        panelInfo.add(labelInfo);
        // INFO

        fielDNI.addKeyListener(new KeyAdapter() { // Se crea un método de KeyListener sobre el cuadro de texto de
                                                  // "fielDNI"
            /**
             * Comprova si un DNI és vàlid.
             * Un DNI vàlid ha de tenir 8 dígits seguits d'una lletra (excepte I, O, U i Ñ).
             * La lletra es calcula amb el mòdul 23 del número.
             *
             * El DNI a validar en format "12345678X".
             * devuelve true si el DNI és vàlid, false en cas contrari.
             */

            public static boolean validarDNI(String dni) { // E
                return dni.matches("\\d{8}[A-HJ-NP-TV-Za-hj-np-tv-z]") && "TRWAGMYFPDXBNJZSQVHLCKE"
                        .charAt(Integer.parseInt(dni.substring(0, 8)) % 23) == Character
                                .toUpperCase(dni.charAt(8));
            }

            @Override
            public void keyReleased(KeyEvent e) { // En este método cuando se suelta una tecla del campo de texto
                                                  // imprime en la etiqueta de "labelOKKO" una cosa u otra dependiendo
                                                  // de si el método de "validarDNI" devuelve "true" o "false"
                String dni = fielDNI.getText();
                if (validarDNI(dni) == true) {
                    labelOKKO.setText("OK");
                } else {
                    labelOKKO.setText("KO");
                }
            }
        });

        fieldDate.addFocusListener(new FocusAdapter() { // Se crea un método de FocusListener sobre el cuadro de texto
                                                        // de "fieldDate"

            /**
             * Verifica si una data introduïda en format "dd/MM/yyyy" és vàlida.
             * La data ha de tenir el format correcte i no pot ser anterior a la data
             * actual.
             * La data en format "dd/MM/yyyy".
             * Devuelve true si la data és vàlida i no és anterior a avui, false en cas
             * contrari.
             */
            public static boolean esDataValida(String dataString) {

                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate dataEntrada = LocalDate.parse(dataString, formatter);

                    return !dataEntrada.isBefore(LocalDate.now());
                }

                catch (DateTimeParseException e) {
                    return false;
                }
            }

            @Override
            public void focusLost(FocusEvent e) { // En este método cuando se pierde el foco del campo de texto sale un
                                                  // mensaje de error dependiendo de si este campo de texto tiene una
                                                  // fecha anterior a la actual o si está vacío
                if (esDataValida(fieldDate.getText()) == false || fieldDate.getText() == null) {
                    if (esDataValida(fieldDate.getText()) == false) {
                        JOptionPane.showMessageDialog(null, "La fecha es anterior a la actual", "Error", 0);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se puede dejar en blanco", "Error", 0);
                    }
                }
            }

        });

        comboBoxHotel.addActionListener((e) -> { // Se crea un método de ActionListener el cual al seleccionar un item u
                                                 // otro dentro del checkBox cambia los valores máximos del slider

            String hotelSeleccionado = (String) comboBoxHotel.getSelectedItem();
            if ("Hotel Mar".equals(hotelSeleccionado)) {
                nocheSlider.setMaximum(7);
                nocheSlider.setMajorTickSpacing(1);
                nocheSlider.setMinorTickSpacing(0);
                nocheSlider.setPaintTicks(true);
                nocheSlider.setPaintLabels(true);

            }

            else if ("Hotel Illa".equals(hotelSeleccionado)) {
                nocheSlider.setMaximum(15);
                nocheSlider.setMajorTickSpacing(1);
                nocheSlider.setMinorTickSpacing(0);
                nocheSlider.setPaintTicks(true);
                nocheSlider.setPaintLabels(true);
            }

            else if ("Hotel Muntanya".equals(hotelSeleccionado)) {
                nocheSlider.setMaximum(30);
                nocheSlider.setMajorTickSpacing(1);
                nocheSlider.setMinorTickSpacing(0);
                nocheSlider.setPaintTicks(true);
                nocheSlider.setPaintLabels(true);
            }
        });

        nocheSlider.addChangeListener((e) -> { // Cuando se llega a un valor maximo dentro del slider sale una pantalla
                                               // como mensaje de Advertencia

            String hotelSeleccionado = (String) comboBoxHotel.getSelectedItem();
            int noches = nocheSlider.getValue();

            if ("Hotel Mar".equals(hotelSeleccionado) && noches == 7) {
                JOptionPane.showMessageDialog(null, "Estadía máxima en este hotel", "Advertencia", 1);
            }

            else if ("Hotel Illa".equals(hotelSeleccionado) && noches == 15) {
                JOptionPane.showMessageDialog(null, "Estadía máxima en este hotel", "Advertencia", 1);
            }

            else if ("Hotel Muntanya".equals(hotelSeleccionado) && noches == 30) {
                JOptionPane.showMessageDialog(null, "Estadía máxima en este hotel", "Advertencia", 1);
            }

        });

        botonReserva.addActionListener(new ActionListener() { // Se crea un método para añadir todos los datos de la
                                                              // reserva del hotel al darle al boton

            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = fielNombre.getText();
                String DNI = fielDNI.getText();
                String date = fieldDate.getText();
                String hotel = (String) comboBoxHotel.getSelectedItem();
                int noches = nocheSlider.getValue();
                labelInfo.setText(
                        "Reserva: " + nombre + ", " + DNI + ", " + date + ", " + hotel + ", " + noches + " noches");
            }
        });

        frame.add(panelNombre); // Se añaden todos los paneles creados a la ventana y se hace la ventana visible
        frame.add(panelDNI);
        frame.add(panelDate);
        frame.add(panelHoteles);
        frame.add(panelNoches);
        frame.add(panelBotonRes);
        frame.add(panelInfo);
        frame.setVisible(true);
    }
}