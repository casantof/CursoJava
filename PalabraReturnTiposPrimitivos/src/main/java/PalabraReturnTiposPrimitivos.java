
public class PalabraReturnTiposPrimitivos {

    public static void main(String[] args) {
        
        sumarSinRetornarValor(3, 6);
        
        var resultado = sumarRetornandoValor(4, 2);
        System.out.println("El resultado de sumar retornando valor; " + resultado);
    }

    private static void sumarSinRetornarValor(int a, int b) {
        System.out.println("El resultado de sumar sin retornar valor: " + (a + b));
    }

    private static int sumarRetornandoValor(int a, int b){
        return a + b;
    }
}
