package com.example;

import java.util.Scanner;

public class Patinete {

    Scanner sc = new Scanner(System.in);

    private boolean isOn;
    private int velocidad;
    private int orientacion;

    public Patinete() {
        this.isOn = true;
        this.velocidad = 10;
        this.orientacion = 0;
    }

    public void encender() {
        this.isOn = true;
        System.out.println("Patinente encendido");
    }

    public void apagar() {
        this.isOn = false;
        System.out.println("Patinete apagado");

    }

    public int getVelocidad() {

        if (isOn == true) {
            while (velocidad < 25) {
                velocidad++;
                System.out.println("Vas a " + velocidad + " km/h");
            }
        } else {
            System.out.println("El patinete está apagado, no puede moverse");
        }
        return velocidad;
    }

    
    public void setVelocidad(int solcitarVelocidad) {
        
        if (isOn == true) {
            this.velocidad = solcitarVelocidad;

            System.out.println("Usted va a " + solcitarVelocidad + " km/h");

        } else {
            System.out.println("El patinete está apagado, no puede moverse");
        }

    }
}
