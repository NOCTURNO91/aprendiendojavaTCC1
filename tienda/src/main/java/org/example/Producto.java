package org.example;

public class Producto {

    //atributo
    String nombre;
    int precioUnitario;
    String descripcion;

    //contructor


    public Producto() {
    }

    public Producto(String nombre, int precioUnitario, String descripcion) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    //metodos
    public double carcularIVA(){
        return 0.0;
    }
}
