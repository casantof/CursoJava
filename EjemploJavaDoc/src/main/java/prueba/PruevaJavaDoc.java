/*
* Derechos reservados GlobalMentoring.com.mx
*/

package prueba;

import com.gm.javadoc.*;

/**
 * Clase para probar el concepto de javaDoc
 * @author CarlosAlbertoSantofi
 * @version 1.0
 */
public class PruevaJavaDoc {
    
    /**
     * Metodo que ejecuta la prueba de la clase Aritmetica
     * @param args es un arreglo de tipo String de la linea de comandos
     */    
    public static void main(String[] args) {
        
        Aritmetica aritmetica = new Aritmetica(3,2);
        int resultado = aritmetica.sumar();
        System.out.println("resultado = " + resultado);
    }
}
