
package com.mycompany.mdc;

import java.util.Objects;

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
      // return 1;
     return mdc(a - b, b);
    }
    
    public static double mdc(double ...valores) {
    	Objects.requireNonNull(valores, "O parâmetro valores não pode ser nulo para calcular o MDC");
    	
    	if(valores.length == 0) {
    		throw new IllegalArgumentException("É preciso indicar ao menos um valor pra calcular o MDC");
    	}
    	double a = valores[0];
    	for(double b : valores) {
    		a = mdc(a, b);
    	}
    	return a;
    }
   
}
