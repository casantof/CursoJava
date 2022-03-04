public class PruebaArea {

    
    public static void main(String[] args) {
   
        int opeancho = 3;
        int opealto  = 2;
        int opeprof  = 6;
        
        CalcuCaja objeto2 = new CalcuCaja();
        int resultado = objeto2.area(opeancho, opealto, opeprof);
        System.out.println("resultado caja 2 = " + resultado);
        
        CalcuCaja objeto1 = new CalcuCaja(3, 2, 5);
        
        //Imprimo los valores de los operandos
        
        System.out.println("Ancho = " + opeancho);
        System.out.println("Alto = " + opealto);
        System.out.println("Profundo = " + opeprof);
        
        //Imprimo area de la caja
        System.out.println("\nResultado del area de la caja: " + objeto1.area());
        
}
    
}
