package org.obando.patronesDeDisenio.responsibilidadSimple;

public class Rectangulo implements Figura {
    private float base;
    private float altura;

    public Rectangulo() {
    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString(){
        return "Base: " + this.base + ", Altura: " + this.altura;
    }

    public float area(){
        return this.altura * this.base;
    }
}
