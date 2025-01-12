package poo;

public class Circulo {

    public static float pi = 3.1416f;
    public float radio = 0f;

    public Circulo(float radio){
        this.radio = radio;
    }

    public float area(){
        return pi * (radio * radio);
    }
}

