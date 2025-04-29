/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3poo;

/**
 *
 * @author L E N O V O
 */
public class Problema2_EjecutorEquivalenteHora {
    public static void main(String[] args) {
       
       
        double horas = 33;

        
        Problema2_EquivalenteHora equivalente = new Problema2_EquivalenteHora(horas);

        
       
        System.out.println("Los datos del objeto EquivalenteHora son:");
        System.out.printf("Horas: %.2f\n", horas);
        System.out.printf("Minutos: %.2f\n", horas * 60);
        System.out.printf("Segundos: %.2f\n", horas * 3600);
        System.out.printf("Días: %.4f\n", horas / 24);
    }
}
