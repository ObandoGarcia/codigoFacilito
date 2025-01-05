package operadores;

public class Casting {
    public static void main(String[] args) {
        int numeroEntero = 10;
        float numeroFloat = 5.5F;

        //Casting convertir el valor de una variable a un valor en concreto
        int resultado = numeroEntero + (int)numeroFloat;

        System.out.println(resultado);
    }
}
