/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hojatrabajo3;

/**
 *
 * @author jorge
 */
abstract class Empleado{
    private final String nombre;
    private final String id;
    public double salarioBase;
    
    public Empleado(String nombre, String id){
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = 0;
    }
    
    public abstract double calcularSalario(); //metodo para obtener salario
        
    public String getNombre(){
        return nombre;
    }

    public String getId(){
        return id;
    }
    
    public void mostrarInformacion(){
        System.out.println("Empleado: " + nombre + " Id: " + id + " Salario: " + salarioBase);
    }
}

class EmpleadoPorHora extends Empleado{
    private double costoHora;
    private double cantidadHoras;

    public EmpleadoPorHora(String nombre,String id, double costoHora, double cantidadHoras){
        super(nombre, id);
        this.costoHora = costoHora;
        this.cantidadHoras = cantidadHoras;
        this.salarioBase = this.costoHora * this.cantidadHoras;
    }

    //implementamos metodo calcularSalario
    @Override
    public double calcularSalario (){
        return costoHora * cantidadHoras;
    }
}

class EmpleadoAsalariado extends Empleado{
    private double salarioMensual;

    public EmpleadoAsalariado(String nombre,String id, double salarioMensual){
        super(nombre, id);
        this.salarioMensual = salarioMensual;
        this.salarioBase = this.salarioMensual;
    }

    //implementamos metodo calcularSalario
    @Override
    public double calcularSalario(){
        return salarioMensual;
    }

}

public class NominaRecursos {    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado empleado1 = new EmpleadoAsalariado("Jorge Monterroso", "001", 4500.00);
        Empleado empleado2 = new EmpleadoPorHora("Antonio Aspuac", "002", 20.00, 180.00);
        
        System.out.println("El empleado " + empleado1.getNombre() + " tiene un salario de " + empleado1.calcularSalario());
        System.out.println("El empleado " + empleado2.getNombre() + " tiene un salario de " + empleado2.calcularSalario());
        
        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();
    }
    
}
