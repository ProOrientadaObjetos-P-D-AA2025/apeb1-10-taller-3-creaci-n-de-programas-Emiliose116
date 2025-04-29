/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3poo;

/**
 *
 * @author L E N O V O
 */
public class Problema2_EquivalenteHora {
    
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;


    public Problema2_EquivalenteHora() {
    }


    public Problema2_EquivalenteHora(double horas) {
        this.horas = horas;
        this.minutos = horas * 60;
        this.segundos = horas * 3600;
        this.dias = horas / 24;
    }

}
