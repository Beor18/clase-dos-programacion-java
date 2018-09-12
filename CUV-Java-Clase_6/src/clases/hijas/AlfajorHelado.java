/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.hijas;

import clases.abstractas.TipoDeHelado;

/**
 *
 * @author T430
 */
public class AlfajorHelado extends TipoDeHelado{

    @Override
    public String describirHelado() {
        return "Es un alfajor helado: siempre vale $10 y es de vainilla";
    }
    
}
