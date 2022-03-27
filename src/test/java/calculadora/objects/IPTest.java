package calculadora.objects;

import calculadora.objects.IP;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;

/**
 * En este archivo de pruebas se probarán los métodos de la clase IP.
 * 
 * @author javier
 */
public class IPTest {
    
    @Test
    public void testToString() throws Exception {
        IP ip = new IP(192, 168, 1, 1, 24);
        
        // Probamos que el método toString funciona.
        assertEquals("192.168.1.1/24", ip.toString());
    }

    @Test
    public void testSacarDireccionDeSubred() throws Exception{
        IP ip1 = new IP(192, 168, 100, 30, 29);
        IP ip2 = new IP(192, 168, 1, 62, 26);
        IP ip3 = new IP(192, 168, 1, 76, 26);
        IP ip4 = new IP(192, 168, 1, 3, 24);
        IP ip5 = new IP(192, 168, 2, 12, 10);
        
        // Probamos sacar la dirección de subred de las ip.
        assertEquals("192.168.100.24/29", ip1.sacarDireccionDeSubred().toString());
        assertEquals("192.168.1.0/26", ip2.sacarDireccionDeSubred().toString());
        assertEquals("192.168.1.64/26", ip3.sacarDireccionDeSubred().toString());
        assertEquals("192.168.1.0/24", ip4.sacarDireccionDeSubred().toString());
        assertEquals("192.128.0.0/10", ip5.sacarDireccionDeSubred().toString());
    }

    @Test
    public void testSacarDireccionDeBroadcast() throws Exception{
        IP ip1 = new IP(10, 254, 255, 23, 29);
        IP ip2 = new IP(192, 168, 1, 62, 26);
        IP ip3 = new IP(10, 10, 10, 10, 22);
        IP ip4 = new IP(192, 168, 99, 20, 30);
        
        // Probamos sacar la dirección de subred de las ip.
        assertEquals("10.254.255.23/29", ip1.sacarDireccionDeBroadcast().toString());
        assertEquals("192.168.1.63/26", ip2.sacarDireccionDeBroadcast().toString());
        assertEquals("10.10.11.255/22", ip3.sacarDireccionDeBroadcast().toString());
        assertEquals("192.168.99.23/30", ip4.sacarDireccionDeBroadcast().toString());
    }
    
    @Test
    public void testPosicionIp() throws Exception{
        IP ip1 = new IP(213, 105, 64, 1, 20);
        IP ip2 = new IP(192, 191, 255, 254, 10);
        IP ip3 = new IP(213, 105, 64, 0, 20);
        IP ip4 = new IP(213, 105, 79, 255, 20);
        IP ip5 = new IP(192, 128, 0, 3, 10);
        IP ip6 = new IP(192, 128, 0, 255, 10);
        IP ip7 = new IP(192, 128, 1, 0, 10);
        
        // Probamos los casos límite.
        assertEquals(1, ip1.posicionIp());
        assertEquals(4194302, ip2.posicionIp());
        assertEquals(-1, ip3.posicionIp());
        assertEquals(-1, ip4.posicionIp());
        
        // Probamos casos aleatorios.
        assertEquals(3, ip5.posicionIp());
        assertEquals(255, ip6.posicionIp());
        assertEquals(256, ip7.posicionIp());
    }
    
    @Test
    public void testSetIp() throws Exception{
        IP ip = new IP();
        Exception ex1 = Assertions.assertThrows(Exception.class,
                ()->ip.setIp("456.168.1.1/12"));
        Exception ex2 = Assertions.assertThrows(Exception.class,
                ()->ip.setIp("192.168.1.2/33"));
        
        // Probamos casos aleatorios.
        assertEquals("Ip no válida", ex1.getMessage());
        assertEquals("Ip no válida", ex2.getMessage());
        ip.setIp("192.168.1.3/31");
        assertEquals("192.168.1.3/31", ip.toString());
        ip.setIp("223.192.123.244/1");
        assertEquals("223.192.123.244/1", ip.toString());
    }
}
