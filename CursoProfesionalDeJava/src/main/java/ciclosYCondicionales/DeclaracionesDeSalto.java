package ciclosYCondicionales;

public class DeclaracionesDeSalto {
    public static void main(String[] args) {

        //Break - termina un lote de instrucciones
        //Terminar ciclos

        //Continue - saltar iteraciones

        for(int i = 1; i <= 100; i++){
            System.out.println(i);
            if( i == 50){
              break;
            }
        }
    }

}
