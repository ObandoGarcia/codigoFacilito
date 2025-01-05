package ciclosYCondicionales;

public class Condicionales {
    public static void main(String[] args) {
        //Condicionales
        //if
        String colorLuz = "Verde";

        if(colorLuz.equalsIgnoreCase("verde")){
            System.out.println("Puede continuar");
        } else if (colorLuz.equalsIgnoreCase("amarillo")) {
            System.out.println("Precaucion");
        } else {
            System.out.println("No puedes avanzar");
        }
    }
}
