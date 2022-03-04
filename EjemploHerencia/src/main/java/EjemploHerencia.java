
import java.util.Date;


public class EjemploHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000);
        empleado1.setEdad(28);
        empleado1.setGenero('M');
        empleado1.setDireccion("Pijaos");
        System.out.println(empleado1);
        
        Cliente cliente1 = new Cliente(new Date(), true);
        cliente1.setNombre("Carlos");
        cliente1.setEdad(29);
        cliente1.setGenero('M');
        cliente1.setDireccion("Altos del bosque de San Carlos");
        System.out.println(cliente1);
    }
}
