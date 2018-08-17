package ProgramaPrincipal;

import NumerosPrimosEntre0y10.NumerosPrimosEntre0y10;


public class ProgramaPrincipal {
    public static void main(String[] args){
        NumerosPrimosEntre0y10 numeros = new NumerosPrimosEntre0y10();
        System.out.println("Operacion Uno");
        System.out.println(numeros.numerosPrimos());
        System.out.println("------------------------------------");
        
        System.out.println("Operacion Dos");
        System.out.println(numeros.multiplicarPrimo());
        System.out.println("------------------------------------");
        
        System.out.println("Operacion Tres");
        System.out.println(numeros.promedioPrimos());
        System.out.println("------------------------------------");
    }
}
