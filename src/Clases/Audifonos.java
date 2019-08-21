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
public class Audifonos {
    private String marca;
    private String tipo;
    private int precio;
    
    public Audifonos(){
    
    }
    
    public Audifonos(String m, String t, int p){
        this.marca= m;
        this.tipo= t;
        this.precio= p;
    }
    
     public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca= marca;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo= tipo;
    }
    
    public int getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(int precio){
        this.precio= precio;
    }
    
}
