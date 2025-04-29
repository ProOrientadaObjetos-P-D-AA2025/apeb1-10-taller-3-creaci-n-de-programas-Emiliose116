package taller3poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author L E N O V O
 */
public class Problema1_EjecutorTerreno {

    public static void main(String[] args) {

        Problema1_Terreno terreno = new Problema1_Terreno();

        double ancho = 23.5;
        double largo = 46.7;
        double valorMetro = 60.65;

        terreno.establecerAncho(ancho);
        terreno.establecerLargo(largo);
        terreno.establecerValorMetroCuadrado(valorMetro);

        terreno.calcularArea();
        terreno.calcularCostoTerreno();

        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("Los datos del objeto Terreno son:");
        System.out.printf("Ancho: %.2f metros\n", terreno.obtenerAncho());
        System.out.printf("Largo: %.2f metros\n", terreno.obtenerLargo());
        System.out.printf("Área: %.2f metros cuadrados\n", terreno.obtenerArea());
        System.out.printf("Valor por metro cuadrado: $%.2f\n", terreno.obtenerValorMetroCuadrado());
        System.out.printf("Costo total del terreno: $%.2f\n", terreno.obtenerCostoTerreno());
    }
}
