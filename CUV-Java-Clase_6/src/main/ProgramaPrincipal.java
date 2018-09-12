package main;

import clases.hijas.AlfajorHelado;
import clases.hijas.Cucurucho;
import clases.hijas.Pote;
import clases.hijas.Vasito;
import java.util.ArrayList;
import java.util.Arrays;
import utils.Heladero;

/**
 * @author Completarlo con nombre de Alumno
 */
public class ProgramaPrincipal {
    
    public static void main(String[] args){
        
        /********************************************************************************************
         * En este programa principal deberán crear 3 intancias de tipos de helado.
         * Una de cada tipo, que extendera de la clase Abstracta Tipo de Helado.
         * 
         * Tendran que diseñar las clases Cucurucho, Vasito y Pote, las cuales al 
         * heredar de una clase abstracta deberán sobreescribir los métodos que tenga
         * y podrán usar su comportamiento generico, como cantidad de gustos y precio
         * el cual variara al crear la instancia de cada objeto.
         * 
         * Se espera en el programa principal luego de crear los helados,ejecuten el método
         * describir helado, el cual tendrá la implementación de cada uno.
         * Por ejemplo el describirHelado de cucurucho dira:
         * "El cucurucho que se armo el cliente cuanta con 2 gustos (dato sacado de 
         * la variable cantidadDeGustos), un precio de $40 (dato sacado de precio) 
         * y esta bañado en chocolate (una característica booleana solo precente en los cucuruchos)"
         *********************************************************************************************/
        
        
        /**
         * EXTRA 1: Crear la clase heladero, que al pasarle un TipoDeHelado el describa el helado a contruir
         * Analógicamente a lo que hicimos en el ejemplo del Mecánico!!
         * 
         * EXTRA 2: Intentar diseñar que los TiposDeHelado tengan una lista de gustos (Pueden usar Arrays para hacerlo).
         * Los gustos serán elegidos al crear el objeto, al igual que el precio, y la cantidad no será necesaria ya que
         * la podemos deducir de la cantidad de gustos de la lista.
         * Modificar la implementación de los métodos describirHelado para que se describa cada gusto que se puso y 
         * la cantidad de gustos totales.
         * 
         * EXTRA 3: Agregar la subclase AlfajorHelado, implementar lo necesario y verificar que al pasarselo al Heladero,
         * pueda describirlo igual que al resto.
         */        
        
        ArrayList<String> gustosDelCucurucho = new ArrayList<String>();
        gustosDelCucurucho.add("Menta");
        gustosDelCucurucho.add("Coco");
        
        ArrayList<String> gustosDelVasito = new ArrayList<String>();
        gustosDelVasito.add("Cafe");
        gustosDelVasito.add("Banana");
        gustosDelVasito.add("Pera");
        
        ArrayList<String> gustosDelPote = new ArrayList<String>();
        gustosDelPote.add("Durazno");
        gustosDelPote.add("Menta");
        gustosDelPote.add("Choco");
        gustosDelPote.add("Vainilla");
        
        Heladero heladero = new Heladero(); 
        heladero.describirHelado(new Cucurucho(gustosDelCucurucho, 40f, false));
        heladero.describirHelado(new Vasito(gustosDelVasito, 56f));
        heladero.describirHelado(new Pote(gustosDelPote, 120f));
        heladero.describirHelado(new AlfajorHelado()); 
    }
}
