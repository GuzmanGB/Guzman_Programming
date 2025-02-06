package com.example;

public class Main {
    public static void main(String[] args) {

        int[][] matriz = {
                { 2, 2, 3 },
                { 43, 53, 6 },
                { 72, 82, 9 }
        };

        int numMax = matriz[0][0];
        int numMin = matriz[0][0];
        int tamañoFil = 0;
        int tamañoCol = 0;
        int sumNum = 0;
        int mediaVal = 0;

        tamañoFil = matriz.length;
        System.out.println("Este es el número de filas de la matriz: " + tamañoFil);

        for (int i = 0; i < tamañoFil; i++) {

            tamañoCol = matriz[i].length;
            System.out.println("Este es el numero de columnas de la matriz: " + tamañoCol);

            for (int j = 0; j < tamañoCol; j++) {
                System.out.println(matriz[i][j]);
                sumNum += matriz[i][j];
                mediaVal = sumNum / matriz[i][j];

                if (matriz[i][j] > numMax) {
                    numMax = matriz[i][j];
                }
                if (matriz[i][j] < numMin) {
                    numMax = matriz[i][j];
                }
            }
            System.out.println("");
        }

        System.out.println("Esta es la suma de todos los números: " + sumNum);
        System.out.println("Esta es la media de todos los números: " + mediaVal);
        System.out.println("Este es el número máximo de la matriz: " + numMax);
        System.out.println("Esta es la número mínimo de la matriz: " + numMin);
    }
}