package cadenas;

public class FormatoCadena {
    public static void main(String[] args) {

        String mensaje = "Cadena de caracteres nueva!";
        String mensaje2 = "ELECTRICONICA DE CAJAS COMPUTACIONALES";
        String mensajeConEspacios = "     Mensaje con espacios    ";

        //Converitir a mayusculas
        String mensajeEnMayusculas = mensaje.toUpperCase();
        System.out.println(mensajeEnMayusculas);

        //Convertir a minusculas
        String nuevoMensajeEnMinusculas = mensaje2.toLowerCase();
        System.out.println(nuevoMensajeEnMinusculas);

        //Remover los espacios del texto al pricipio o al final
        String cadenaSinEspacios = mensajeConEspacios.trim();
        System.out.println(cadenaSinEspacios);
    }
}
