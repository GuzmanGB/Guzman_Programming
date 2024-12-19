package com.example;

import java.util.Scanner;

public class GlobalVarsDemo {
        
        private static int ANY = 2024; 
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);            
            System.out.println("Inserta tu año de Nacimiento");
            int año = 0;    
            año = sc.nextInt(); 
            int edad = ANY - año;
            System.out.println(8-3-(-5)*2 );

            if (año>ANY)
                {
                    System.out.println("El año insertado es incorrecto");
                }
                else if (edad > 18) 
                    {
                    System.out.println("Eres mayor de edad"); 
                    System.out.println("Tienes " + edad + " años");  
                    } 
                
                    else if (edad == 18){
                        System.out.println("Tienes " + edad + " años");
                    } 
                    else 
                        {
                        System.out.println("Eres menor de edad");
                        System.out.println("Tienes " + edad + " años");
                        }
              
                }

            
    }
