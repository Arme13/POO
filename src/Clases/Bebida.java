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
public class Bebida {
    private float capacidad;
    private String marca;
    private String sabor;
    
    public Bebida(){
    
    }
    
    public Bebida(float c, String m, String s){
        this.capacidad= c;
        this.marca= m;
        this.sabor= s;
    }
    
    public float getCapacidad(){
        return this.capacidad;
    }
    
    public void setCapacidad(float capacidad){
        this.capacidad= capacidad;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca= marca;
    }
    
    public String getSabor(){
        return this.sabor;
    }
    
    public void setSabor(String sabor){
        this.sabor= sabor;
    }
    
}
