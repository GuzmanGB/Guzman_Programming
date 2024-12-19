package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in); 
        String jugarAgain;
       
    do{
        int numero = 0;
        int cuenta = 0;        
        int suma = 0;

        try 
            {
                System.out.println("Inserta un numero entero positivo");  
                numero = sc.nextInt();

                    while(numero<0)
                                {
                                System.out.println("Debe ingresar obligatoriamente un número positivo");
                                numero = sc.nextInt();
                                }
                            
                            for (int i=1; i<=numero; i++) 
                                    {
                                        if(i%2==0)
                                        {
                                            System.out.println(i);
                                            cuenta++;
                                            suma = suma + i;
                                        }           
                                    }
                                  
                            System.out.println("La suma de estos numeros es: " + suma);
                            System.out.println("Hay un total de " + cuenta + " números pares");
            } 
        catch(Exception e){
                    System.out.println("Debe ingresar obligatoriamente un número entero");
                    jugarAgain = sc.next(); 
                }        
                System.out.println("¿Quiere ejecutar el programa de nuevo? (si/no): ");
                jugarAgain = sc.next();                     
        }
        while(jugarAgain.equals("si"));{
                    System.out.println("Programa terminado.");
                    sc.close();
                }

                
    }
}
