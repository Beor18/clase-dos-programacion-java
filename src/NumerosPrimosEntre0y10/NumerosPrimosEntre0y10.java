package NumerosPrimosEntre0y10;


public class NumerosPrimosEntre0y10 {
    
    // Variables de Clase
    int numeroPrimoDos = 2;
    int numeroPrimoTres = 3;
    int numeroPrimoCinco = 5;
    int numeroPrimoSiete = 7;
  
  // Metodos
  public float numerosPrimos(){
    float sumaDePrimos = numeroPrimoDos + numeroPrimoTres + numeroPrimoCinco + numeroPrimoSiete;
    return sumaDePrimos;
    
  
  }
  
  public float multiplicarPrimo(){
  
    float multiplicacionDePrimos = numeroPrimoDos * numeroPrimoTres * numeroPrimoCinco * numeroPrimoSiete;
    return multiplicacionDePrimos;
  
  }
  
  public float promedioPrimos(){
  
      float promedioDePrimos = numerosPrimos() / 4f;
      return promedioDePrimos;
  
  }
    
}
