package poo;

public class Triangulo {
    private float base;
    private float altura;

    public float area(){
        return (this.base * this.altura) / 2;
    }

    //Constructor
    public Triangulo(){}

    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    //Getter y setter
    public float getBase(){
        return this.base;
    }

    public void setBase(float base){
        this.base = base;
    }

    public float getAltura(){
        return this.altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }
}
