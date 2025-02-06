package com.example;

import java.util.Scanner;

public class Main {
        
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       

        System.out.println("Escribe una frase que contenga Hello");
        String frase = sc.nextLine();

        System.out.println("Tu frase en mayusculas es: " + frase.toUpperCase());
        System.out.println("Tu frase en minusculas es: " + frase.toLowerCase());
        System.out.println("Tu frase tiene estas letras: " + frase.length());
        System.out.println("Tu frase contiene la palabra Hello: " + frase.startsWith("Hello"));
        System.out.println("Hello es cambiado por Hola: " + frase.replace("Hello", "Hola"));

            
    }
}