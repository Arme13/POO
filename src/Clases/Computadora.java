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
public class Computadora {
    private String marca;
    private String procesador;
    private int precio;
    
    public Computadora(){
    
    }
    
    public Computadora(String m, String pro, int pre){
        this.marca= m;
        this.procesador= pro;
        this.precio= pre;
    }
    
     public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca= marca;
    }
    
    public String getProcesador(){
        return this.procesador;
    }
    
    public void setProcesador(String procesador){
        this.procesador= procesador;
    }
    
    public int getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(int precio){
        this.precio= precio;
    }
    
}
