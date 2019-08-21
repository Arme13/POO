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
public class Pluma {
    private String marca;
    private String color;
    private int precio;
    
    public Pluma(){
    
    }
    
    public Pluma(String m, String c, int p){
        this.marca= m;
        this.color= c;
        this.precio= p;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca= marca;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color= color;
    }
    
     public int getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(int precio){
        this.precio= precio;
    }
    
}
