package poo.claseAbstracta;

public class Triangulo extends Figura{

    private float base;
    private float altura;

    @Override
    public float area() {
        return (base * altura) / 2;
    }
}
