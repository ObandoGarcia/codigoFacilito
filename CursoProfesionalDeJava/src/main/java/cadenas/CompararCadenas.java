package cadenas;

public class CompararCadenas {
    public static void main(String[] args) {

        String cadena1 = "Hola";
        String cadena2 = "Hola1";
        String cadena3 = cadena1.toUpperCase();

        //Validar dos cadena iguales
        boolean sonIguales = cadena1.equals(cadena2);
        System.out.println(sonIguales);

        //Validar ignorando mayusculas
        boolean sonIgualesIgnorandoMayusculas = cadena1.equalsIgnoreCase(cadena3);
        System.out.println(sonIgualesIgnorandoMayusculas);
    }
}
