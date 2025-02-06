package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");

        int numUser = 0;

        TV teleDelSalon = new TV();
        Movil movilJuan = new Movil();
        Patinete miPatinete = new Patinete();

        teleDelSalon.encender();
        teleDelSalon.apagar();

        teleDelSalon.volumenUp();
        teleDelSalon.volumenDown();

        teleDelSalon.canalUp();
        teleDelSalon.canalDown();

        movilJuan.encenderMovil();

        miPatinete.encender();
        miPatinete.apagar();

        miPatinete.getVelocidad();

        System.out.println("A que velocidad quiere ir");
        
        miPatinete.setVelocidad(sc.nextInt());              
        

    }
}