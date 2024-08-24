/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojatrabajo3;

/**
 *
 * @author jorge
 */
abstract class Producto{
    private final String nombre;
    private final double precio;
    public  int cantidad;
    
    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public abstract void agregar_cantidad(int cantidad);
    public abstract void vender(int cantidad);
        
    public void consultar_inventario(){
        System.out.println("Actualmente el producto " + nombre + " tiene " + cantidad + " unidad(s)");
    }
}

class ProductoElectronico extends Producto{
    
    public ProductoElectronico(String nombre,double precio, int cantidad){
        super(nombre, precio, cantidad);
    }
    
    @Override
    public void agregar_cantidad(int cantidad){
        if(cantidad > 0){
            this.cantidad += cantidad;
            System.out.println("Se agrego al inventario la cantidad indicada");
        } else {
            System.out.println("Validar la cantidad a agregar sea correcta");
        }
        
    };
    
    @Override
    public void vender(int cantidad){
        if(cantidad > this.cantidad){
            System.out.println("Verificar que la cantidad a vender es mayor al inventario actual");
        } else {
            this.cantidad -= cantidad;
            System.out.println("Se vendieron la cantidad indicada");
        }
    };    
}

public class Productos {

    public static void main(String[] args) {
         System.out.println("Inventario de productos");
         Producto telefono = new ProductoElectronico("Xiaomi 13T", 4500.00, 10);
         
        telefono.consultar_inventario();
        telefono.agregar_cantidad(5);
        telefono.consultar_inventario();
        telefono.vender(13);
        telefono.consultar_inventario();
         
    }   
}