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
public class Pelicula {
    private String nombre;
    private String genero;
    private String director;
    
    public Pelicula(){
    
    }
    
    public Pelicula(String n, String g, String d){
        this.nombre= n;
        this.genero= g;
        this.director= d;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public void setGenero(String genero){
        this.genero= genero;
    }
    
    public String getDirector(){
        return this.director;
    }
    
    public void setDirector(String director){
        this.director= director;
    }
    
}
