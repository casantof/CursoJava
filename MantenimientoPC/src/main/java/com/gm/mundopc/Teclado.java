package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclados;
        
    //Constructos con 2 argumentos que inicializa variables
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        idTeclado = ++contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", " + super.toString();
    }
      
}
