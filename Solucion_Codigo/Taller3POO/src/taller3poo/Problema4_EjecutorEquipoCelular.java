/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3poo;

/**
 *
 * @author L E N O V O
 */
public class Problema4_EjecutorEquipoCelular {
    
 public static void main(String[] args) {
        
        
        Problema4_EquipoCelular celularUno = new Problema4_EquipoCelular(
            "Android 14",
            6.5,
            350.00,
            12.0,
            "00:1B:44:11:3A:B7",
            "358240051111110"
        );

     
        Problema4_EquipoCelular celularDos = new Problema4_EquipoCelular(
            "iOS 17",
            6.1,
            999.99,
            15.0,
            "F0:18:98:4B:6D:9C",
            "353915100000000"
        );
        
    

        System.out.println("Los datos del objeto EquipoCelular UNO son:");
        System.out.println("Sistema Operativo: " + celularUno.obtenerSistemaOperativo());
        System.out.println("Tamaño de Pantalla: " + celularUno.obtenerTamanoPantalla() + " pulgadas");
        System.out.printf("Costo Inicial: $%.2f\n", celularUno.obtenerCostoInicial());
        System.out.println("IVA (%): " + celularUno.obtenerIvaPorcentaje() + "%");
        System.out.printf("IVA del Costo Inicial: $%.2f\n", celularUno.obtenerIvaDelCostoInicial());
        System.out.printf("Costo Final: $%.2f\n", celularUno.obtenerCostoFinal());
        System.out.println("Dirección MAC: " + celularUno.obtenerDireccionMac());
        System.out.println("Información IMEI: " + celularUno.obtenerImei());
        
  
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("Los datos del objeto EquipoCelular DOS son:");
        System.out.println("Sistema Operativo: " + celularDos.obtenerSistemaOperativo());
        System.out.println("Tamaño de Pantalla: " + celularDos.obtenerTamanoPantalla() + " pulgadas");
        System.out.printf("Costo Inicial: $%.2f\n", celularDos.obtenerCostoInicial());
        System.out.println("IVA (%): " + celularDos.obtenerIvaPorcentaje() + "%");
        System.out.printf("IVA del Costo Inicial: $%.2f\n", celularDos.obtenerIvaDelCostoInicial());
        System.out.printf("Costo Final: $%.2f\n", celularDos.obtenerCostoFinal());
        System.out.println("Dirección MAC: " + celularDos.obtenerDireccionMac());
        System.out.println("Información IMEI: " + celularDos.obtenerImei());
    }
}
