package clases.hijas;

import clases.abstractas.TipoDeHelado;
import java.util.List;

public class Cucurucho extends TipoDeHelado{

    public Cucurucho(float precio, List<String> gustos) {
        //Uso super porque es un atributo que esta en el padre TipoDeHelado
        super.precioHelado = precio;
        super.gustos = gustos;
    }
    
    //OJO: Tienen que impementar el método describirHelado(), por eso no compila!!!!

    @Override
    public String describirHelado() {
        String descripcion = "Cantidad de Gustos: " + super.gustos.size() + " El Helado cuesta " + super.precioHelado + " y tiene los Gustos: " + super.gustos;
        
        return descripcion;
        
    }
    
    
}
