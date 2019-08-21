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
public class Equipo {
    private String pais;
    private String liga;
    private String nombre;
    
    public Equipo(){
    
    }
    
    public Equipo(String p, String l, String n){
        this.pais= p;
        this.liga= l;
        this.nombre= n;
    }
    
    public String getPais(){
        return this.pais;
    }
    
    public void setPais(String pais){
        this.pais= pais;
    }
    
    public String getLiga(){
        return this.liga;
    }
    
    public void setLiga(String liga){
        this.liga= liga;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
}
