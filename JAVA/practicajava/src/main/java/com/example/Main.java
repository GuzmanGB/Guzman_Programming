package com.example;


import java.util.Scanner;

public class Main {
        
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        double volumen = 0;
        double altura = 0;
        double Ab = 0;
        double AB = 0;

        
        System.out.println("Altura?");
        altura = sc.nextInt();
      
        System.out.println("Area base?");
        AB = sc.nextInt();

        System.out.println("Area Base arriba?");
        Ab = sc.nextInt();
        

        volumen = altura/3 * (AB + Ab + (Math.sqrt(AB*Ab)));
        System.out.println("El volumen de este tronco de piramida es: " + volumen);
    }
}