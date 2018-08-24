package ProgramaPrincipal;

// Se importa paquete

import NumerosPrimosEntre0y100.NumerosPrimosEntre0y100;
import CalculosMatematicos.CalculosMatematicos;
import java.util.Arrays;



public class ProgramaPrincipal {
    public static void main(String[] args){
        int[] numeros = new int[] {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
        System.out.println("-----------------------------------------");
        System.out.println(Arrays.toString(numeros));
        System.out.println("-----------------------------------------");
        System.out.println("Suma: "+ CalculosMatematicos.sumaPrimos(numeros));
        System.out.println("-----------------------------------------");
        System.out.println("Multiplicacion: "+ CalculosMatematicos.multiplicarPrimos(numeros));
        System.out.println("-----------------------------------------");
        System.out.println("Promedio: "+ CalculosMatematicos.promedioPrimos(numeros));
        System.out.println("-----------------------------------------");
        System.out.println("¿Cuales Son Numeros Primos? \n");
        System.out.println(NumerosPrimosEntre0y100.primosSi(numeros));
        System.out.println("-----------------------------------------");
       
    }
}

