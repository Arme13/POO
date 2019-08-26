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
public class Perro extends Animal {
    
    private int edad;
    private String nombre;
    private int prom_vida;

    public Perro() {
        this.edad = 0;
        this.nombre = "Desconocido";
        this.prom_vida = 0;
        
    }

    public Perro(String alimentacion, String clasificacion, String adn,
                  double peso, double altura, String nombre_cientifico,
                  int edad, String nombre, int prom_vida) {
        super(alimentacion, clasificacion, adn, peso, altura, nombre_cientifico);
        this.edad = edad;
        this.nombre = nombre;
        this.prom_vida = prom_vida;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
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
     * @return the prom_vida
     */
    public int getProm_vida() {
        return prom_vida;
    }

    /**
     * @param prom_vida the prom_vida to set
     */
    public void setProm_vida(int prom_vida) {
        this.prom_vida = prom_vida;
    }
    
}
