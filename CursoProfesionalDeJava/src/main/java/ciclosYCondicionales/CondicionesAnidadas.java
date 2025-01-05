package ciclosYCondicionales;

public class CondicionesAnidadas {
    public static void main(String[] args) {

        double promedioNotas = 9.58;

        if(promedioNotas >=7){
            System.out.println("Aprobaste!");
            if (promedioNotas == 10){
                System.out.println("Muchas felicidades!");
            }else {
                System.out.println("Felicidades");
            }
        }else{
            System.out.println("No has aprobado!");
        }
    }
}
