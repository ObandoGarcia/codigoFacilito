package poo;

public class SobrecargaMetodos {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        //Suma de enteros
        System.out.println("Suma de enteros: " + calculadora.suma(10, 25));

        //Suma de flotantes
        System.out.println("Suma de flotantes: " + calculadora.suma(12.3f, 12.4f));

        //Suma de double
        System.out.println("Suma de double: " + calculadora.suma(123.12, 1346.12));

        int[] listaDeCalificaciones = {25, 52, 25, 2, 2, 6};

        //Suma de numeros usando un array
        System.out.println("Suma usando arreglo: " + calculadora.suma(listaDeCalificaciones));

        //Sumando array desde ...
    }
}
