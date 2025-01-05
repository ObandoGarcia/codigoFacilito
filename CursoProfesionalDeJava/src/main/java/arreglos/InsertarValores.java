package arreglos;

public class InsertarValores {
    public static void main(String[] args) {

        //Insertar valores en arreglo
        int[] valores = new int[10];

        for(int i = 0; i < valores.length; i++){
            valores[i] = i;
        }

        //Mostrar los valores del arreglo
        for(int valor: valores){
            System.out.println(valor);
        }
    }
}
