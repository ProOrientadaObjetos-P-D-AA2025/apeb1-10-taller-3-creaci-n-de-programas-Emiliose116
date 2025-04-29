/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3poo;

/**
 *
 * @author L E N O V O
 */
public class Problema5_EjecutorEstudiante {
    
    public static void main(String[] args) {
        Problema5_Estudiante estudianteUno = new Problema5_Estudiante("Ana López", 7.5, 8.0, 6.5);
        Problema5_Estudiante estudianteDos = new Problema5_Estudiante("Carlos Pérez", 5.0, 6.0, 5.5);

        
        System.out.println("Los datos del objeto estudianteUno son: ");
        System.out.println("Nombre: " + estudianteUno.getNombre());
        System.out.println("Calificación Materia 1: " + estudianteUno.getCalificacionMateria1());
        System.out.println("Calificación Materia 2: " + estudianteUno.getCalificacionMateria2());
        System.out.println("Calificación Materia 3: " + estudianteUno.getCalificacionMateria3());
        System.out.println("Promedio: " + String.format("%.2f", estudianteUno.getPromedio()));
        System.out.println("Estado: " + estudianteUno.getEstado());

        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("Los datos del objeto estudianteDos son: ");
        System.out.println("Nombre: " + estudianteDos.getNombre());
        System.out.println("Calificación Materia 1: " + estudianteDos.getCalificacionMateria1());
        System.out.println("Calificación Materia 2: " + estudianteDos.getCalificacionMateria2());
        System.out.println("Calificación Materia 3: " + estudianteDos.getCalificacionMateria3());
        System.out.println("Promedio: " + String.format("%.2f", estudianteDos.getPromedio()));
        System.out.println("Estado: " + estudianteDos.getEstado());
    }
}
