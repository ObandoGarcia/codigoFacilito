package cadenas;

public class Cadenas {
    public static void main(String[] args) {
        String nombreCompleto = "Jose Manuel Obando Garcia";
        System.out.println(nombreCompleto);

        //Metodos de las cadenas
        //Cantidad de caracteres
        int numeroDeCaracteres = nombreCompleto.length();
        System.out.println("El numero de caracteres de nombre es: " + numeroDeCaracteres);

        //Verificar si posee un texto
        boolean estaEnNombre = nombreCompleto.contains("Garcia");
        System.out.println("Garcia esta en nombre? " + estaEnNombre);

        //Comienza con
        boolean comienzaCon = nombreCompleto.startsWith("E");
        System.out.println("El nombre comienza con E? " + comienzaCon);

        //Termina con
        boolean terminaCon = nombreCompleto.endsWith("ia");
        System.out.println("El nombre termina con ia? " + terminaCon);

        //Agregar una cadena a otra
        System.out.println("Nombre agregando cadena de saludo: " + nombreCompleto.concat(" es mi nombre completo"));
    }
}
