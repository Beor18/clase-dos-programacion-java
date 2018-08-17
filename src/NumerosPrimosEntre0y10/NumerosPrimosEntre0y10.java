package NumerosPrimosEntre0y10;


public class NumerosPrimosEntre0y10 {
    
    int numeroPrimoDos = 2;
    int numeroPrimoTres = 3;
    int numeroPrimoCinco = 5;
    int numeroPrimoSiete = 7;
    private float sumaDePrimos = numeroPrimoDos + numeroPrimoTres + numeroPrimoCinco + numeroPrimoSiete;;
    
  public float numerosPrimos(){
    
    return(sumaDePrimos);
    
  
  }
  
  public float multiplicarPrimo(){
  
    float multiplicacionDePrimos = numeroPrimoDos * numeroPrimoTres * numeroPrimoCinco * numeroPrimoSiete;
    return (multiplicacionDePrimos);
  
  }
  
  public float promedioPrimos(){
  
      float promedioDePrimos = sumaDePrimos / 4f;
      return(promedioDePrimos);
  
  }
    
}
