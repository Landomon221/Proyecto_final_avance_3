package Inventario;

public class Factura {
    private String fecha;
    private Cliente cliente;

    // Constructor de la clase Factura que recibe la fecha y el cliente asociado a la factura
    public Factura(String fecha, Cliente cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
    }

    // Método para obtener la fecha de la factura
    public String getFecha() {
        return fecha;
    }

    // Método para establecer la fecha de la factura
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    // Método para obtener el cliente asociado a la factura
    public Cliente getCliente() {
        return cliente;
    }

    // Método para establecer el cliente asociado a la factura
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Método para generar y mostrar la factura
    public void generarFactura() {
        System.out.println("\n********** Factura **********");
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Dirección: " + cliente.getDireccion());
        System.out.println("Productos vendidos:");
        Inventario.mostrarInventario();
        System.out.println("*****************************");
    }

    /* La clase tiene dos atributos: fecha, que representa la fecha de la factura, y 
cliente, que representa al cliente asociado a la factura. El constructor se 
utiliza para inicializar los atributos fecha y cliente al crear un objeto Factura. 
Además, la clase proporciona métodos para obtener y establecer la fecha y el cliente 
de la factura, así como un método generarFactura() que muestra por pantalla los 
detalles de la factura, incluyendo la fecha, el nombre y dirección del cliente y los 
productos vendidos obtenidos del inventario. */

}