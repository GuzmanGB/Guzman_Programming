package com.example;

public class Movil {
    
        // primero generamos los atributos de la clase
        private boolean isOn;
        private int volume;
        private int canal;
    
        public Movil() {
            this.isOn = false;
            this.volume = 8;
            this.canal = 1;
        }

        public void encenderMovil(){
            if (!isOn) {
                isOn = true;
                System.out.println("El movil esta encendido");
            } else {
                System.out.println("Esta ya encendido");
            }

        }



}
