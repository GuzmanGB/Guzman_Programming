package com.example;

public class buho extends animal{
    public buho(double peso){
        super(peso);
    }

    @Override
    public void hazRuido(){
        System.out.println("uhú-uhú!");
    }
}
