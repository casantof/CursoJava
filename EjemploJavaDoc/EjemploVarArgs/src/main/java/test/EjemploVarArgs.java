package test;

import java.awt.font.NumericShaper;

public class EjemploVarArgs {
    public static void main(String[] args) {
        
        //Imprimir varios numeros
        imprimirNumeros(15,1,4,6,20,60,25,18);
        
        //Parametros variables
        System.out.println(" ");
        variosParametros("Juan", true, 14,2,3,6,8,9);
    }

    private static void imprimirNumeros(int... numeros) {
        //Recorremos cada elemento del arreglo
        for (int i = 0; i < numeros.length; i++) {
            int elemento = numeros[i];
            System.out.println("elemento = " + elemento);
        }
        
    }

    private static void variosParametros(String nombre, boolean bandera, int... numeros){
        System.out.println("Nombre=  " + nombre);
        System.out.println("Bandera= " + bandera);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos = " + numeros[i]);
        }
    }
    
}
