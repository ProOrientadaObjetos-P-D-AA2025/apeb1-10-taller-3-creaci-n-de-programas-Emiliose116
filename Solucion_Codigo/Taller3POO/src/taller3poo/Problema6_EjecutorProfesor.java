/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3poo;

/**
 *
 * @author L E N O V O
 */
public class Problema6_EjecutorProfesor {
    
   public static void main(String[] args) {
        Problema6_Profesor profesorUno = new Problema6_Profesor("Luis", "Cueva", 800.00, "1102567890");
        Problema6_Profesor profesorDos = new Problema6_Profesor("María", "Paredes", 950.00, "1102789456");

      
        System.out.println("Los datos del objeto profesorUno son: ");
        System.out.println("Nombre: " + profesorUno.getNombre());
        System.out.println("Apellido: " + profesorUno.getApellido());
        System.out.println("Sueldo Básico: $" + String.format("%.2f", profesorUno.getSueldoBasico()));
        System.out.println("Sueldo Total: $" + String.format("%.2f", profesorUno.getSueldoTotal()));
        System.out.println("Cédula: " + profesorUno.getCedula());

        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("Los datos del objeto profesorDos son: ");
        System.out.println("Nombre: " + profesorDos.getNombre());
        System.out.println("Apellido: " + profesorDos.getApellido());
        System.out.println("Sueldo Básico: $" + String.format("%.2f", profesorDos.getSueldoBasico()));
        System.out.println("Sueldo Total: $" + String.format("%.2f", profesorDos.getSueldoTotal()));
        System.out.println("Cédula: " + profesorDos.getCedula());
    }
}
