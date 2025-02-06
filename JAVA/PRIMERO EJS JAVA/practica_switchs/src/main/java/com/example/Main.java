package com.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    
        
         int dia = 0;
        

        System.out.println("Inserta un numero del 1 al 7");
        Scanner sc = new Scanner(System.in);            
        dia = sc.nextInt();

    switch(dia) {

            case 1:
            System.out.println("Lunes");
            break;
            
            case 2:
            System.out.println("Martes");
            break;
            
            case 3:
            System.out.println("Miercoles");
            break;

            case 4:
            System.out.println("Jueves");
            break;

            case 5:
            System.out.println("Viernes");
            break;

            case 6:
            System.out.println("Sabado");
            break;

            case 7:
            System.out.println("Domingo");
            break;

            
            default:
            System.out.println("Esto no esta dentro de la semana");
  
            }

    if (dia<1 || dia>100)
            {
             System.out.println("");
            }
 
             else
                 {
 
                 if(dia>=1)
                     {
                         System.out.println("Dia Laboral");
                     }
                     
                     else
                         {
                             System.out.println("Fin de Semana");
                         }   
                         
                 }
              
                
        sc.close();

    }
}