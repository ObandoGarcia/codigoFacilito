package org.obando.patronesDeDisenio.responsibilidadSimple;

public class Main {
    public static void main(String[] args) {

        /// Cada clase realiza uno uy solo una operacion relacionada

        Rectangulo rectangulo = new Rectangulo(12.3F, 123.5F);
        Triangulo triangulo = new Triangulo(10.8F, 5.52F);

        Presentacion presentacion = new Presentacion();
        presentacion.imprimir(rectangulo);

        presentacion.area(triangulo);
        presentacion.area(rectangulo);
    }
}
