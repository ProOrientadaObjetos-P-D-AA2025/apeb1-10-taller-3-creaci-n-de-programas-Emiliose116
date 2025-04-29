/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3poo;

/**
 *
 * @author L E N O V O
 */
public class Problema5_Estudiante {
    
    private String nombre;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double promedio;
    private String estado;

    public Problema5_Estudiante(String nombre, double calificacionMateria1, double calificacionMateria2, double calificacionMateria3) {
        this.nombre = nombre;
        this.calificacionMateria1 = calificacionMateria1;
        this.calificacionMateria2 = calificacionMateria2;
        this.calificacionMateria3 = calificacionMateria3;
        calcularPromedio();
        determinarEstado();
    }

    public String getNombre() {
        return nombre;
    }

    public double getCalificacionMateria1() {
        return calificacionMateria1;
    }

    public double getCalificacionMateria2() {
        return calificacionMateria2;
    }

    public double getCalificacionMateria3() {
        return calificacionMateria3;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getEstado() {
        return estado;
    }

    private void calcularPromedio() {
        this.promedio = (calificacionMateria1 + calificacionMateria2 + calificacionMateria3) / 3;
    }

    private void determinarEstado() {
        if (promedio >= 6.5) {
            this.estado = "Aprobado";
        } else {
            this.estado = "Reprobado";
        }
    }

}
