package poo;

public class Perro {

    String nombre;
    int edad;
    String raza;

    //Constructores
    //Constructor vacio
    public Perro(){

    }

    //Constructor con parametros
    public Perro(String nombre, int edad, String raza){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }


    //Metodos de la clase
    void comer(){
        System.out.println("El perro se encuentra comiendo!");
    }

    void dormir(){
        System.out.println("El perro duerme!");
    }

    void ladrar(){
        System.out.println("El perro esta ladrando!");
    }
}
