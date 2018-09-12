package clases.abstractas;

import java.util.List;

public abstract class TipoDeHelado {
    
    //Atributos heredados genéricos
    //protected int cantidadDeGustos;
    protected float precioHelado;
    protected List<String> gustos;
    
    // Comportamiento esperado de todos los tipos de helado con su propia descripción
    public abstract String describirHelado();
    
}
