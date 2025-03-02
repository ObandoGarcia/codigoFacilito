package org.obando.patronesDeDisenio.responsibilidadSimple;

public class Presentacion {
    public void imprimir(Rectangulo rectangulo){
        System.out.println(rectangulo);
    }

    //Sobrecarga de metodos
    /* public void area(Rectangulo rectangulo){
        System.out.println(rectangulo.getBase() * rectangulo.getAltura());
    }

    public void area(Triangulo triangulo){
        System.out.println((triangulo.getBase() * triangulo.getAltura()) / 2);
    }*/

    //Principio de abierto cerrado
    public void area(Figura figura){
        System.out.println(figura.area());
    }
}
