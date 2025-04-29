/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3poo;

/**
 *
 * @author L E N O V O
 */
public class Problema7_EjecutorAutomotor {
    
public static void main(String[] args) {
        Problema7_Automotor autoUno = new Problema7_Automotor("1101234567", "Toyota Corolla", 2018, 18000.00);
        Problema7_Automotor autoDos = new Problema7_Automotor("1107654321", "Chevrolet Spark", 2020, 12000.00);


        System.out.println("Los datos del objeto autoUno son: ");
        System.out.println("Cédula del Dueño: " + autoUno.getCedulaDuenio());
        System.out.println("Marca de Vehículo: " + autoUno.getMarcaVehiculo());
        System.out.println("Año de Fabricación: " + autoUno.getAnioFabricacion());
        System.out.println("Valor del Vehículo: $" + String.format("%.2f", autoUno.getValorVehiculo()));
        System.out.println("Valor de la Matrícula: $" + String.format("%.2f", autoUno.getValorMatricula()));

        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("Los datos del objeto autoDos son: ");
        System.out.println("Cédula del Dueño: " + autoDos.getCedulaDuenio());
        System.out.println("Marca de Vehículo: " + autoDos.getMarcaVehiculo());
        System.out.println("Año de Fabricación: " + autoDos.getAnioFabricacion());
        System.out.println("Valor del Vehículo: $" + String.format("%.2f", autoDos.getValorVehiculo()));
        System.out.println("Valor de la Matrícula: $" + String.format("%.2f", autoDos.getValorMatricula()));
    }
}
