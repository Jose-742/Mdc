
package com.mycompany.mdc;

/**
 *
 * @author aluno
 */
public class MathUtil {
    
       
    

    public static double mdc(double a, double b){
    
     //P7
      a = Math.abs(a);
      b = Math.abs(b);
        
        
     //P6
     final double min = Math.min(a, b);
     a = Math.max(a, b);
     b = min;  
        
        
     //P1 e P2 e P4
     if(b > 0 && a % b == 0){
         return b;
     }  
     
     //P3
     if(b == 0){
         return Math.abs(a); 
     } 
     
     
     
       /*throw new UnsupportedOperationException("Não foi possível calcular o MDC com os valores informados.");*/
       return 1;
    }
   
}
