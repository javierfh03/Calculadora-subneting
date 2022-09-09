package calculadora.objects;

/**
 * Esta clase contiene una dirección IP, consta de sus 4 octetos y una máscara de
 * red expecificada en bits. Cuenta con funciones para el manejo de la IP.
 * 
 * @author javier
 */
public final class IP implements Comparable<IP>{
    private int primerOcteto, segundoOcteto, tercerOcteto, cuartoOcteto, mascara;
    private char clase;

    /**
     * Constructor de la calse IP.
     * 
     * @param primerOcteto Primer octeto de la IP.
     * @param segundoOcteto Segundo octeto de la IP.
     * @param tercerOcteto Tercer octeto de la IP.
     * @param cuartoOcteto Cuarto octeto de la IP.
     * @param mascara Máscara de la IP.
     * @throws java.lang.Exception Si la IP no es válida se lanza una excepción.
     */
    public IP(int primerOcteto, int segundoOcteto, int tercerOcteto, int cuartoOcteto, int mascara) throws Exception {
        setPrimerOcteto(primerOcteto);
        setSegundoOcteto(segundoOcteto);
        setTercerOcteto(tercerOcteto);
        setCuartoOcteto(cuartoOcteto);
        setMascara(mascara);
        
        setClase();
    }

    public IP() throws Exception {
        this(0,0,0,0,1);
    }
    
