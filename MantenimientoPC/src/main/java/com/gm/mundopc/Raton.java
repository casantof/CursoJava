package com.gm.mundopc;

public class Raton extends DispositivoEntrada {

    private final int idRaton;
    private static int contadorRatones;

    //constructor con 2 argumentos que inicializa variables
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", " + super.toString();
    }

}
