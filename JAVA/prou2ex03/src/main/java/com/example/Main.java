/**************************************/
/* Nom: Guzman Garcia Borsani         */
/* DNI/NIE: 45371302F                 */
/* Data: 18/10/2024                   */
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
                              * En este punto se asigna una variable "double" para poder ejecutar las
                              * operaciones que quiera hacer el usuario.
                              */
        int operacion = 0; /*
                            * Esta variable int será la que permita ejectutar el switch cuando el usuario
                            * inserte un número de los mostrados.
                            */
        double calculo = 0; /*
                             * Esta variable double será la que haga los cálculos de las conversiones de
                             * moneda.
                             */

        do { /*
              * En esta línea ejecuto un do while para que el usuario pueda continuar el
              * programa todas las veces que quiera hasta que decida salir mediante la opción
              * que le sale en el menú siguiente.
              */
            try {
                System.out.println("Elige la conversión que quieras hacer");
                System.out.println("Dólares a Euros (7)");
                System.out.println("Dólares a Pesos Mexicanos (8)");
                System.out.println("Euros a Dólares (9)");
                System.out.println("Euros a Pesos Mexicanos (10)");
                System.out.println("Pesos Mexicanos a Dólares (11)");
                System.out.println("Pesos Mexicanos a Euros (12)");
                System.out.println("Franco Suizo a Euro (13)");
                System.out.println("Libras Esterlinas a Dolar (14)");
                System.out.println("Salir (15)");

                operacion = sc.nextInt();

                switch (operacion) { /*
                                      * En esta línea se crea la accion "switch" para que el usuario pueda acceder a
                                      * la acción que solicitaba anteriormente en el menú.
                                      */

                    case 7:
                        System.out.println("Usted quiere cambiar de Dólar a Euro");
                        System.out.println("Decida la cantidad a cambiar:");
                        numUser1 = sc.nextInt(); /* El usuario inserta la cantidad que quiere cambiar en esta línea. */
                        while (numUser1 < 0) { /*
                                                * En este "While" se le dice al usuario que no puede ejecutar una
                                                * conversión de números negativos y que vuelva a insertar la cantidad.
                                                */
                            System.out.println("No puede operar números negativos, vuelva a insertar");
                            numUser1 = sc.nextInt();
                        }
                        calculo = (numUser1 * 0.85); /*
                                                      * En este punto se hace la conversión de la cantidad ingresada por
                                                      * el usuario mediante una formula matemática.
                                                      */
                        System.out.println(numUser1 + " dólares en euros son. " + calculo + " euros"); /*
                                                                                                        * Y para
                                                                                                        * finalizar se
                                                                                                        * le dice al
                                                                                                        * usuario en
                                                                                                        * esta línea la
                                                                                                        * cantidad que
                                                                                                        * ha sido
                                                                                                        * cambiada.
                                                                                                        */
                        break;

                    case 8:
                        System.out.println("Usted quiere cambiar de Dólar a Peso Mexicano");
                        System.out.println("Decida la cantidad a cambiar:");
                        numUser1 = sc.nextInt();
                        while (numUser1 < 0) {
                            System.out.println("No puede operar números negativos, vuelva a insertar");
                            numUser1 = sc.nextInt();
                        }
                        calculo = (numUser1 * 20);
                        System.out.println(numUser1 + " dólares en pesos mexicanos son. " + calculo + " pesos mexicanos");
                        break;

                    case 9:
                        System.out.println("Usted quiere cambiar de Euro a Dólar");
                        System.out.println("Decida la cantidad a cambiar:");
                        numUser1 = sc.nextInt();
                        while (numUser1 < 0) {
                            System.out.println("No puede operar números negativos, vuelva a insertar");
                            numUser1 = sc.nextInt();
                        }
                        calculo = (numUser1 * 1.18);
                        System.out.println(numUser1 + " euros en dólares son. " + calculo + " dólares");
                        break;

                    case 10:
                        System.out.println("Usted quiere cambiar de Euro a Peso Mexicano");
                        System.out.println("Decida la cantidad a cambiar:");
                        numUser1 = sc.nextInt();
                        while (numUser1 < 0) {
                            System.out.println("No puede operar números negativos, vuelva a insertar");
                            numUser1 = sc.nextInt();
                        }
                        calculo = (numUser1 * 23.50);
                        System.out.println(numUser1 + " euros en pesos mexicanos son. " + calculo + " pesos Mexicanos");
                        break;

                    case 11:
                        System.out.println("Usted quiere cambiar de Pesos Mexicanos a Dólares");
                        System.out.println("Decida la cantidad a cambiar:");
                        numUser1 = sc.nextInt();
                        while (numUser1 < 0) {
                            System.out.println("No puede operar números negativos, vuelva a insertar");
                            numUser1 = sc.nextInt();
                        }
                        calculo = (numUser1 * 0.05);
                        System.out.println(numUser1 + " pesos mexicanos en dólares son. " + calculo + " dólares");
                        break;

                    case 12:
                        System.out.println("Usted quiere cambiar de Pesos Mexicanos a Euros");
                        System.out.println("Decida la cantidad a cambiar:");
                        numUser1 = sc.nextInt();
                        while (numUser1 < 0) {
                            System.out.println("No puede operar números negativos, vuelva a insertar");
                            numUser1 = sc.nextInt();
                        }
                        calculo = (numUser1 * 0.042);
                        System.out.println(numUser1 + " pesos mexicanos en euros son. " + calculo + " euros");
                        break;

                    case 13:
                        System.out.println("Usted quiere cambiar de Francos Suizos a Euros");
                        System.out.println("Decida la cantidad a cambiar:");
                        numUser1 = sc.nextInt();
                        while (numUser1 < 0) {
                            System.out.println("No puede operar números negativos, vuelva a insertar");
                            numUser1 = sc.nextInt();
                        }
                        calculo = (numUser1 * 1.06);
                        System.out.println(numUser1 + " francos suizos en euros son. " + calculo + " euros");
                        break;

                    case 14:
                        System.out.println("Usted quiere cambiar de Libras Esterlinas a Dólares");
                        System.out.println("Decida la cantidad a cambiar:");
                        numUser1 = sc.nextInt();
                        while (numUser1 < 0) {
                            System.out.println("No puede operar números negativos, vuelva a insertar");
                            numUser1 = sc.nextInt();
                        }
                        calculo = (numUser1 * 1.30);
                        System.out.println(numUser1 + " libras esterlinas en dolares son. " + calculo + " dolares");
                        break;

                    case 15: /* En el caso 15 el usuari decide salir y se le avisa con el print line. */
                        System.out.println("Usted va a salir");
                        break;

                    default: /*
                              * Si el usuario llega a insertar algun número de los que no están especificados
                              * arriba se le avisará de que no hay operación para ello.
                              */
                        System.out.println("Esto no es ninguna operación");
                }
            } catch (Exception e) { /*
                                     * En este punto se cierra el try/catch diciendo al usuario que no puede
                                     * insertar letras y que debe insertar números enteros.
                                     */
                System.out.println("Debe ingresar obligatoriamente un número entero positivo");
                again = sc.next();
            }
            if (operacion == 15) { /*
                                    * En esta línea uso un "if" para que si el usuario escoge la opción de salir,
                                    * cierre el programa con el "break".
                                    */
                break;
            } else if (numUser1 < 0) { /*
                                        * En esta línea especifico al usuario que no se puede operar con números
                                        * negativos.
                                        */
                System.out.println("No se puede operar con numero negativo");
            } else { /*
                      * En esta línea el programa termina y se le pregunta al usuario si quiere
                      * volver a ejecutarlo o no.
                      */
                System.out.println("¿Quiere ejecutar el programa de nuevo? (si/no): ");
            }
            again = sc.next();
            if (again.equals("si") || again.equals("no")) {
                if (again.equals("no")) { /* Si decide el usuario decir "no", el programa se cerrará con el break. */
                    System.out.println("Cerrando programa");
                    break;
                } else { /*
                          * Si decide decir "si", el programa continuará y volverá arriba gracias al
                          * "do/while".
                          */
                    System.out.println("Has decidido si");
                }
            } else { /*
                      * Si el usuario al esquibir "si/no" se equivoca se le avisará de que no ha
                      * escogido esas opciones y se cerrará el programa.
                      */
                System.out.println("No ha escogido si o no, se cerrará el programa");
            }
        } while (again.equals("si"));
        { /*
           * Con este "while" si en la variable "again" el usuario inserta la palabra "si"
           * el programa continuará, si escribe "no" se cerrará.
           */
            System.out.println("Programa terminado.");
            sc.close();
        }
    }
}