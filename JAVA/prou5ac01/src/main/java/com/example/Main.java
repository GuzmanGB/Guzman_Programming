package com.example;

interface conduir {
    void conduir();

    int obtenirVelocitatmaxima();
}

interface habitabilitat {
    void albergarPersones(int nombre);

    int obtenirCapacitat();
}

abstract class vehicle {

    protected String nom;

    public vehicle(String nom) {
        this.nom = nom;
    }

    public void descriure() {
        System.out.println("Nombre vehiculo: " + nom);
    }

}

class coche extends vehicle implements conduir, habitabilitat {

    private int capacitat;

    public coche(String nom, int capacitat) {
        super(nom);
        this.capacitat = capacitat >= 4 ? capacitat : 4;
    }

    @Override
    public void conduir() {
        System.out.println("Estoy conduciendo un coche. ");
    }

    @Override
    public int obtenirVelocitatmaxima() {
        return 200;
    }

    @Override
    public void albergarPersones(int nombre) {
        if (nombre <= capacitat) {
            System.out.println("Este coche puede albergar " + nombre + " personas");
        } else {
            System.out.println("Este coche no puede albergar mas de " + capacitat + " personas");
        }
    }

    @Override
    public int obtenirCapacitat() {
        return capacitat;
    }

}

class moto extends vehicle implements conduir, habitabilitat {

    private int capacitat;

    public moto(String nom, int capacitat) {
        super(nom);
        this.capacitat = capacitat >= 2 ? capacitat : 2;
    }

    @Override
    public void conduir() {
        System.out.println("Estoy conduciendo una moto. ");
    }

    @Override
    public int obtenirVelocitatmaxima() {
        return 180;
    }

    @Override
    public void albergarPersones(int nombre) {
        if (nombre <= capacitat) {
            System.out.println("Esta moto puede albergar " + nombre + " personas");
        } else {
            System.out.println("Esta moto no puede albergar mas de " + capacitat + " personas");
        }
    }

    @Override
    public int obtenirCapacitat() {
        return capacitat;
    }

}

public class Main {
    public static void main(String[] args) {

        coche miCoche = new coche("Ford", 5);
        moto miMoto = new moto("yamaha", 2);

        miCoche.descriure();
        miCoche.conduir();
        System.out.println("Este coche va a " + miCoche.obtenirVelocitatmaxima() + "km/h");
        System.out.println("Este coche tiene " + miCoche.obtenirCapacitat() + " huecos de capacidad");
        miCoche.albergarPersones(5);

        System.out.println();

        miMoto.descriure();
        miMoto.conduir();
        System.out.println("Esta moto va a " + miMoto.obtenirVelocitatmaxima() + "km/h");
        System.out.println("Esta moto tiene " + miMoto.obtenirCapacitat() + " huecos de capacidad");
        miMoto.albergarPersones(2);

    }
}