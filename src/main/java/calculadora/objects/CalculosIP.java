package calculadora.objects;


/**
 * Esta clase contiene funciones que realizan cálculos para el manejo de 
 * direcciones IP.
 * 
 * @author javier
 */
public class CalculosIP {
    private IP ip;

    public CalculosIP(IP ip) {
        this.ip = ip;
    }

    public void setIp(IP ip) {
        this.ip = ip;
    }
    
    /**
     * Determina la cantidad de host válidos que hay en la subed de la dirección 
     * IP.
     * 
     * @return Un entero con la cantidad de host.
     * @throws java.lang.Exception Devuelve un error si hay problemas con la máscara de red o brodcast.
     */
    public int cantidadDeHost() throws Exception{
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
            primeraNum = Transformador.binarioDecimal(primera.substring(ip.getMascara(), 32));
            ultimaNum = Transformador.binarioDecimal(ultima.substring(ip.getMascara(), 32));
            return ultimaNum - primeraNum - 1;
        }
    }
    
    /**
     * Esta función se encarga de buscar una IP de una subred mediante su posición en esta última.
     * 
     * @param posicion La posición de la IP que se busca.
     * @return Un objeto IP en el que estará almacenada la IP buscada.
     * @throws java.lang.Exception Devuelve un error si la posición no es válida.
     */
    public IP buscarIp(int posicion) throws Exception{
        String red = ipBinario(ip.sacarDireccionDeSubred()), hostPos;
        StringBuilder aux = new StringBuilder(""), ipPos = new StringBuilder(""); 
        int redNum = Transformador.binarioDecimal(red.substring(ip.getMascara(), 32));
        
        if (posicion < 0 || posicion > (cantidadDeHost() + 1)){
            throw new Exception("Posición no válida");
        }
        
        // Si la máscara es mayor a 30, se ajusta la posición, si es 32 devolvemos la misma IP.
        if (ip.getMascara() > 31){
            return ip;
        } else if (ip.getMascara() > 30){
            posicion--;
        }
        
        // Sumamos la posición a la IP de red y la convertimos a binario.
        redNum += posicion;
        hostPos = Transformador.decimalBinario(redNum);
        
        // Ajustamos los bits de host.
        for (int i = hostPos.length(); i < 32 - ip.getMascara(); i++) {
            aux.append("0");
        }  
        
        /* Añadimos el binario de la IP de subred y sustituimos los bits de host de la dirección de red por los host de 
        la IP buscada. */
        ipPos.append(red);
        ipPos.replace(ip.getMascara(), 32, aux.toString() + hostPos);
        
        return ipDecimal(ipPos.toString(), ip.getMascara());
    }
    
    /**
     * Este método combierte una dirección IP a binario.
     * 
     * @return La dirección IP en binario.
     */
    public String ipBinario(){
        String binIp = Transformador.ajustarOchoBits(Transformador.decimalBinario(ip.getPrimerOcteto()))
                + Transformador.ajustarOchoBits(Transformador.decimalBinario(ip.getSegundoOcteto()))
                + Transformador.ajustarOchoBits(Transformador.decimalBinario(ip.getTercerOcteto()))
                + Transformador.ajustarOchoBits(Transformador.decimalBinario(ip.getCuartoOcteto()));
        return binIp;
    }
    
    /**
     * Este método combierte una dirección IP a binario.
     * 
     * @param IP La dirección IP que se quiere combertir.
     * @return La dirección IP en binario.
     */
    private String ipBinario(IP ip){
        String binIp = Transformador.ajustarOchoBits(Transformador.decimalBinario(ip.getPrimerOcteto()))
                + Transformador.ajustarOchoBits(Transformador.decimalBinario(ip.getSegundoOcteto()))
                + Transformador.ajustarOchoBits(Transformador.decimalBinario(ip.getTercerOcteto()))
                + Transformador.ajustarOchoBits(Transformador.decimalBinario(ip.getCuartoOcteto()));
        return binIp;
    }
    
    /**
     * Este método combierte una dirección IP a decimal y devuelve un objeto IP.
     * 
     * @param ipBin La dirección IP en binario.
     * @param mascara La máscara de la dirección IP en decimal.
     * @return La dirección IP en decimal.
     * @throws java.lang.Exception Si la IP no es válida se lanza una excepción.
     */
    public static IP ipDecimal(String ipBin, int mascara) throws Exception{
        IP ip;
        
        // Si la secuencia binaria tiene el tamaño correcto la combertimos.
        if (ipBin.length() == 32){
            ip = new IP(Transformador.binarioDecimal(ipBin.substring(0, 8)), 
                Transformador.binarioDecimal(ipBin.substring(8, 16)),
                Transformador.binarioDecimal(ipBin.substring(16, 24)),
                Transformador.binarioDecimal(ipBin.substring(24, 32)), mascara);
            return ip;
        }else{
            throw new Exception("IP fuera del rango");
        }
    }
}
