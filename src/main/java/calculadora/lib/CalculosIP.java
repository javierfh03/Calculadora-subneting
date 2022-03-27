package calculadora.lib;

import calculadora.objects.IP;

/**
 * Esta clase contiene funciones que realizan cálculos para el manejo de 
 * direcciones ip.
 * 
 * @author javier
 */
public class CalculosIP {
    
    /**
     * Determina la cantidad de host válidos que hay en la subed de la dirección 
     * ip.
     * 
     * @param ip La ip de la que se quieren determinar cuantos host tiene su subred.
     * @return Un entero con la cantidad de host.
     */
    public static int cantidadDeHost(IP ip) throws Exception{
        String primera, ultima;
        int primeraNum, ultimaNum;
        
        if (ip.getMascara() > 30){
            if (ip.getMascara() == 31){
                return 2;
            }else{
                return 1;
            }
        }else{
            primera = ipBinario(ip.sacarDireccionDeSubred());
            ultima = ipBinario(ip.sacarDireccionDeBroadcast());
            primeraNum = Convertir.binarioDecimal(primera.substring(ip.getMascara(), 32));
            ultimaNum = Convertir.binarioDecimal(ultima.substring(ip.getMascara(), 32));
            return ultimaNum - primeraNum - 1;
        }
    }
    
    /**
     * Esta función se encarga de buscar una ip de una subred mediante su posición en
     * esta última.
     * 
     * @param posicion La posición de la ip que se busca.
     * @param ip La ip de la subred en la que se buscará la doreción.
     * @return Un objeto ip en el que estará almacenada la ip buscada.
     */
    public static IP buscarIp(int posicion, IP ip) throws Exception{
        String red = ipBinario(ip.sacarDireccionDeSubred());
        String hostPos;
        StringBuilder aux = new StringBuilder(""); 
        StringBuilder ipPos = new StringBuilder("");
        int redNum = Convertir.binarioDecimal(red.substring(ip.getMascara(), 32));
        
        // Sumamos la posición a la ip de red y la convertimos a binario.
        redNum += posicion;
        hostPos = Convertir.decimalBinario(redNum);
        
        // Ajustamos los bits de host.
        for (int i = hostPos.length(); i < 32 - ip.getMascara(); i++) {
            aux.append("0");
        }  
        
        // Añadimos el binario de la ip de subred.
        ipPos.append(red);
        
        // Sustituimos los bits de host de la dirección de red por los host de la ip buscada.
        ipPos.replace(ip.getMascara(), 32, aux.toString() + hostPos);
        
        return ipDecimal(ipPos.toString(), ip.getMascara());
    }
    
    /**
     * Este método combierte una dirección ip a binario.
     * 
     * @param ip La dirección ip.
     * @return La dirección ip en binario.
     */
    public static String ipBinario(IP ip){
        String binIp = Convertir.ajustarOchoBits(Convertir.decimalBinario(ip.getPrimerOcteto()))
                + Convertir.ajustarOchoBits(Convertir.decimalBinario(ip.getSegundoOcteto()))
                + Convertir.ajustarOchoBits(Convertir.decimalBinario(ip.getTercerOcteto()))
                + Convertir.ajustarOchoBits(Convertir.decimalBinario(ip.getCuartoOcteto()));
        return binIp;
    }
    
    /**
     * Este método combierte una dirección ip a decimal y devuelve un objeto IP.
     * 
     * @param ipBin La dirección ip en binario.
     * @param mascara La máscara de la dirección ip en decimal.
     * @return La dirección ip en decimal.
     */
    public static IP ipDecimal(String ipBin, int mascara) throws Exception{
        IP ip;
        
        // Si la secuencia binaria tiene el tamaño correcto la combertimos.
        if (ipBin.length() == 32){
            ip = new IP(Convertir.binarioDecimal(ipBin.substring(0, 8)), 
                Convertir.binarioDecimal(ipBin.substring(8, 16)),
                Convertir.binarioDecimal(ipBin.substring(16, 24)),
                Convertir.binarioDecimal(ipBin.substring(24, 32)), mascara);
            return ip;
        }else{
            return new IP();
        }
    }
}
