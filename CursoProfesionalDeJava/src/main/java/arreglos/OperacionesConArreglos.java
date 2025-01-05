package arreglos;

public class OperacionesConArreglos {
    public static void main(String[] args) {

        //Definir areglos
        int[] calificaciones = {9, 9, 5, 5, 9, 9, 10, 5, 8, 3, 4, 2, 5};

        //Longitud del arreglo
        int tamanioArreglo = calificaciones.length;

        System.out.println("---------- For ----------");

        //Recorrer arreglo
        for(int i = 0; i < tamanioArreglo; i++){
            System.out.println(calificaciones[i]);
        }

        System.out.println("---------- For each ----------");

        //ForEach
        for(int calificacion: calificaciones){
            System.out.println(calificacion);
        }
    }
}
