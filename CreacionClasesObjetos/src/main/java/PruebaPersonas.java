
public class PruebaPersonas {

    public static void main(String[] args) {
        
        //Creación de un objeto tipo persona
        
        //Defiición de variable tipo persona
        Persona persona1;
        
        //Instanciando (Creando) un objeto de la clase Persona
        
        persona1 = new Persona();
        
        //Accedemos a la clase Persona y desplegamos el metodo desplegarNombres
        persona1.desplegarNombres();
        
        //Modificamos los valores de los atributos del objeto persona
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        
        //volvemos a imprimir los valores
        System.out.println("");
        persona1.desplegarNombres();
        
        //Creación de un segundo objeto de tipo Persona
        Persona persona2 = new Persona();
        
        persona2.nombre   = "Angela";
        persona2.apellido = "Castañeda";
        
        System.out.println("");
        persona2.desplegarNombres();
        
        
        
        
        
        
    }

}
