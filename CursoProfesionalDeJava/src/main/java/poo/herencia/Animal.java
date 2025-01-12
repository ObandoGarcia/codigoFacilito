package poo.herencia;

public class Animal {
    private String nombre;
    private int edad;
    private String raza;

    public Animal(){}

    public Animal(String nombre, int edad, String raza){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public void dormir(){
        System.out.println("El animal duerme");
    }
}
