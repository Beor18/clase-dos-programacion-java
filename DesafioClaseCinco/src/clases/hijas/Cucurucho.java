package clases.hijas;

import clases.abstractas.TipoDeHelado;

public class Cucurucho extends TipoDeHelado{

    public Cucurucho(int cantidadDeGustos, float precio) {
        //Uso super porque es un atributo que esta en el padre TipoDeHelado
        super.cantidadDeGustos = cantidadDeGustos;
        super.precioHelado = precio;
    }
    
    //OJO: Tienen que impementar el método describirHelado(), por eso no compila!!!!

    @Override
    public String describirHelado() {
        return null;
        
    }
    
    
}
