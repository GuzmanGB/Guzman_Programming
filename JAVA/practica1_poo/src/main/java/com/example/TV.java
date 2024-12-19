package com.example;

public class TV {
    private boolean isOn;
    private int volume;
    private int canal;

    public TV() {
        this.isOn = false;
        this.volume = 8;
        this.canal = 1;
    }


    public void encender() {
        if (!isOn) {
            isOn = true;
            System.out.println("Esta encendido");
        } else {
            System.out.println("Esta ya encendido");
        }
    }

    public void apagar() {
        if (isOn) {
            isOn = false;
            System.out.println("Esta apagado");
        } else {
            System.out.println("Esta ya apagado");
        }
    }

    public void volumenUp() {

        if (volume == 10) {
            System.out.println("El volumen está al máximo");
        } else {
            System.out.println("Se subirá un punto al volumen");
            volume++;
        }
        System.out.println("Volumen al " + volume);
    }

    public void volumenDown() {

        if (volume == 0) {
            System.out.println("El volumen está al mínimo");
        } else {
            System.out.println("Se bajará un punto al volumen");
            volume--;
        }
        System.out.println("Volumen al " + volume);
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canalDistinto) {
        this.canal = canalDistinto;
    }

    public void canalUp() {

        if (canal == 10) {
            System.out.println("Este es el último canal");
        } else {
            System.out.println("Se cambiará al canal siguiente");
            canal++;
        }
        System.out.println("Canal " + canal);
    }

    public void canalDown() {

        if (canal == 1) {
            System.out.println("Este es el primer canal");
        } else {
            System.out.println("Se cambiará al canal anterior");
            canal--;
        }
        System.out.println("Canal " + canal);
    }
}

