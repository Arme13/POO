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
public class Delfin extends Animal {
    private String comunicacion;
    private int iq;

    public Delfin() {
        this.comunicacion = "Desconocido";
        this.iq = 0;
        
    }

    public Delfin(String alimentacion, String clasificacion, String adn, double peso, 
                 double altura, String nombre_cientifico, String comunicacion, int iq) {
        super(alimentacion, clasificacion, adn, peso, altura, nombre_cientifico);
        this.comunicacion = comunicacion;
        this.iq = iq;
    }

    /**
     * @return the comunicacion
     */
    public String getComunicacion() {
        return comunicacion;
    }

    /**
     * @param comunicacion the comunicacion to set
     */
    public void setComunicacion(String comunicacion) {
        this.comunicacion = comunicacion;
    }

    /**
     * @return the iq
     */
    public int getIq() {
        return iq;
    }

    /**
     * @param iq the iq to set
     */
    public void setIq(int iq) {
        this.iq = iq;
    }
    
}
