package calculadora.objects;

import calculadora.lib.CalculosIP;
import calculadora.lib.Convertir;

/**
 * Esta clase contiene una dirección IP, consta de sus 4 octetos y una máscara de
 * red expecificada en bits. Cuenta con funciones para el manejo de la ip.
 * 
 * @author javier
 */
public final class IP {
    private int primerOcteto, segundoOcteto, tercerOcteto, cuartoOcteto, mascara;

    /**
     * Constructor de la calse IP.
     * 
     * @param primerOcteto Primer octeto de la ip.
     * @param segundoOcteto Segundo octeto de la ip.
     * @param tercerOcteto Tercer octeto de la ip.
     * @param cuartoOcteto Cuarto octeto de la ip.
     * @param mascara Máscara de la ip.
     * @throws java.lang.Exception Si la ip no es válida se lanza una excepción.
     */
    public IP(int primerOcteto, int segundoOcteto, int tercerOcteto, int cuartoOcteto, int mascara) throws Exception {
        try {
            setPrimerOcteto(primerOcteto);
            setSegundoOcteto(segundoOcteto);
            setTercerOcteto(tercerOcteto);
            setCuartoOcteto(cuartoOcteto);
            setMascara(mascara);
        } catch (Exception e) {
            throw new Exception("Ip no válida");
        }
    }

    public IP() throws Exception {
        this(0,0,0,0,1);
    }

    public void setPrimerOcteto(int primerOcteto) throws Exception {
        if (primerOcteto > -1 && primerOcteto < 256){
            this.primerOcteto = primerOcteto;
        }else{
            throw new Exception("Ip no válida");
        }
        
    }

    public void setSegundoOcteto(int segundoOcteto) throws Exception {
        if (segundoOcteto > -1 && segundoOcteto < 256){
            this.segundoOcteto = segundoOcteto;
        }else{
            throw new Exception("Ip no válida");
        }
    }

    public void setTercerOcteto(int tercerOcteto) throws Exception {
        if (tercerOcteto > -1 && tercerOcteto < 256){
            this.tercerOcteto = tercerOcteto;
        }else{
            throw new Exception("Ip no válida");
        }
    }

    public void setCuartoOcteto(int cuartoOcteto) throws Exception {
        if (cuartoOcteto > -1 && cuartoOcteto < 256){
            this.cuartoOcteto = cuartoOcteto;
        }else{
            throw new Exception("Ip no válida");
        }
    }

    public void setMascara(int mascara) throws Exception {
        if (mascara > 0 && mascara < 33){
            this.mascara = mascara;
        }else{
            throw new Exception("Ip no válida");
        }
    }

    public int getPrimerOcteto() {
        return primerOcteto;
    }

    public int getSegundoOcteto() {
        return segundoOcteto;
    }

    public int getTercerOcteto() {
        return tercerOcteto;
    }

    public int getCuartoOcteto() {
        return cuartoOcteto;
    }

    public int getMascara() {
        return mascara;
    }
    
    /**
     * Este método se encarga de sacar la dirección de subred de la dirección ip.
     * 
     * @return Un objeto IP que contiene la dirección de red.
     */
    public IP sacarDireccionDeSubred(){
        StringBuilder aux = new StringBuilder("");
        StringBuilder ipBinario = new StringBuilder(CalculosIP.ipBinario(this));
        
        // Sacamos todos los 0 que necesitemos.
        for (int i = mascara; i < 32; i++) {
            aux.append("0");
        }
        
        // Añadimos los 0 reemplazando los bits de host.
        ipBinario.replace(mascara, 32, aux.toString());
        
        try {
            return CalculosIP.ipDecimal(ipBinario.toString(), getMascara());
        } catch (Exception e) {
            return null;
        }
    }
    
    /**
     * Este método se encarga de sacar la dirección de broadcast de la dirección ip.
     * 
     * @return Un objeto IP que contiene la dirección de broadcast.
     */
    public IP sacarDireccionDeBroadcast(){
        StringBuilder aux = new StringBuilder("");
        StringBuilder ipBinario = new StringBuilder(CalculosIP.ipBinario(this));
        
        // Sacamos todos los 1 que necesitemos.
        for (int i = mascara; i < 32; i++) {
            aux.append("1");
        }
        
        // Añadimos los 1 reemplazando los bits de host.
        ipBinario.replace(mascara, 32, aux.toString());
        
        try {
            return CalculosIP.ipDecimal(ipBinario.toString(), getMascara());
        } catch (Exception e) {
            return null;
        }
    }
    
