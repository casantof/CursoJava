package com.gm.javadoc;

/**
 * Esta clase permite realizar operaciones de aritmetica como sumar, restar, etc...
 * 
 * @author Carlos Alberto Santofi
 * @version 1.0
 */

public class Aritmetica {
    
    /**
     * Primer operando
     */
    int operandoA;
    
    /**
     * Segundo operando
     */
    int operandoB;
    
    /**
     * Constructor vacio de la clase
     */
    public Aritmetica(){
        
    }
    
    /**
     *Contructor con 2 argumentos 
     * @param operandoA es el primer operando
     * @param operandoB es el segundo operando
     */
    public Aritmetica(int operandoA, int operandoB){
        this.operandoA = operandoA;
        this.operandoB = operandoB;
    }
            
    /**
     * Este metodo realiza la suma de 2 operando enteros
     * @return int resultado de la suma
     */
    public int sumar(){
        return this.operandoA + this.operandoB;
    }
    
    
}
