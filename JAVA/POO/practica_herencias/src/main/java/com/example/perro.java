package com.example;

public class perro extends animal {
    
    public perro(double peso){ //constructor
        super(peso);
    }

    @Override
    public void hazRuido(){
        System.out.println("Guau");
    }
}
