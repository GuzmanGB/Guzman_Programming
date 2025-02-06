/**************************************/
/* Nom: Guzman Garcia Borsani         */
/* DNI/NIE: 45371302F                 */
/* Data: 17/10/2024                   */
/* Exercici: PROU2EX02                */
/**************************************/

package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); /*
                                              * A partir de la creación del escaner empiezo a establecer las variables
                                              * que se usarán en el programa.
                                              */
        String again; /*
                       * Se crea una variable "String" para que se pueda volver a ejecutar el
                       * programa.
                       */
        double numUser1 = 0; /*
                              * Creo las dos variables para guardar los numeros que quiera operar el usuario,
                              * como hay operaciones que pueden dar decimal, creo estas variables como
                              * double.
                              */
        double numUser2 = 0;
        int operación = 0; /*
                            * Esta variable int será la que permita ejectutar el switch cuando el usuario
                            * inserte un número de los mostrados.
                            */
        double calculo = 0; /* Esta variable double será la que haga los cálculos de los dos números. */

        for (int contador = 1; contador <= 5; contador++) { /*
                                                             * En este punto se comienza la acción "for" donde se le
                                                             * dará el menu de las acciones que puede hacer el usuario.
                                                             * Además que añadirá el contador que permitirá ejecutar los
                                                             * cálculos un maximo de 5 veces.
                                                             */

            System.out.println("Elige la operación que quieras hacer, esta es la operacion numero " + contador
                    + ". Tiene un total de 5 operaciones.");
            System.out.println("Suma (5)");
            System.out.println("Restar (6)");
            System.out.println("Multiplicar (7)");
            System.out.println("Dividir (8)");
            System.out.println("Salir (9)");
            operación = sc.nextInt();

            while (operación < 5 || operación > 9) {
                System.out.println("Debe ingresar un numero entero positivo, vuelva a insertarlo");
                operación = sc.nextInt();
            }

            switch (operación) { /*
                                  * En esta línea se crea la accion "switch" para que el usuario pueda acceder a
                                  * la acción que solicitaba anteriormente en el "for".
                                  */

                case 5:
                    System.out.println("Usted quiere sumar, decida el primer número a sumar: ");
                    numUser1 = sc.nextInt(); /*
                                              * Dentro de el "case" del "switch" estarán las instrucciones para hacer
                                              * los calculos solicitados. Se le pide al usuario el primer número y el
                                              * segundo para poder efectuar la operación.
                                              */
                    System.out.println("Decida el segundo número a sumar: ");
                    numUser2 = sc.nextInt();
                    calculo = numUser1 + numUser2;
                    System.out.println("El resultado de sumar " + numUser1 + " por " + numUser2 + " es " + calculo);
                    break;

                case 6:
                    System.out.println("Usted quiere restar, decida el primer número a restar: ");
                    numUser1 = sc.nextInt();
                    System.out.println("Decida el segundo número a restar: ");
                    numUser2 = sc.nextInt();
                    calculo = (numUser1) - (numUser2);
                    System.out.println("El resultado de restar " + numUser1 + " por " + numUser2 + " es " + calculo);
                    break;

                case 7:
                    System.out.println("Usted quiere multiplicar, decida el primer número a multiplicar: ");
                    numUser1 = sc.nextInt();
                    System.out.println("Decida el segundo número a multiplicar: ");
                    numUser2 = sc.nextInt();
                    calculo = (numUser1) * (numUser2);
                    System.out.println("El resultado de multiplicar " + numUser1 + " por " + numUser2 + " es " + calculo);
                    break;

                case 8:
                    System.out.println("Usted quiere dividir, decida el primer número a dividir: ");
                    numUser1 = sc.nextInt();
                    System.out.println("Decida el segundo número a dividir: ");
                    numUser2 = sc.nextInt();
                    calculo = numUser1 / numUser2;
                    if (numUser2 == 0) { /*
                                          * En este "case", como la operación es una división, se le dirá al usuario que
                                          * si el segundo número es un 0 no podrá hacer la operación ya que no puede
                                          * dividir por ese número.
                                          */
                        System.out.println("No se puede dividir el numero " + numUser1 + " por 0");
                    } else {
                        System.out
                                .println("El resultado de dividir " + numUser1 + " por " + numUser2 + " es " + calculo);
                    }
                    break;

                case 9:
                    System.out.println("Usted va a salir"); /*
                                                             * En este caso, al insertar en el terminar el número 9, el
                                                             * usuario querrá salir y lo que se hará es asignar a la
                                                             * variable del for (contador) el numero 5 para que el
                                                             * programa se cierre.
                                                             */
                    contador = 5;
                    break;

                default:
                    System.out.println("Esto no es ninguna operación, cerrando programa");
                    contador = 5; /*
                                   * En el default si el usuario inserta un número que no esté en el rango
                                   * indicado, se le cerrará el programa
                                   */

                    sc.close();
            }

            if (contador == 5) { /*
                                  * En este "if" se especificará que cuando la variable contador sea 5 se cierre
                                  * el switch.
                                  */
                break;
            }

            System.out.println("Quiere hacer otra operación? Inserte si. Si no, inserte no");
            again = sc.next();
            /*
             * A partir de aquí se le solicita al usuario si quiere volver a hacer otra
             * operación tras hacer una operación anteriormente.
             */
            if (again.equals("si") || again.equals("no")) {

                if (again.equals("no")) {
                    System.out.println("Cerrando programa");
                    contador = 5;
                }

                else {
                    System.out.println("Has decidido si");
                }
            } else {
                System.out.println("No ha escogido si o no, se continuará el programa");
            }
        }
    }
}