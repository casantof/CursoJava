public class Operaciones {
    
    //Metodo sumar
    public static int sumar(int a, int b){
        System.out.println("Metodo sumar(int a, int b)");
        return a + b;
    }
    
    //sobre carga del metodo sumar
    public static double sumar(double a, double b){
        System.out.println("Metodo sumar(double a, double b)");
        return a + b;
    }
    
    public static double sumar(int a, double b){
        System.out.println("Metodo sumar(int a, double b");
        return a + b;
    }
    public static double sumar(double a, int b){
        System.out.println("Metodo sumar(double a, int b");
        return a + b;
    }
}
