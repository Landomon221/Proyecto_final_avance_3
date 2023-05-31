package Inventario;

public class Cliente {
    private String nombre;
    private String direccion;

    // Constructor de la clase Cliente que recibe el nombre y la dirección del cliente
    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Método para obtener el nombre del cliente
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre del cliente
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener la dirección del cliente
    public String getDireccion() {
        return direccion;
    }

    // Método para establecer la dirección del cliente
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /* La clase tiene dos atributos: nombre y direccion, que representan el nombre 
    y la dirección del cliente respectivamente. 
    El constructor se utiliza para inicializar los atributos nombre y direccion 
    al crear un objeto Cliente. 
    Además, la clase proporciona métodos para obtener y establecer el nombre y la
    dirección del cliente. */
    
}