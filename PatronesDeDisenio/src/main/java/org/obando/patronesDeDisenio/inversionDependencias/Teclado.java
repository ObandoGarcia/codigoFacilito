package org.obando.patronesDeDisenio.inversionDependencias;

import org.obando.patronesDeDisenio.inversionDependencias.interfaces.ITeclado;

public class Teclado implements ITeclado {
    public void conectar(){
        System.out.println("Conexion al teclado por via USB!");
    };
}
