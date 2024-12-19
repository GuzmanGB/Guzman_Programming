package com.example;

public class Main {
    public static void main(String[] args) {

        animal miAnimal = new animal(100);
        perro scooby = new perro(22);
        gato catty = new gato(15);
        buho charlie = new buho(8);

        miAnimal.hazRuido();
        scooby.hazRuido();
        catty.hazRuido();
        charlie.hazRuido();

        double pesoScooby = scooby.getPeso();
        System.out.println("Peso de perro scooby: " + pesoScooby);

        double pesoGato = catty.getPeso();
        System.out.println("Peso de gato catty: " + pesoGato);

        double pesoBuho = charlie.getPeso();
        System.out.println("Peso de buho : " + pesoBuho);

        scooby.setPeso(20);
        System.out.println(scooby.getPeso());
        catty.setPeso(10);
        System.out.println(catty.getPeso());
        charlie.setPeso(5);
        System.out.println(charlie.getPeso());


    }
}