package calculadora.lib;

import calculadora.lib.CalculosIP;
import calculadora.objects.IP;
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
        IP ip1 = new IP(192, 64, 10, 0, 28);
        IP ip2 = new IP(213, 105, 72, 0, 20);
        IP ip3 = new IP(123, 45, 54, 23, 16);
        IP ip4 = new IP(192, 168, 2, 12, 10);
        IP ip5 = new IP(192, 168, 45, 123, 5);
        
        // Probamos sacar la cantidad de direcciones disponibles en la subred.
        assertEquals(14, CalculosIP.cantidadDeHost(ip1));
        assertEquals(4094, CalculosIP.cantidadDeHost(ip2));
        assertEquals(65534, CalculosIP.cantidadDeHost(ip3));
        assertEquals(4194302, CalculosIP.cantidadDeHost(ip4));
        assertEquals(134217726, CalculosIP.cantidadDeHost(ip5));
    }
    
    @Test
    public void testBuscarIp() throws Exception{
        IP ip1 = new IP(213, 105, 64, 0, 20);
        IP ip2 = new IP(192, 168, 2, 12, 10);
        
        // Probamos los casos límite.
        assertEquals("213.105.64.1/20", CalculosIP.buscarIp(1, ip1).toString());
        assertEquals("213.105.79.253/20", CalculosIP.buscarIp(4093, ip1).toString());
        
        // Probamos casos aleatorios.
        assertEquals("192.128.0.3/10", CalculosIP.buscarIp(3, ip2).toString());
        assertEquals("192.128.0.255/10", CalculosIP.buscarIp(255, ip2).toString());
        assertEquals("192.128.1.0/10", CalculosIP.buscarIp(256, ip2).toString());
    }
}
