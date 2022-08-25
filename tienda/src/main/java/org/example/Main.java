package org.example;

import clases.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //crear un objeto de clase producto
        Producto producto=new Producto();

        //crear un objeto de la clase Scanner
        Scanner entradaPorTeclado=new Scanner(System.in);

        //preguntarle al usuario el nombre del producto
        System.out.println("el producto es:"+producto.nombre);

        System.out.println("Digite el nombre del producto");
        producto.nombre=entradaPorTeclado.next();

        System.out.println("el producto es:"+producto.nombre);

        //crear un objeto de clase cliente
        Cliente cliente = new Cliente();

        //pedir datos

        System.out.println("digite el nombre");
        producto.nombre.entradaPorTeclado=nex(System.in);
    }
}