package com.mycompany.mdc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathUtilTest {
    
   
    @Test
    public void testMdcAParP1() {
        final int a = 6;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void testMdcAImparP1() {
    	final int a = 9;
    	final int b = 3;
    	final int esperado = b;
    	final int obtido  = MathUtil.mdc(a, b);
    	assertEquals(esperado, obtido);
    }
    
}