    /**
     * Este método determina la posición de la ip, en la subred a la que pertenece.
     * 
     * @return El número de la posición que se encuentra.
     */
    public int posicionIp(){
        String estaIp = CalculosIP.ipBinario(this);
        int estaIpNum = Convertir.binarioDecimal(estaIp.substring(getMascara(), 32));
        
        // Los casos con máscara mayor a 30 son especiales.
        if (getMascara() > 30){
            return estaIpNum + 1;
        }else{
            // La posición de la dirección de red o broadcast no se cuenta.
            if (this.sacarDireccionDeBroadcast().equals(this) || this.sacarDireccionDeSubred().equals(this)){
                return -1;
            }else{
                return estaIpNum;
            }
        }
    }
    
    /**
     * Esta función establece una dirección ip con  una cadena, la cadena
     * debe tener una estructura como la siguiente: X.X.X.X/X
     * 
     * @param ipStr La cadena que se quiere convertir a una IP.
     * @throws java.lang.Exception Si la ip no es válida se lanza una excepción.
     */
    public void setIp(String ipStr) throws Exception{
        int con = 0;
        StringBuilder aux = new StringBuilder();
        
        try {
            // Revisamos uno a uno todos los caracteres de la cadena y asignamos los números.
            for (int i = 0; i < ipStr.length(); i++) {
                if (ipStr.charAt(i) != '.' && ipStr.charAt(i) != '/'){
                    aux.append(ipStr.charAt(i));
                }else{
                    switch(con){
                        case 0:
                            setPrimerOcteto(Integer.parseInt(aux.toString()));
                            break;
                        case 1:
                            setSegundoOcteto(Integer.parseInt(aux.toString()));
                            break;
                        case 2:
                            setTercerOcteto(Integer.parseInt(aux.toString()));
                            break;
                        case 3:
                            setCuartoOcteto(Integer.parseInt(aux.toString()));
                            break;
                    }
                    aux.setLength(0);
                    con++;
                }
            }
            setMascara(Integer.parseInt(aux.toString()));
        } catch (Exception e) {
            throw new Exception("Ip no válida");
        }
    }
    
    /**
     * Esta función muestra de una forma detallada la información de la
     * dirección ip.
     * 
     * @return Una cadena con toda la información.
     */
    public String info(){
        int cantHost = CalculosIP.cantidadDeHost(this);
        StringBuilder resultado = new StringBuilder();
        
        resultado.append("Cálculo IP ").append(this).append("\n");
        resultado.append("--------------------------------------").append("\n");
        resultado.append("Dirección de red: ");
        resultado.append(getMascara() > 31 ? "No hay dirección de red" : sacarDireccionDeSubred()).append("\n");
        resultado.append("Dirección de broadcast: ");
        resultado.append(getMascara() > 31 ? "No hay dirección de broadcast" : sacarDireccionDeBroadcast()).append("\n");
        resultado.append("Cantidad de host válidos: ").append(cantHost).append("\n");
        resultado.append("Host mínimo: ");
        resultado.append(getMascara() > 30 ? "No hay host mínimo" : CalculosIP.buscarIp(1, this)).append("\n");
        resultado.append("Host máximo: ");
        resultado.append(getMascara() > 30 ? "No hay host máximo" : CalculosIP.buscarIp(cantHost, this)).append("\n");
        resultado.append("Posición de la IP: ");
        resultado.append(posicionIp() < 0 ? "Posición no válida" : posicionIp()).append("\n");
        resultado.append("--------------------------------------");
        
        return resultado.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        
        hash = 41 * hash + this.primerOcteto;
        hash = 41 * hash + this.segundoOcteto;
        hash = 41 * hash + this.tercerOcteto;
        hash = 41 * hash + this.cuartoOcteto;
        hash = 41 * hash + this.mascara;
        
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        IP ipComparar;
        
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ipComparar = (IP) obj;
        
        return ipComparar.toString().equals(this.toString());
    }

    @Override
    public String toString() {
        return getPrimerOcteto() + "." + getSegundoOcteto() + "." + getTercerOcteto() + "." + getCuartoOcteto() + "/" + getMascara();
    }
}
