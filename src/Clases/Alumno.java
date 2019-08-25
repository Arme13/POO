/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author dany_
 */
public class Alumno {
    
    private String nombre;
    private int boleta;
    private boolean regular;
    private String carrera;

    public Alumno() {
        
        this.nombre ="";
        this.boleta =0;
        this.regular =false;
        this.carrera = "";
    
    }

    public Alumno(String nombre, int boleta, boolean regular, String carrera) {
        this.nombre = nombre;
        this.boleta = boleta;
        this.regular = regular;
        this.carrera = carrera;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the boleta
     */
    public int getBoleta() {
        return boleta;
    }

    /**
     * @param boleta the boleta to set
     */
    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }

    /**
     * @return the regular
     */
    public boolean isRegular() {
        return regular;
    }

    /**
     * @param regular the regular to set
     */
    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
}
