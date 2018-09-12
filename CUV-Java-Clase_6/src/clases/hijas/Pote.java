package clases.hijas;

import clases.abstractas.TipoDeHelado;
import java.util.List;

public class Pote extends TipoDeHelado{

    public Pote(List<String> gustosDeHelado, float precio) {
        super.gustosDeHelado = gustosDeHelado;
        super.precioHelado = precio;
    }
    
    @Override
    public String describirHelado() {
        String mensaje = "El pote que se armo el cliente cuenta con " 
                + super.gustosDeHelado.size() + " gustos.";
        
        mensaje = mensaje + super.describirGustos();
        mensaje = mensaje + ". Y tiene un precio de $" + super.precioHelado;
        
        return mensaje;
    }
    
    
}
