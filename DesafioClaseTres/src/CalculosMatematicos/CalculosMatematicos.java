package CalculosMatematicos;

public class CalculosMatematicos {
    
// Suma
  public static float sumaPrimos(int... numeros){
    int sumar = 0;
        
    for (int i = 0; i < numeros.length; i++) {
            sumar = numeros[i] + sumar;
    }
        
    float suma = sumar;
        
    return suma;
  
  }
    
    
// Multiplicacion
  public static float multiplicarPrimos(int... numeros){
    float multiplicar = 1;
        
    for (int i = 0; i < numeros.length; i++) {
            multiplicar = numeros[i] * multiplicar;
    }
        
    float multiplica = multiplicar;
        
    return multiplica;
    
  
  }
  
//Sacamos Promedio
  public static float promedioPrimos(int... numeros){
    int sumaPrimos = 0;
        
    for (int i = 0; i < numeros.length; i++) {
            sumaPrimos = sumaPrimos + numeros[i];
    }
        
    float promedio = sumaPrimos / (float) numeros.length;
        
    return promedio;
    
  
  }
}
