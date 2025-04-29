/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3poo;

/**
 *
 * @author L E N O V O
 */
public class Problema3_InstitucionEducativa {
    
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private double gastoProyectadoPorEstudiante;
    private double presupuesto;

   
    public Problema3_InstitucionEducativa() {
    }


    public Problema3_InstitucionEducativa(String nombre, String tipoInstitucion,
            int numeroAlumnos, int numeroDocentes, 
            double gastoProyectadoPorEstudiante) {
        
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numeroAlumnos = numeroAlumnos;
        this.numeroDocentes = numeroDocentes;
        this.gastoProyectadoPorEstudiante = gastoProyectadoPorEstudiante;
        calcularPresupuesto();
    }

  
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public void establecerNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public void establecerNumeroDocentes(int numeroDocentes) {
        this.numeroDocentes = numeroDocentes;
    }


    public void establecerGastoProyectadoPorEstudiante(double gastoProyectadoPorEstudiante) {
        this.gastoProyectadoPorEstudiante = gastoProyectadoPorEstudiante;
    }


    public void calcularPresupuesto() {
        presupuesto = numeroAlumnos * gastoProyectadoPorEstudiante;
    }


    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }

    public int obtenerNumeroAlumnos() {
        return numeroAlumnos;
    }

    public int obtenerNumeroDocentes() {
        return numeroDocentes;
    }

    public double obtenerGastoProyectadoPorEstudiante() {
        return gastoProyectadoPorEstudiante;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }
}
