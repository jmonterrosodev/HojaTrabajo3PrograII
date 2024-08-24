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
public class DiferenciaEdades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese la edad de la primer persona");
        int edad = lector.nextInt();
        System.out.println("Ingrese la edad de la segunda persona");
        int edad2 = lector.nextInt();
        
        if(edad > edad2){
            System.out.println("La primer persona es mayor a la segunda");
        } else if(edad2 > edad){
            System.out.println("La segunda persona es mayor a la primera");
        } else {
            System.out.println("Ambas personas tienen la misma edad");
        }
        
    }
    
}
