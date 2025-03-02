package org.obando.patronesDeDisenio.inversionDependencias;

public class Main {
    public static void main(String[] args) {

        Teclado teclado = new Teclado();
        Mouse mouse = new Mouse();

        Computadora computadora = new Computadora(teclado, mouse);
        computadora.encender();
    }
}
