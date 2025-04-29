/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3poo;

/**
 *
 * @author L E N O V O
 */
public class Problema7_Automotor {
    private String cedulaDuenio;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Problema7_Automotor(String cedulaDuenio, String marcaVehiculo, int anioFabricacion, double valorVehiculo) {
        this.cedulaDuenio = cedulaDuenio;
        this.marcaVehiculo = marcaVehiculo;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
        calcularValorMatricula();
    }

    public void calcularValorMatricula() {
        int anioActual = 2025; // Año actual
        int antiguedad = anioActual - anioFabricacion;
        valorMatricula = (valorVehiculo * 0.00002) * antiguedad;
    }

    public String getCedulaDuenio() {
        return cedulaDuenio;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }
}
