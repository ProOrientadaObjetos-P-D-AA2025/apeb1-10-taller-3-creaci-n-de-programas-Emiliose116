/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3poo;

/**
 *
 * @author L E N O V O
 */
public class Problema4_EquipoCelular {
    
private String sistemaOperativo;
    private double tamanoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaDelCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String Imei;
    
    
    public Problema4_EquipoCelular(String sistemaOperativo, double tamanoPantalla,
                                    double costoInicial, double ivaPorcentaje,
                                    String direccionMac, String Imei) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMac = direccionMac;
        this.Imei = Imei;
        calcularIvaDelCostoInicial();
        calcularCostoFinal();
    }
    

    private void calcularIvaDelCostoInicial() {
        ivaDelCostoInicial = (costoInicial * ivaPorcentaje) / 100;
    }
    
    private void calcularCostoFinal() {
        costoFinal = costoInicial + ivaDelCostoInicial;
    }
    

    
    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }

    public double obtenerTamanoPantalla() {
        return tamanoPantalla;
    }

    public double obtenerCostoInicial() {
        return costoInicial;
    }

    public double obtenerIvaPorcentaje() {
        return ivaPorcentaje;
    }

    public double obtenerIvaDelCostoInicial() {
        return ivaDelCostoInicial;
    }

    public double obtenerCostoFinal() {
        return costoFinal;
    }

    public String obtenerDireccionMac() {
        return direccionMac;
    }

    public String obtenerImei() {
        return Imei;
    }
}