    private IP(int primerOcteto, int segundoOcteto, int tercerOcteto, int cuartoOcteto, char clase) throws Exception{
        setPrimerOcteto(primerOcteto);
        setSegundoOcteto(segundoOcteto);
        setTercerOcteto(tercerOcteto);
        setCuartoOcteto(cuartoOcteto);
        setMascara(1);
        this.clase = clase;
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

    /**
     * Este método esteblece una clase a la dirección IP dependiendo del rango en el que se encuentre.
     * 
     * @throws Exception 
     */
    public void setClase() throws Exception {
        if (this.compareTo(new IP(0, 0, 0, 0, 'A')) >= 0 && this.compareTo(new IP(127, 255, 255, 255, 'A')) < 0){
            this.clase = 'A';
        }else if (this.compareTo(new IP(128, 0, 0, 0, 'B')) >= 0 && this.compareTo(new IP(191, 255, 255, 255, 'B')) < 0){
            this.clase = 'B';
        }else if (this.compareTo(new IP(192, 0, 0, 0, 'C')) >= 0 && this.compareTo(new IP(223, 255, 255, 255, 'C')) < 0){
            this.clase = 'C';
        }else if (this.compareTo(new IP(224, 0, 0, 0, 'E')) >= 0 && this.compareTo(new IP(239, 255, 255, 255, 'E')) < 0){
            this.clase = 'D';
        }else{
            this.clase = 'E';
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

    public char getClase() {
        return clase;
    }
    
    /**
     * Este método determina la posición de la IP, en la subred a la que pertenece.
     * 
     * @return El número de la posición que se encuentra.
     */
    public int getPosicionIp(){
        String estaIp = new CalculosIP(this).ipBinario();
        int estaIpNum = Transformador.binarioDecimal(estaIp.substring(getMascara(), 32));
        
        // Los casos con máscara mayor a 30 son especiales.
        if (getMascara() > 30){
            return estaIpNum + 1;
        }else{
            // La posición de la dirección de red o broadcast no se cuenta.
            return estaIpNum;
        }
    }
    
    /**
     * Este método se encarga de sacar la dirección de subred de la dirección IP.
     * 
     * @return Un objeto IP que contiene la dirección de red.
     * @throws java.lang.Exception Devuelve error en caso de fallas en el cálculo decimal.
     */
    public IP sacarDireccionDeSubred() throws Exception{
        StringBuilder aux = new StringBuilder("");
        StringBuilder ipBinario = new StringBuilder(new CalculosIP(this).ipBinario());
        
        // Sacamos todos los 0 que necesitemos.
        for (int i = mascara; i < 32; i++) {
            aux.append("0");
        }
        
        // Añadimos los 0 reemplazando los bits de host.
        ipBinario.replace(mascara, 32, aux.toString());
        
        return CalculosIP.ipDecimal(ipBinario.toString(), getMascara());
    }
    
    /**
     * Este método se encarga de sacar la dirección de broadcast de la dirección IP.
     * 
     * @return Un objeto IP que contiene la dirección de broadcast.
     * @throws java.lang.Exception Devuelve error en caso de fallas en el cálculo decimal.
     */
    public IP sacarDireccionDeBroadcast() throws Exception{
        StringBuilder aux = new StringBuilder("");
        StringBuilder ipBinario = new StringBuilder(new CalculosIP(this).ipBinario());
        
        // Sacamos todos los 1 que necesitemos.
        for (int i = mascara; i < 32; i++) {
            aux.append("1");
        }
        
        // Añadimos los 1 reemplazando los bits de host.
        ipBinario.replace(mascara, 32, aux.toString());
        
        return CalculosIP.ipDecimal(ipBinario.toString(), getMascara());
    }
    
    /**
     * Esta función establece una dirección IP con  una cadena, la cadena
     * debe tener una estructura como la siguiente: X.X.X.X/X
     * 
     * @param ipStr La cadena que se quiere convertir a una IP.
     * @throws java.lang.Exception Si la IP no es válida se lanza una excepción.
     */
    public void setIp(String ipStr) throws Exception{
        int conOctetos = 0, conSimbolos = 0;
        StringBuilder aux = new StringBuilder();
        
        try {
            // Revisamos uno a uno todos los caracteres de la cadena y asignamos los números.
            for (int i = 0; i < ipStr.length(); i++) {
                if (ipStr.charAt(i) != '.' && ipStr.charAt(i) != '/'){
                    aux.append(ipStr.charAt(i));
                    conSimbolos++;
                }else{
                    switch(conOctetos){
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
                    conOctetos++;
                }
            }
            
            if (conSimbolos > 3){
                setMascara(Integer.parseInt(aux.toString()));
                setClase();
            }else{
                throw new Exception("Ip no válida");
            }
        } catch (Exception e) {
            throw new Exception("Ip no válida");
        }
    }
    
    /**
     * Esta función muestra de una forma detallada la información de la
     * dirección IP.
     * 
     * @return Una cadena con toda la información.
     */
    public String info(){
        CalculosIP cal = new CalculosIP(this);
        int cantHost;
        StringBuilder resultado = new StringBuilder();
        IP max, min;
        
        try {
            cantHost = cal.cantidadDeHost();
            min = cal.buscarIp(1);
            max = cal.buscarIp(cantHost);
            
            resultado.append("Cálculo IP ").append(this).append("\n");
            resultado.append("--------------------------------------").append("\n");
            resultado.append("Clase de la dirección: ").append(getClase()).append("\n");
            resultado.append("Dirección de red: ").append(sacarDireccionDeSubred()).append("\n");
            resultado.append("Dirección de broadcast: ").append(sacarDireccionDeBroadcast()).append("\n");
            resultado.append("Cantidad de host válidos: ").append(cantHost).append("\n");
            resultado.append("Host mínimo: ").append(min).append("\n");
            resultado.append("Host máximo: ").append(max).append("\n");
            resultado.append("Posición de la IP: ").append(getPosicionIp()).append("\n");
            resultado.append("--------------------------------------");
        } catch (Exception e) {
            return "";
        }
        
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
        return getPrimerOcteto() + "." + getSegundoOcteto() + "." + getTercerOcteto() + "." + getCuartoOcteto() + "/" + 
                getMascara();
    }

    @Override
    public int compareTo(IP arg0) {
        if (getPrimerOcteto() < arg0.getPrimerOcteto()){
            return -1;
        } else if (getPrimerOcteto() > arg0.getPrimerOcteto()){
            return 1;
        }
        
        if (getSegundoOcteto() < arg0.getSegundoOcteto() ){
            return -1;
        } else if (getSegundoOcteto()  > arg0.getSegundoOcteto() ){
            return 1;
        }
        
        if (getTercerOcteto() < arg0.getTercerOcteto()){
            return -1;
        } else if (getTercerOcteto() > arg0.getTercerOcteto()){
            return 1;
        }
        
        if (getCuartoOcteto() < arg0.getCuartoOcteto()){
            return -1;
        } else if (getCuartoOcteto() > arg0.getCuartoOcteto()){
            return 1;
        }
        
        return 0;
    }
}
