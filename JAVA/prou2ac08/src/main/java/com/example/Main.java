package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroProductos;
        int opcion;
        boolean encontrado = false;
        boolean salir = false;

        System.out.println("Ingrese la cantidad de productos a guardar: ");
        numeroProductos = scanner.nextInt();

        String[] nombreProducto = new String[numeroProductos];
        double[] precioProducto = new double[numeroProductos];
        int[] stock = new int[numeroProductos];

        for (int i = 0; i < numeroProductos; i++) {
            scanner.nextLine();
            System.out.println("Ingrese el nombre del producto: ");
            nombreProducto[i] = scanner.nextLine();

            System.out.print("Precio: ");
            precioProducto[i] = scanner.nextDouble();

            System.out.print("Stock: ");
            stock[i] = scanner.nextInt();
        }

        while (!salir) {
            System.out.println("1. Mostrar Inventario");
            System.out.println("2. Buscar Producto");
            System.out.println("3. Actualizar Stock de un Producto");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Este es el inventario: ");
                    for (int i = 0; i < nombreProducto.length; i++) {
                        System.out.println("Nombre del producto: " + nombreProducto[i]);
                        System.out.println("Precio del producto: " + precioProducto[i]);
                        System.out.println("Stock del producto: " + stock[i]);
                        System.out.println("\n");
                    }
                    break;

                case 2:
                    System.out.println("Que producto desea buscar: ");
                    String busqueda = scanner.next();

                    for (int i = 0; i < nombreProducto.length; i++) {
                        if (nombreProducto[i].equalsIgnoreCase(busqueda)) {
                            System.out.println("Producto encontrado:");
                            System.out.println("Producto: " + nombreProducto[i] + "\n Precio: " + precioProducto[i]
                                    + " \n Stock: " + stock[i]);
                            encontrado = true;
                            break;
                        } else if (!encontrado) {
                            System.out.println("Producto no encontrado.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Que producto desea actualizar su stock: ");
                    busqueda = scanner.next();

                    for (int i = 0; i < nombreProducto.length; i++) {
                        if (nombreProducto[i].equalsIgnoreCase(busqueda)) {
                            System.out.println("Producto encontrado:");
                            System.out.println("Producto: " + nombreProducto[i] + "\n Precio: " + precioProducto[i]
                                    + " \n Stock: " + stock[i]);
                            System.out.println("Indique el stock para cambiar:");
                            stock[i] = scanner.nextInt();
                            System.out.println("El stock del producto: " + nombreProducto[i] + " ha sido cambiado a : "
                                    + stock[i]);
                            encontrado = true;
                            break;
                        } else if (!encontrado) {
                            System.out.println("Producto no encontrado.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Usted va a salir");
                    salir = true;
                    break;

                default:
                    System.out.println("Esto no es una opción, vuelve a escoger");
                    break;
            }
        }
        scanner.close();
    }
}