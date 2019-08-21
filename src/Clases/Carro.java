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
public class Carro {
    private String marca;
    private int velocidad;
    private String color;
    
    public Carro(){
    
    }
    
    public Carro(String m, int v, String c){
        this.marca= m;
        this.velocidad= v;
        this.color= c;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca= marca;
    }
    
    public int getVelocidad(){
        return this.velocidad;
    }
    
    public void setVelocidad(int velocidad){
        this.velocidad= velocidad;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color= color;
    }
    
}
