package calculadora.objects;

/**
 * Esta clase contiene funciones que realizan cálculos para cambiar la base
 * de los números.
 * 
 * @author javier
 */
public class Transformador {
    
    /**
     * Esta función convierte un número entero en binario.
     * 
     * @param decimal El número que se quiere combertir a binario.
     * @return El resultado en binario guardado en una cadena.
     */
    public static String decimalBinario(int decimal){
        StringBuilder resultado = new StringBuilder("");
        
        // Pasamos un número decimal a binario mediante recursividad.
        if (decimal > 1){
            resultado.append(decimalBinario(decimal/2)).append(decimal%2);
        }else{
            if (decimal > 0){
                return "1";
            }else{
                return "0";
            }
        }
        
        return resultado.toString();
    }
    
    /**
     * Esta función pasa un número binario a decimal.
     * 
     * @param binario El número binario que se quiere pasar a decimal.
     * @return El resultado se devuelve en un entero.
     */
    public static int binarioDecimal(String binario){
        int resultado = 0;
        byte aux;
        
        // Este bucle pasa un número en binario a decimal.
        for (int i = 0, b = binario.length() - 1; i < binario.length(); i++, b--) {
            aux = (byte) Character.getNumericValue(binario.charAt(b));
            resultado += (aux * Math.pow(2, i));
        }
        
        return resultado;
    }
    
    /**
     * Esta función hace que si un número binario mide menos de 8 caracteres, 
     * lo ajusta a 8 caracteres añadiendo 0 a la izquierda, se usa para poder
     * aplicar la máscara de red correctamente en una IP.
     * 
     * @param numBin El número binario que se quiere ajustar
     * @return El número ajustado a 8 caracteres.
     */
    public static String ajustarOchoBits(String numBin){
        StringBuilder aux = new StringBuilder("");
        
        // Añadimos ceros en base al tamaño del número de parámetro.
        if (numBin.length() < 8){
            for (int i = numBin.length(); i < 8; i++) {
                aux.append("0");
            }
        }
        
        return aux + numBin;
    }
}
