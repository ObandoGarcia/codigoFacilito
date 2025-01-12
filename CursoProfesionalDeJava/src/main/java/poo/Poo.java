package poo;

public class Poo {
    public static void main(String[] args) {
        //Programacion Orientada a Objetos

        Perro lassie = new Perro();

        lassie.nombre = "Lassie";
        lassie.edad = 5;
        lassie.raza = "Labrador";

        System.out.println(lassie.nombre);
        System.out.println(lassie.edad);
        System.out.println(lassie.raza);

        lassie.comer();

        //Asignar valores desde el constructor
        Perro tembo = new Perro("Tembo", 8, "labrador");

        System.out.println(tembo.nombre);
    }
}
