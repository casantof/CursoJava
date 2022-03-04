package com.gm.mundopc.proyectocarlos;

public class Orden {

    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int maxComputadoras = 10;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        //Se instancia o inicializa el arreglo
        computadoras = new Computadora[maxComputadoras];
    }

    public void agregarComputadora(Computadora computadora){
        if (contadorComputadoras < maxComputadoras){
            computadoras[contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("EL numero de computadoras supera el maximo permitido: " +  maxComputadoras);
        }
    }
    public void mostrarOrden(){
        System.out.println("Orden #: " + idOrden);
        System.out.println("COmputadora de la Orden #: " + idOrden + ";");
        for(int i = 0; i < contadorComputadoras; i++){
            System.out.println(computadoras[i]);
        }
    }
}
