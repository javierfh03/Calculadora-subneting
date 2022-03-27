package calculadora.lib;

import calculadora.lib.Convertir;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * En este archivo de pruebas se probarán los métodos de la clase Convertir.
 * 
 * @author javier
 */
public class ConvertirTest {

    @Test
    public void testDecimalBinario() {
        // Probamos casos aleatorios.
        assertEquals("111010001", Convertir.decimalBinario(465));
        assertEquals("1000100", Convertir.decimalBinario(68));
        assertEquals("1011000", Convertir.decimalBinario(88));
        
        // Probamos los casos límite.
        assertEquals("1111111111111111111111111111111", Convertir.decimalBinario(Integer.MAX_VALUE));
        assertEquals("0", Convertir.decimalBinario(0));
    }

    @Test
    public void testBinarioDecimal() {
        // Probamos casos aleatorios.
        assertEquals(465, Convertir.binarioDecimal("111010001"));
        assertEquals(68, Convertir.binarioDecimal("1000100"));
        assertEquals(88, Convertir.binarioDecimal("01011000"));
        assertEquals(192, Convertir.binarioDecimal("11000000"));
        
        // Probamos los casos límite.
        assertEquals(Integer.MAX_VALUE ,Convertir.binarioDecimal("1111111111111111111111111111111"));
        assertEquals(0, Convertir.binarioDecimal("0"));
    }

    @Test
    public void testAjustarOchoBits() {
        // Probamos casos aleatorios.
        assertEquals("00011110", Convertir.ajustarOchoBits("11110"));
        assertEquals("01000100", Convertir.ajustarOchoBits("1000100"));
        assertEquals("01011000", Convertir.ajustarOchoBits("1011000"));
        
        // Probamos los casos límite.
        assertEquals("01111111" ,Convertir.ajustarOchoBits("1111111"));
        assertEquals("00000001", Convertir.ajustarOchoBits("1"));
    }

}
