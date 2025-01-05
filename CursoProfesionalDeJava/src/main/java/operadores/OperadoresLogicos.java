package operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //Operadores logicos
        //AND &&  verdadero si ambas partes son verdaderas
        //OR ||  verdadero si al menos una de las expresiones en verdadera
        //NOT !  invierte el valor de la expresion

        boolean resultado;

        resultado = (5 > 5) && (10 > 9);
        System.out.println(resultado);
    }
}
