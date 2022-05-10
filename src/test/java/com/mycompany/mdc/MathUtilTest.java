
package com.mycompany.mdc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aluno
 */
public class MathUtilTest {
    
    public MathUtilTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    @Test
    public void testMdcP1Pares() {
        final double a = 8, b = 2;
        final double esperado = b;
        final double obtido = MathUtil.mdc(a, b);
        
        assertEquals(esperado, obtido);
    }
    
    
    @Test
    public void testMdcP1Impares() {
        final double a = 9, b = 3;
        final double esperado = b;
        final double obtido = MathUtil.mdc(a, b);
        
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void mdcP2(){
        final double divisor =  4, a=24, b=12;
        //mdc(24, 12) ==0
        
        
        final double obtido = MathUtil.mdc(a, b);
        
        assertTrue(obtido % divisor == 0);
    }
    
    @Test
    public void mdcP3Positivo(){
        final double a = 7, esperado = 7;
        final double obtido = MathUtil.mdc(a, 0);
        assertEquals(esperado, obtido);
    }
    
     @Test
    public void mdcP3Negativo(){
        final double a = -7, esperado = 7;
        final double obtido = MathUtil.mdc(a, 0);
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void mdcP4(){
        final double m = 3, a =8,  b = 4;
        //mdc(24, 12) = 12
        final double esperado = MathUtil.mdc(m*a, m*b);
        //3 * mdc(8, 4) = 4; 3*4 = 12
        final double obtido = m * MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void  mdcP6(){
        final double a = 5, b = 15;
        final double esperado = MathUtil.mdc(a, b);
        final double obtido = MathUtil.mdc(b, a);
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void mdcP7BPositivo(){
        final double a = 15, b = 5, esperado = 5;
        final double obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void mdcP7BNegativo(){
        final double a = 5, b = 15;
        final double esperado = MathUtil.mdc(-a, b);
        final double obtido = MathUtil.mdc(a, -b);
        assertEquals(esperado, obtido);
    }
    
   /* @Test
    public void mdcP8(){
        final double a = 5, b = 5;
        final double esperado = a;
        final double obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }*/
    @Test
    public void mdcP12UmPrimo(){
        final double p = 7, a = 3;
        final double obtido = MathUtil.mdc(p, a);
       
        assertEquals(1, obtido);
    }
    @Test
    public void mdcP12PrimosIguais(){
        final double p = 7, a = p;
        final double obtido = MathUtil.mdc(p, a);      
        
        assertEquals(p, obtido);
    }
    
    /*@Test
    public void mdcP12Primos(){
        final double matrix[][] = {{7,3}, {5, 3}, {7, 7}, {5,2}};
        final double esperado[] = {1, 7, 1};
        for(int i = 0; i< matrix.length; i++){
            final double linha[] = matrix[i];
            final double obtido = MathUtil.mdc(linha[0], linha[1]);
            
        }
        
        final double p = 7, a = p;
        final double obtido = MathUtil.mdc(p, a);      
        
        assertEquals(p, obtido);
    }*/
    @Test
    public void mdcP12VariasPrimos(){
        final double p = 7, a = p;
        final double obtido = MathUtil.mdc(p, a);      
        
        assertEquals(p, obtido);
    }
    
    
}
