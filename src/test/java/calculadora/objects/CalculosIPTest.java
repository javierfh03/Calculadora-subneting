package calculadora.objects;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * En este archivo de pruebas se probarán los métodos de la clase CalculosIP.
 * 
 * @author javier
 */
public class CalculosIPTest {
    
    @Test
    public void testCantidadDeHost() throws Exception{
        CalculosIP primero = new CalculosIP(new IP(192, 64, 10, 0, 28));
        CalculosIP segundo = new CalculosIP(new IP(213, 105, 72, 0, 20));
        CalculosIP tercero = new CalculosIP(new IP(123, 45, 54, 23, 16));
        CalculosIP cuarto = new CalculosIP(new IP(192, 168, 2, 12, 10));
        CalculosIP quinto = new CalculosIP(new IP(192, 168, 45, 123, 5));
        
        // Probamos sacar la cantidad de direcciones disponibles en la subred.
        assertEquals(14, primero.cantidadDeHost());
        assertEquals(4094, segundo.cantidadDeHost());
        assertEquals(65534, tercero.cantidadDeHost());
        assertEquals(4194302, cuarto.cantidadDeHost());
        assertEquals(134217726, quinto.cantidadDeHost());
    }
    
    @Test
    public void testBuscarIp() throws Exception{
        CalculosIP primero = new CalculosIP(new IP(213, 105, 64, 0, 20));
        CalculosIP segundo = new CalculosIP(new IP(192, 168, 2, 12, 10));
        
        // Probamos los casos límite.
        assertEquals("213.105.64.1/20", primero.buscarIp(1).toString());
        assertEquals("213.105.79.253/20", primero.buscarIp(primero.cantidadDeHost() - 1).toString());
        
        // Probamos casos aleatorios.
        assertEquals("192.128.0.3/10", segundo.buscarIp(3).toString());
        assertEquals("192.128.0.255/10", segundo.buscarIp(255).toString());
        assertEquals("192.128.1.0/10", segundo.buscarIp(256).toString());
    }
}
