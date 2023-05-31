package Inventario;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import Inventario.Producto;

public class Menu {

    public static void main(String[] args) {
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);

        while (!salir) {
            //Opciones del menú
            System.out.println("********** Menú principal **********");
            System.out.println("1. Agregar producto.");
            System.out.println("2. Eliminar producto.");
            System.out.println("3. Buscar producto.");
            System.out.println("4. Modificar producto.");
            System.out.println("5. Mostrar inventario.");
            System.out.println("6. Realizar venta.");
            System.out.println("7. Generar factura.");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Agregar un producto al inventario
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese el precio del producto: $");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad de producto: ");
                    int cantidad = scanner.nextInt();
                    Producto producto = new Producto(nombre, precio, cantidad);
                    Inventario.agregarProducto(producto);
                    System.out.println("\nProducto agregado con éxito.\n");
                    break;

                case 2:
                    // Eliminar un producto del inventario
                    System.out.println("Productos en inventario:");
                    Inventario.mostrarInventario();
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String nombreEliminar = scanner.next();
                    Producto productoEliminar = Inventario.buscarProducto(nombreEliminar);
                    if (productoEliminar == null) {
                        System.out.println("No se encontró el producto a eliminar.");
                    } else {
                        Inventario.eliminarProducto(productoEliminar);
                        System.out.println("\nProducto eliminado con éxito.\n");
                    }
                    break;

                case 3:
                    // Buscar un producto en el inventario
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String nombreBuscar = scanner.next();
                    Producto productoBuscar = Inventario.buscarProducto(nombreBuscar);
                    if (productoBuscar == null) {
                        System.out.println("No se encontró el producto.");
                    } else {
                        System.out.println("\nProducto encontrado:\n" + productoBuscar + "\n");
                    }
                    break;

                case 4:
                    // Modificar un producto del inventario
                    System.out.println("Productos en inventario:");
                    Inventario.mostrarInventario();
                    System.out.print("Ingrese el nombre del producto a modificar: ");
                    String nombreModificar = scanner.next();
                    Producto productoModificar = Inventario.buscarProducto(nombreModificar);
                    if (productoModificar == null) {
                        System.out.println("No se encontró el producto.");
                    } else {
                        System.out.print("Ingrese el nuevo nombre del producto: ");
                        String nuevoNombre = scanner.next();
                        System.out.print("Ingrese el nuevo precio del producto: $");
                        double nuevoPrecio = scanner.nextDouble();
                        System.out.print("Ingrese la nueva cantidad de producto: ");
                        int nuevaCantidad = scanner.nextInt();
                        productoModificar.setNombre(nuevoNombre);
                        productoModificar.setPrecio(nuevoPrecio);
                        productoModificar.setCantidad(nuevaCantidad);
                        System.out.println("\nProducto modificado con éxito.\n");
                    }
                    break;

                case 5:
                    // Mostrar el inventario de productos
                    System.out.println("Productos en inventario:");
                    Inventario.mostrarInventario();
                    break;

                case 6:
                    // Realizar una venta de un producto
                    System.out.println("Productos en inventario:");
                    Inventario.mostrarInventario();
                    System.out.print("Ingrese el nombre del producto a vender: ");
                    String nombreVenta = scanner.next();
                    Producto productoVenta = Inventario.buscarProducto(nombreVenta);
                    if (productoVenta == null) {
                        System.out.println("No se encontró el producto.");
                    } else {
                        System.out.print("Ingrese la cantidad a vender: ");
                        int cantidadVenta = scanner.nextInt();
                        if (cantidadVenta > productoVenta.getCantidad()) {
                            System.out.println("No hay suficiente stock para realizar la venta.");
                        } else {
                            productoVenta.setCantidad(productoVenta.getCantidad() - cantidadVenta);
                            System.out.println("Venta realizada con éxito.");
                        }
                    }
                    break;

                case 7:
                    // Generar una factura de venta
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();
                    System.out.print("Ingrese la dirección del cliente: ");
                    String direccionCliente = scanner.nextLine();
                    Date fecha = new Date();
                    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    String fechaActual = formatoFecha.format(fecha);
                    System.out.println("\n********** Factura **********");
                    System.out.println("Fecha: " + fechaActual);
                    System.out.println("Cliente: " + nombreCliente);
                    System.out.println("Dirección: " + direccionCliente);
                    System.out.println("Productos vendidos:");
                    Inventario.mostrarInventario();
                    System.out.println("*****************************");
                    break;

                case 0:
                //Salir del programa
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
            }
        }
        scanner.close();
    }
}