package clases.abstractas;

import java.util.ArrayList;
import java.util.List;

public abstract class TipoDeHelado {
    
    //Atributos heredados genéricos
    protected List<String> gustosDeHelado = new ArrayList<String>();
    protected float precioHelado;

    // Comportamiento esperado de todos los tipos de helado con su propia descripción
    public abstract String describirHelado();

    public String describirGustos() {
        String mensaje = " Los gustos del helado son: ";
        for (String gusto : gustosDeHelado) {
            mensaje = mensaje + gusto + " ";
        }
        
        return mensaje;
    }
    
}
