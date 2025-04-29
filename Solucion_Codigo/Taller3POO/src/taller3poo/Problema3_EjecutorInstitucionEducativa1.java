/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3poo;

/**
 *
 * @author L E N O V O
 */
public class Problema3_EjecutorInstitucionEducativa1 {
    
 public static void main(String[] args) {
        
        // Crear primer objeto con datos fijos
        Problema3_InstitucionEducativa institucionUno = new Problema3_InstitucionEducativa(
            "Unidad Educativa Fiscomisional Daniel Álvarez Burneo",
            "Unidad Educativa",
            850, 
            55,     
            150.00 
        );
        
        Problema3_InstitucionEducativa institucionDos = new Problema3_InstitucionEducativa(
            "Unidad Educativa Fiscomisional La Dolorosa",
            "Unidad Educativa",
            670, 
            40,  
  
            120.50 
        );


        System.out.println("Los datos del objeto InstitucionEducativa UNO son:");
        System.out.println("Nombre: " + institucionUno.obtenerNombre());
        System.out.println("Tipo de Institución: " + institucionUno.obtenerTipoInstitucion());
        System.out.println("Número de Alumnos: " + institucionUno.obtenerNumeroAlumnos());
        System.out.println("Número de Docentes: " + institucionUno.obtenerNumeroDocentes());
        System.out.printf("Gasto proyectado por estudiante: %.2f\n", institucionUno.obtenerGastoProyectadoPorEstudiante());
        System.out.printf("Presupuesto total: %.2f\n", institucionUno.obtenerPresupuesto());

 
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("Los datos del objeto InstitucionEducativa DOS son:");
        System.out.println("Nombre: " + institucionDos.obtenerNombre());
        System.out.println("Tipo de Institución: " + institucionDos.obtenerTipoInstitucion());
        System.out.println("Número de Alumnos: " + institucionDos.obtenerNumeroAlumnos());
        System.out.println("Número de Docentes: " + institucionDos.obtenerNumeroDocentes());
        System.out.printf("Gasto proyectado por estudiante: %.2f\n", institucionDos.obtenerGastoProyectadoPorEstudiante());
        System.out.printf("Presupuesto total: %.2f\n", institucionDos.obtenerPresupuesto());
    }
}
