package ciclosYCondicionales;

public class CondicionalSwitch {
    public static void main(String[] args) {
        String colorLuz = "n";

        switch(colorLuz){
            case "v":
                System.out.println("Puede continuar");
                break;
            case "a":
                System.out.println("Precaucion");
                break;
            case "r":
                System.out.println("No puedes avanzar");
                break;
            default:
                System.out.println("Accion no reconocida!");
        }
    }
}
