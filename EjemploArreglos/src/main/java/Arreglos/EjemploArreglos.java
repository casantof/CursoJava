package Arreglos;

public class EjemploArreglos {
    public static void main(String[] args) {
        //1. Declarar una variable de tipo arreglo, un arreglo de tipo int
        int edades[];
        
        //2. Instanciamos el areglo de int
        edades = new int[3];
        
        //3. Inicializamos los valores de los elementos del arreglo
        
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;
        
        //Imprimimos los valores del arreglo
        System.out.println("Arreglo enteros indice 0: " + edades[0]);
        System.out.println("Arreglo enteros indice 1: " + edades[1]);
        System.out.println("Arreglo enteros indice 2: " + edades[2]);   
        
        //Arreglos de tipo object
        Persona persona [] = new Persona[4];
        
        //Inicializamos los valores del arreglo
        persona[0]= new Persona("Juan");
        //persona[1]= new Persona("Pedro");
        persona[2]= new Persona("Karla");
        //persona[3]= new Persona("Carlos");        
        
        System.out.println("Arreglo personas en el indice 0: " + persona[0]);
        System.out.println("Arreglo personas en el indice 1: " + persona[1]);        
        System.out.println("Arreglo personas en el indice 2: " + persona[2]); 
        System.out.println("Arreglo personas en el indice 3: " + persona[3]);        
    
        //Arreglo utilizando notacion simplificada
        String nombres[] = {"Sara", "Laura", "Carlos", "Carmen"};
        for (int i=0; i < nombres.length; i++){
            System.out.println("Arreglo String indice: " + i + ": " + nombres[i] );
        }
    }
    
}
