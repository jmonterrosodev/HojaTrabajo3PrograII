/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hojatrabajo3;
import java.util.Scanner;
/**
 *
 * @author jorge
 */

class Libro{
    String nombreLibro; 
    String autorLibro;
    Boolean disponibilidad;
    
    public Libro(String nombreLibro, String autorLibro){
        this.nombreLibro = nombreLibro;
        this.autorLibro = autorLibro;
        this.disponibilidad = true;
    }
    
    // Método para prestar el libro
    public void prestar() {
        if (disponibilidad) {
            disponibilidad = false;
            System.out.println("El libro '" + nombreLibro + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + nombreLibro + "' no esta disponible para prestamo.");
        }
    }

    // Método para devolver el libro
    public void devolver() {
        if(disponibilidad){
            System.out.println("El libro '" + nombreLibro + "' ya se encuentra disponible no es necesario devolverlo.");
        } else {
            disponibilidad = true;
            System.out.println("El libro '" + nombreLibro + "' ha sido devuelto.");
        }
    }

    // Método para consultar la disponibilidad del libro
    public void consultar_disponibilidad() {
        if (disponibilidad) {
            System.out.println("El libro '" + nombreLibro + "' esta disponible para prestamo.");
        } else {
            System.out.println("El libro '" + nombreLibro + "' no esta disponible para prestamo.");
        }
    }   
    
    public void getLibro(){
        System.out.println(nombreLibro + " escrito por: " + autorLibro);
    }
}


public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Bienvenido a la biblioteca solo del principito");
        Libro principito = new Libro("El principito", "Antoine de Saint-Exupery");
        int opcion;
        do{
            System.out.println("*** seleccione una de las siguientes opciones ***");
            System.out.println("1. Ver datos del libro");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Verificar disponibilidad del libro");
            opcion = lector.nextInt();
            
            switch(opcion){
                case 1:
                    principito.getLibro();
                    break;
                case 2:
                    principito.prestar();
                    break;
                case 3:
                    principito.devolver();
                    break;
                case 4:
                    principito.consultar_disponibilidad();
                    break;
                default:
                    System.out.println("Opcion invalida verifique e intente nuevamente");
                    break;
            }
            
        } while (opcion != 0);       
        
    }
    
}