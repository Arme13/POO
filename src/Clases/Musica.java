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
public class Musica {
    private String genero;
    private String artista;
    private String cancion;
    
    public Musica(){
    
    }
    
    public Musica(String g, String a, String c){
        this.genero= g;
        this.artista= a;
        this.cancion= c;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public void setGenero(String genero){
        this.genero= genero;
    }
    
     public String getArtista(){
        return this.artista;
    }
    
    public void setArtista(String artista){
        this.artista= artista;
    }
    
    public String getCancion(){
        return this.cancion;
    }
    
    public void setCancion(String cancion){
        this.cancion= cancion;
    }
    
}
