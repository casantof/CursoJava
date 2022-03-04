
public class PruebaAritmetica {

    public static void main(String[] args) {
        
        //variables locales
        int operandoa = 6;
        int operandob = 2;
        
        //creamos un objeto de clase aritmetica enviando argumentos
        Aritmetica objeto1 = new Aritmetica(operandoa, operandob);
        
        //imprimos los valores de los operandos
        System.out.println("operandoa = " + operandoa);
        System.out.println("operandob = " + operandob);
        
        //imprimimos el resultado de la suma
        System.out.println("\nresultado de la suma = " + objeto1.sumar());
        
        System.out.println("\nresultado de la resta = " + objeto1.restar());
        
        System.out.println("\nresultado de la multiplicación = " + objeto1.multiplicar());
        
        System.out.println("\nresultado de la división = " + objeto1.dividir());
        
 
    }

}
