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
public class SeresVivos {
    private String alimentacion;
    private String clasificacion;
    private String adn;

    public SeresVivos() {
        
        this.alimentacion = "Desconocida";
        this.clasificacion = "Desconocido";
        this.adn = "Desconocido";
        
    }

    public SeresVivos(String alimentacion, String clasificacion, String adn) {
        this.alimentacion = alimentacion;
        this.clasificacion = clasificacion;
        this.adn = adn;
    }

    /**
     * @return the alimentacion
     */
    public String getAlimentacion() {
        return alimentacion;
    }

    /**
     * @param alimentacion the alimentacion to set
     */
    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    /**
     * @return the clasificacion
     */
    public String getClasificacion() {
        return clasificacion;
    }

    /**
     * @param clasificacion the clasificacion to set
     */
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * @return the adn
     */
    public String getAdn() {
        return adn;
    }

    /**
     * @param adn the adn to set
     */
    public void setAdn(String adn) {
        this.adn = adn;
    }
    
}