package PalabraFinal;

public class EjemploPalabraFinal {
    public static void main(String[] args) {
        //Modifi ca un atributo final no es posible
        //ClaseFinal.VAR_PRIMITIVO = 20;
        
        //no se puede modificar la referencia de un atributo de tipo object
        //ClaseFinal.VAR_PERSONA = new Persona();
        
        ClaseFinal.VAR_PERSONA.setNombre("Juan");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
        
        ClaseFinal.VAR_PERSONA.setNombre("Carlos");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }
}
