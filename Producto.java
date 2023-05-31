package Inventario;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Métodos setter para modificar los atributos del producto
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Métodos getter para obtener los atributos del producto
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Método toString para obtener una representación en forma de cadena del producto
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Precio: $" + precio + ", Cantidad: " + cantidad;
    }

    // Método equals para comparar dos objetos Producto por igualdad
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Producto other = (Producto) obj;
        return nombre.equals(other.nombre) && precio == other.precio && cantidad == other.cantidad;
    }
}
