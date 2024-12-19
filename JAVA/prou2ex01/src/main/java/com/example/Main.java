/**************************************/
/* Nom: Guzman Garcia Borsani 	      */
/* DNI/NIE: 45371302F 			      */
/* Data: 10/10/2024 			      */
/* Exercici: PROU2EX01				  */
/**************************************/

package com.example;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in); 
        String jugarAgain;
        int numero = 0;
        /*En este punto ejecuto el scanner y creo las variables que se van a usar en el ejercicio.*/
    do{ /*Se abre una instrucción "do/while" que permitirá al usuario al final del programa volver a ejecutarlo si inserta la palabra "si". Si inserta la palabra "no" se cerrará el programa.*/
        
        try{ /*Aquí comienza el comando try que funcionará en el caso de que el usuario inserte un caracter que no sea un número entero, la respuesta saldrá por al instrucción catch.*/
            System.out.println("Inserta un número entero positivo.");   /*Solicito por terminal al user que inserte un número.*/
            numero = sc.nextInt(); /*Este comando permite al usuario insertar el numero en el terminal. Se almacenará en la variable de tipo int "numero".*/
                while(numero<0){ /*Se ejecuta el comando while que hará que si el usuario inserta un numero negativo le solicita que lo vuelva a repetir.*/
                        System.out.println("Debe ingresar obligatoriamente un número entero positivo.");
                        numero = sc.nextInt();
                        }
                            for (int parIm=1; parIm<=numero; parIm++){ /*Aqui comenzará la ejecución del programa que calculará los numeros pares e impares desde el numero 1 hasta el numero entero que ha insertado el usuario.*/  
                                if(parIm%2==0){
                                        System.out.println("Este número " + parIm + " es par.");
                                    }
                                    else{
                                        System.out.println("Este número " + parIm + " es impar.");
                                        }                                   
                                }                           
            }
        catch(Exception e){ /*En el momento que el usuario ingresa un caracter que no sea un numero entero, saltará un error en el catch que le diga que no puede hacer eso y le dirá de reiniciar el programa si el usuario lo solicita.*/
                System.out.println("Debe ingresar obligatoriamente un número entero.");
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
