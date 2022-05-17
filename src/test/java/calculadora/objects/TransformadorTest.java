package calculadora.objects;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * En este archivo de pruebas se probarán los métodos de la clase Transformador.
 * 
 * @author javier
 */
public class TransformadorTest {

    @Test
    public void testDecimalBinario() {
        // Probamos casos aleatorios.
        assertEquals("111010001", Transformador.decimalBinario(465));
        assertEquals("1000100", Transformador.decimalBinario(68));
        assertEquals("1011000", Transformador.decimalBinario(88));
        
        // Probamos los casos límite.
        assertEquals("1111111111111111111111111111111", Transformador.decimalBinario(Integer.MAX_VALUE));
        assertEquals("0", Transformador.decimalBinario(0));
    }

    @Test
    public void testBinarioDecimal() {
        // Probamos casos aleatorios.
        assertEquals(465, Transformador.binarioDecimal("111010001"));
        assertEquals(68, Transformador.binarioDecimal("1000100"));
        assertEquals(88, Transformador.binarioDecimal("01011000"));
        assertEquals(192, Transformador.binarioDecimal("11000000"));
        
        // Probamos los casos límite.
        assertEquals(Integer.MAX_VALUE ,Transformador.binarioDecimal("1111111111111111111111111111111"));
        assertEquals(0, Transformador.binarioDecimal("0"));
    }

    @Test
    public void testAjustarOchoBits() {
        // Probamos casos aleatorios.
        assertEquals("00011110", Transformador.ajustarOchoBits("11110"));
        assertEquals("01000100", Transformador.ajustarOchoBits("1000100"));
        assertEquals("01011000", Transformador.ajustarOchoBits("1011000"));
        
        // Probamos los casos límite.
        assertEquals("01111111" ,Transformador.ajustarOchoBits("1111111"));
        assertEquals("00000001", Transformador.ajustarOchoBits("1"));
    }

}
