package clases;

public class Cliente {

    //atributos
    public String nombre;
    public String cedula;
    public int edad;
    public String telefono;
    boolean aplicaDescuento;

    //constructores

    public Cliente() {

    }

    //metodos
    public String saludar(){
        return "oe";
    }

    public Cliente(String nombre, String cedula, int edad, String telefono, boolean aplicaDescuento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.aplicaDescuento = aplicaDescuento;
    }
}
