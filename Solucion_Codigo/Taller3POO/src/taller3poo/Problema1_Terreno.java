/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3poo;

/**
 *
 * @author L E N O V O
 */
public class Problema1_Terreno {

    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    
    public void establecerAncho(double ancho) {
        this.ancho = ancho;
    }

    public void establecerLargo(double largo) {
        this.largo = largo;
    }

    public void establecerValorMetroCuadrado(double valor) {
        this.valorMetroCuadrado = valor;
    }


    public void calcularArea() {
        this.area = this.ancho * this.largo;
    }

    public void calcularCostoTerreno() {
        this.costo_terreno = this.area * this.valorMetroCuadrado;
    }


    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerCostoTerreno() {
        return costo_terreno;
    }


   
}
