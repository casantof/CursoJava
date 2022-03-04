package com.gm.mundopc;

public class Orden {

    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADOR = 10;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        
        //Se intasncia el arreglo - Inicializar el arreglo
        computadoras = new Computadora[MAX_COMPUTADOR];
    }
    
    public void agregarComputadora(Computadora computadora){
        if (contadorComputadoras < MAX_COMPUTADOR){
            computadoras[this.contadorComputadoras++] = computadora; 
        }
        else {
            System.out.println("Se ha superado el maximo de computadoras: " + computadoras);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Orden #: " + this.idOrden);
        System.out.println("Productos de la orden: " + idOrden + ":");
        for (int i = 0; i < this.contadorComputadoras; i++){
            System.out.println(computadoras[i]);   
        }
    }    
    
}
