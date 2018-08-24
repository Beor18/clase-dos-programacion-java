package NumerosPrimosEntre0y100;

public class NumerosPrimosEntre0y100 {
    
    public static float primosSi(int[] numeros) {
        
        int i,j;
        boolean esPrimo;
        int rangoInicial=2;
        int rangoFinal = 99;
        for(i = rangoInicial;i <= rangoFinal;i++){

            esPrimo=true;
             for(j = 2;j < i;j++){

             if(i % j == 0){
                esPrimo = false;
             }
             }
             if(esPrimo){
              System.out.println(i+" Es Primo \n");
             }else {
                 System.out.println(i+" False \n");
             }
        }
   
        float l = i;
        return l;
    }
    
}
