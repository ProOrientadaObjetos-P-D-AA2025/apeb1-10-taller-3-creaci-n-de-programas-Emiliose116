/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3poo;

/**
 *
 * @author L E N O V O
 */
public class Problema8_EjecutorCheque {
    
public static void main(String[] args) {
        Problema8_Cheque chequeUno = new Problema8_Cheque("María González", "Banco Pichincha", 5000.00);
        Problema8_Cheque chequeDos = new Problema8_Cheque("Carlos Sánchez", "Banco de Loja", 3200.00);


        System.out.println("Los datos del objeto chequeUno son: ");
        System.out.println("Nombre del Cliente: " + chequeUno.getNombreCliente());
        System.out.println("Nombre del Banco: " + chequeUno.getNombreBanco());
        System.out.println("Valor del Cheque: $" + String.format("%.2f", chequeUno.getValorCheque()));
        System.out.println("Comisión del Banco: $" + String.format("%.6f", chequeUno.getComisionBanco()));

        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("Los datos del objeto chequeDos son: ");
        System.out.println("Nombre del Cliente: " + chequeDos.getNombreCliente());
        System.out.println("Nombre del Banco: " + chequeDos.getNombreBanco());
        System.out.println("Valor del Cheque: $" + String.format("%.2f", chequeDos.getValorCheque()));
        System.out.println("Comisión del Banco: $" + String.format("%.6f", chequeDos.getComisionBanco()));
    }
}
