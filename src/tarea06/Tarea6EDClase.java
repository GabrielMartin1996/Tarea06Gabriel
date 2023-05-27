/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea06;

/**
 *
 * @author Gabriel
 */
public class Tarea6EDClase {
    
    public void aplicarDescuento(double precioProducto, int numProductos){
   
        double total;
        if(numProductos>3){
            precioProducto-=5;
                if (numProductos!=0){
                total = precioProducto*0.8;
                imprimirResultado(total);
            }else {
                total = precioProducto*0.95;
                imprimirResultado(total);
            }   

            }
    }

    public void imprimirResultado(double total) {
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");
    }
}