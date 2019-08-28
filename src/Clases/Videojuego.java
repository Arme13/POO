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
public class Videojuego {
    private String genero;
    private String nombre;
    private int precio;
    
    public Videojuego(){
    
    }
    
    public Videojuego(String g, String n, int p){
        this.genero= g;
        this.nombre= n;
        this.precio= p;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public void setGenero(String genero){
        this.genero= genero;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public int getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(int precio){
        this.precio= precio;
    }

    @Override
    public String toString() {
        return "Tu videojuego es: "+ nombre +" de genero: "+ genero;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.precio;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Videojuego other = (Videojuego) obj;
        if (this.precio != other.precio) {
            return false;
        }
        return true;
    }

}
