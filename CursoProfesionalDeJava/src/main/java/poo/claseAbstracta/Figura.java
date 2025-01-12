package poo.claseAbstracta;

public abstract class Figura {
    private final int numeroLados;

    public Figura(){
        this.numeroLados = 0;
    }

    public abstract float area();
}
