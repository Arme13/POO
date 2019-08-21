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
public class Perro {
    private String raza;
    private String nombre;
    private int edad;
    
    public Perro(){
    
    }
    
    public Perro(String r, String n, int e){
        this.raza= r;
        this.nombre= n;
        this.edad= e;
    }
    
    public String getRaza(){
        return this.raza;
    }
    
    public void setRaza(String raza){
        this.raza= raza;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad= edad;
    }
    
}
