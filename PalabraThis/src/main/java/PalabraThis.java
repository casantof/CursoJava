
public class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("juan");
    }
}

class Persona{ 
    String nombre;
    
    Persona(String nombre){
        this.nombre = nombre;//This apunta a un objeto de tipo persona
        System.out.println("Impresión del operador this dentro de la clase Persona: " + this);//this esta apuntando a un objeto de tipo persona en este momento
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this);//This contiene una referencia al objeto persona
        
    }
}

class Imprimir{ 

    public void imprimir(Persona p){
    
        System.out.println("Impresión argumentos persona: " + p);//imprimiendo el valor del objeto persona
        System.out.println("IMpresión del objeto actuacl (this)" + this);//this apunta a un objeto de tipo imprimir en este momento
        
    }
}