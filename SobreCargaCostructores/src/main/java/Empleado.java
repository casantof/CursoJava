public class Empleado extends Persona{
    
        private double sueldo;
        
    public Empleado(String nombre, int edad){
        super(nombre, edad);
    }
    
    public Empleado(String nombre, int edad, double sueldo){
        this(nombre, edad);
        // super(nombre, edad); cualquiera de la 2 funciona this o super
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "sueldo=" + sueldo + '}';
    }
    
}
