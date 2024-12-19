package com.example;

import java.util.Random;
import java.util.Scanner;


public class Main { 
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);            
    String jugarAgain;
    Random random = new Random();

    do {
    int numAleatorio = random.nextInt(100) + 1;
    int numeroUser = 0;
    int intentos = 1;


    System.out.println("Inserta un numero del 1 al 100");
        numeroUser = sc.nextInt();

    while(numAleatorio!=numeroUser)
        {
           if (numeroUser<1 || numeroUser>100)
           {
            System.out.println("El numero tiene que ser entre 1 y 100, vuelve a insertar: ");
            numeroUser = sc.nextInt();
            }

            else
                {

                if(numeroUser>numAleatorio)
                    {
                        System.out.println("Tu numero es menor, vuelve a insertar otro: ");
                        numeroUser = sc.nextInt();
                    }
                    
                    else
                        {
                            System.out.println("Tu numero es mayor, vuelve a insertar otro: ");
                            numeroUser = sc.nextInt();
                        }   
                        
                }
                        
                ++intentos;
        }

        System.out.println("Enhorabuena has acertado el numero en " + intentos + " intentos. " + "El numero era: " + numAleatorio);
    
        System.out.println("¿Quiere jugar de nuevo? (si/no): ");
        jugarAgain = sc.next();
           
        }
            while(jugarAgain.equals("si"));{
        
            System.out.println("Gracias por jugar.");
            sc.close();
            }
    }
}