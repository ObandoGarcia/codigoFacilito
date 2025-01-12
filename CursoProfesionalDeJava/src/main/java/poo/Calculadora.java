package poo;

public class Calculadora {
    public int suma(int operando1, int operando2){
        return operando1 + operando2;
    }

    public float suma(float operando1, float operando2){
        return operando1 + operando2;
    }

    public double suma(double operando1, double operando2){
        return operando1 + operando2;
    }

    /*
    public int suma(int[] arrayDeEnteros){
        int suma = 0;
        for(int numero: arrayDeEnteros){
            suma += numero;
        }

        return suma;
    }*/

    public int suma(int... numeros){
        int suma = 0;
        for(int numero: numeros){
            suma += numero;
        }

        return suma;
    }

}
