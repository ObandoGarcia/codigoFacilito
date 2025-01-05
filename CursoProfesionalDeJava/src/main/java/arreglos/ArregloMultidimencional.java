package arreglos;

public class ArregloMultidimencional {
    public static void main(String[] args) {

        //Matrices
        int[][] matriz = new int[4][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        matriz[3][0] = 10;
        matriz[3][1] = 11;
        matriz[3][2] = 12;

        System.out.println( matriz[3][1]);

        System.out.println("------ For ------");

        //Recorrer matrices
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println(matriz[i][j]);
            }
        }

        System.out.println("------ For each -------");

        //For each
        for (int[] fila : matriz) {
            for (int celda : fila) {
                System.out.println(celda);
            }
        }
    }
}
