/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3poo;

/**
 *
 * @author L E N O V O
 */
public class Problema8_Cheque {
   private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public Problema8_Cheque(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
        calcularComisionBanco();
    }

    public void calcularComisionBanco() {
        comisionBanco = valorCheque * 0.00003;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public double getComisionBanco() {
        return comisionBanco;
    } 
}
