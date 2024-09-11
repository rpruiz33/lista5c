package test;

import java.time.LocalDate;
import java.time.LocalTime;
import model.Carrito;
import model.ItemCarrito;
import model.Producto;
import model.Supermercado;

public class Test {

    public static void main(String[] args) {
        Supermercado s = new Supermercado();
        Producto p = new Producto(2, "cafe", 23.2f);
        Producto p2 = new Producto(1, "yerba", 50.0f);
        ItemCarrito i = new ItemCarrito(1, p, 2);
        Carrito c = new Carrito(1, LocalDate.of(2222, 02, 02), LocalTime.of(12,12));

        // Agregar items al carrito
        System.out.println("Agregando item al carrito: " + c.agregarItem(p, 22));
        System.out.println("Detalles del producto: " + p.toString());

        try {
            // Agregar productos al supermercado
            System.out.println("Agregando productos al supermercado:");
            System.out.println(s.agregaarProducto("yerba", 3));
            System.out.println(s.agregaarProducto("fideos", 3));
        } catch(Exception e) {
            System.out.println("Excepción al agregar productos: " + e.getMessage());
        }

        // Traer y eliminar productos
        System.out.println("Producto con ID 1: " + s.traerProducto(1).toString());

       /* try {
            System.out.println("Eliminando producto con ID 1: " + s.eliminarProducto(1));
            System.out.println("Eliminando producto con ID 2: " + s.eliminarProducto(2));
        } catch(Exception e) {
            System.out.println("Excepción al eliminar productos: " + e.getMessage());
        }*/

        System.out.println("-------------------------------\n");

        // Pruebas de agregar y eliminar en el carrito
        System.out.println("Agregando más unidades del producto al carrito: " + c.agregarItem(p, 20));
        System.out.println("Agregando más unidades del producto al carrito: " + c.traerItemCarrito(p).toString());
        try {
            System.out.println("Eliminando unidades del producto del carrito: " + c.eliminarItem(p, 9));
        } catch(Exception e) {
            System.out.println("Excepción al eliminar item del carrito: " + e.getMessage());
        }
    }
}
