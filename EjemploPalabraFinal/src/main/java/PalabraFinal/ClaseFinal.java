package PalabraFinal;

public final class ClaseFinal {
    
    //Variables marcadas como final
    public final int VarNumero = 10;
    
    //constante en java
    public static final int VAR_PRIMITIVO = 15;
    
    public static final Persona VAR_PERSONA = new Persona();
    
    //Metodo final, lo veremos a detalle en el tema de sobreescritura
    public final void metodoFinal(){}
    
    
    
    
    //no es posible crear clases hijas de esta clase marcada con la palabra reservada final
    //class ClaseHIja extends ClaseFinal{
    
    //}
    //No es posible modificar el comportamiento (Sobreescritura)
    //de un metodo padre marcado como final
    //public void metodoFinal(){}
    
}
