package poo.herencia;

public class Perro extends Animal{

    public Perro(String nombre, int edad, String raza){
        super(nombre, edad, raza);
    }

    @Override
    public void dormir(){
        super.dormir();
        System.out.println("El perro esta durmiendo!");
    }
}
