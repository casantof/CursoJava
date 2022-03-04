package Matrices;

public class EjemploMatricesPrueba {
    public static void main(String[] args) {
        //1. Declaramos una matriz de tipo int
        int edades[][];
        
        //2. Instanciamos la matriz int
        edades = new int [3][2];
        
        //3. Instanciar los valores de la matriz
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;
        
        System.out.println("Matriz enteros indice 0 0: " + edades[0][0]);
        System.out.println("Matriz enteros indice 0 1: " + edades[0][1]);
        System.out.println("Matriz enteros indice 1 0: " + edades[1][0]);
        System.out.println("Matriz enteros indice 1 1: " + edades[1][1]);
        System.out.println("Matriz enteros indice 2 0: " + edades[2][0]);
        System.out.println("Matriz enteros indice 2 1: " + edades[2][1]);
        
        //1. Declarar e instanciar una matriz de objetos de tipo persona
        Persona persona[][] = new Persona[1][2];
        
        //2. Inicializamos valores
        persona[0][0] = new Persona("Juan");
        persona[0][1] = new Persona("Karla");
        
        //3. Imprimimos
        System.out.println("Matriz persona indice 0 0: " + persona[0][0]);
        System.out.println("Matriz persona indice 0 1: " + persona[0][1]);
        
        
        for(int renglon = 0; renglon < persona.length; renglon++){
            for(int columna = 0; columna < persona[renglon].length; columna++){
                System.out.println("Matriz enteros indice: " + renglon + " - " + columna + ": " + persona[renglon][columna]);
            }
        }
        
        
        
    }
}
