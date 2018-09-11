package clases.abstractas;

public abstract class TipoDeHelado {
    
    //Atributos heredados genéricos
    protected int cantidadDeGustos;
    protected float precioHelado;
    
    // Comportamiento esperado de todos los tipos de helado con su propia descripción
    public abstract String describirHelado();
    
}
