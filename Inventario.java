package Inventario;

import java.util.ArrayList;

public class Inventario {
    // ArrayList estático para almacenar los productos en el inventario
    static ArrayList<Producto> productos = new ArrayList<>();

    // Método para agregar un producto al inventario
    public static void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para eliminar un producto del inventario
    public static void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    // Método para buscar un producto por nombre en el inventario
    public static Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    // Método para mostrar el inventario
    public static void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario:");
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }
    /* El inventario utiliza un ArrayList estático para almacenar los productos, y
    proporciona métodos para agregar, eliminar, buscar y mostrar productos en el 
    inventario.  */
}