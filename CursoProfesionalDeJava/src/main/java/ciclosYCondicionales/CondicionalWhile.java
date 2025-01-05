package ciclosYCondicionales;

public class CondicionalWhile {
    public static void main(String[] args) {

        int contador = 1;

        while(contador < 11){
            System.out.println("Iteracion:" + contador);
            contador++;
        }

        int numero = 12345689;
        int contadorNumeros = 0;

        while(numero > 0){
            numero /= 10;
            contadorNumeros++;
        }

        System.out.println("El numero posee: " + contadorNumeros + " digitos");
    }
}
