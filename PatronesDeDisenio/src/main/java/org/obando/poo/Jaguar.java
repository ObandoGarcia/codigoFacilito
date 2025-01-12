package org.obando.poo;

import org.obando.poo.interfaces.Felino;

public class Jaguar extends Animal implements Felino {

    private int edad;
    private float peso;

    public Jaguar() {
    }

    public Jaguar(int edad, float peso) {
        this.edad = edad;
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString(){
        return "La edad del jaguar es: " + getEdad() + " y mi peso es: " + getPeso();
    }

    @Override
    public void rugir() {
        System.out.println("El jaguar ruge");
    }

    @Override
    public void maullar() {
        throw new UnsupportedOperationException("El Jaguar no maulla!");
    }

    @Override
    public void cazar() {
        System.out.println("El jaguar caza");
    }
}
