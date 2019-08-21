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
public class Telefono {
    private String marca;
    private String modelo;
    private int precio;
    
    public Telefono(){
    
    }
    
    public Telefono(String m, String mod, int p){
        this.marca= m;
        this.modelo= mod;
        this.precio= p;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca= marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo= modelo;
    }
    
    public int getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(int precio){
        this.precio= precio;
    }
    
}
