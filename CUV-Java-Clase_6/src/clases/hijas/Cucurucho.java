package clases.hijas;

import clases.abstractas.TipoDeHelado;
import java.util.List;

public class Cucurucho extends TipoDeHelado{

    private boolean baniadoEnChocolate;
    
    public Cucurucho(List<String> gustosDeHelado, float precio, boolean estaBaniadoEnChocolate) {
        //Uso super porque es un atributo que esta en el padre TipoDeHelado
        super.gustosDeHelado = gustosDeHelado;
        super.precioHelado = precio;
        baniadoEnChocolate = estaBaniadoEnChocolate;
    }
    
    //OJO: Tienen que impementar el método describirHelado(), por eso no compila!!!!

    @Override
    public String describirHelado() {
        
        String mensaje = "El cucurucho que se armo el cliente cuenta con " 
                + super.gustosDeHelado.size() + " gustos.";
        
        mensaje = mensaje + super.describirGustos();
        
        mensaje = mensaje + ". Y tiene un precio de $" + super.precioHelado;
        
        if (baniadoEnChocolate){
            mensaje = mensaje + ". Además esta bañado en chocolate. ";
        }else{
            mensaje = mensaje + ". Además esta NO está bañado en chocolate. "; 
        }
        
        return mensaje;
    }
    
    
}
