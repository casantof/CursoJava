package ventas;

import com.mg.ventas.*;

public class Ventas {

    public static void main(String[] args) {
        //Crear varios objetos de tipo producto
        Producto producto1 = new Producto("casmisa", 50);
        Producto producto2 = new Producto("Pantalon", 100);
        
        Producto producto3 = new Producto("Televisor", 100000);
        Producto producto4 = new Producto("Nevera", 50000);
        Producto producto5 = new Producto("Lavadora", 1500000);

        //Creamos un bjeto de tipo Orden
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();

        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        
        //Imprimir esta orden
        orden1.mostrarOrden();
        orden2.mostrarOrden();
    }
}
