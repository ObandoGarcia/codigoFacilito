package org.obando.patronesDeDisenio.inversionDependencias;

import org.obando.patronesDeDisenio.inversionDependencias.interfaces.IMouse;

public class Mouse implements IMouse {
    public void conectar(){
        System.out.println("Conexion al mouse via USB!");
    }
}
