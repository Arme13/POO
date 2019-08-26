/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author dany_
 */
public class Animal extends SeresVivos {
    
    private double peso;
    private double altura;
    private String nombre_cientifico;

    public Animal() {
        this.peso = 0.0;
        this.altura = 0.0;
        this.nombre_cientifico = "Desconocido";
        
    }

    public Animal(String alimentacion, String clasificacion, String adn,
                  double peso, double altura, String nombre_cientifico) {
        super(alimentacion, clasificacion, adn);
        this.peso = peso;
        this.altura = altura;
        this.nombre_cientifico = nombre_cientifico;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the nombre_cientifico
     */
    public String getNombre_cientifico() {
        return nombre_cientifico;
    }

    /**
     * @param nombre_cientifico the nombre_cientifico to set
     */
    public void setNombre_cientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }
    
}
