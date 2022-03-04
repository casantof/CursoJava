
public class PalabraNull {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juan");
        System.out.println("Persona1: " + persona1.Obtenernombre());
        
        Persona persona2 = persona1;    
        System.out.println("Persona2: " + persona2.Obtenernombre());
        
        persona1 = null;
        if(persona1 != null)
            System.out.println("Persona1: " + persona1.Obtenernombre());
        else
            System.out.println("la variable persona1 no apunta a ningun objeto");
    }
}

class Persona {

    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }

    public String Obtenernombre(){
        return this.nombre;
    }
}
