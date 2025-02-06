package com.example;

public class Main {
    public static void main(String[] args) {
        int sumNum = 0;
        int tamaño = 0;
        int posicionMax = 0;
        int posicionMin = 0;
        int mediaVal = 0;
        int[] arrayNum = { 12, 165, 7, 333, 45, 53, 68, 200, 1, 15, 21 };
        int numMax = arrayNum[0];
        int numMin = arrayNum[0];
        tamaño = arrayNum.length;
        System.out.println("Esto son los números dentro de este array: ");

        for (int i = 0; i < tamaño; i++) {
            System.out.println(arrayNum[i]);

            if (arrayNum[i] > numMax) {
                numMax = arrayNum[i];
                posicionMax = i;
            }
            if (arrayNum[i] < numMin) {
                numMin = arrayNum[i];
                posicionMin = i;
            }
            sumNum = sumNum + arrayNum[i];
            mediaVal = sumNum / tamaño;

        }
        System.out.println("Este es el orden inverso del array: ");

        for (int i = tamaño - 1; i >= 0; i--) {
            System.out.println(arrayNum[i]);
        }
        System.out.println("Este es el numero más grande: " + numMax + ", y esta es su posición: " + posicionMax);
        System.out.println("Este es el numero más pequeño: " + numMin + ", y esta es su posición: " + posicionMin);
        System.out.println("Esta es la suma de todos los números: " + sumNum);
        System.out.println("Esta es la media de todos los números: " + mediaVal);

    }
}
