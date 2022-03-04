
public class Aritmetica {

    //Atributos de la clase
    int a;
    int b;

    public Aritmetica() {
        System.out.println("Ejecutando el constructor vacio");
    }

    public Aritmetica(int a, int b) {

        this.a = a;
        this.b = b;
        System.out.println("Ejecutando el constructor con 2 argumentos");
    }

    //Creación del metodo
    public int sumar() {
        // Cuerpo del metodo
        return this.a + this.b;
    }

    public int restar() {
        return this.a - this.b;
    }
    
    public int multiplicar() {
        return this.a * this.b;
    }
    
    public int dividir () {
        return this.a / this.b;
    }
}
