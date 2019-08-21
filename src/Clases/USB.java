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
public class USB {
    private String marca;
    private String capacidad;
    private int precio;
    
    public USB(){
    
    }
    
    public USB(String m, String c, int p){
        this.marca= m;
        this.capacidad= c;
        this.precio= p;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca= marca;
    }
    
    public String getCapacidad(){
        return this.capacidad;
    }
    
    public void setCapacidad(String capacidad){
        this.capacidad= capacidad;
    }
    
    public int getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(int precio){
        this.precio= precio;
    }
    
}
