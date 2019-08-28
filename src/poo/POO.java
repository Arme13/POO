/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Clases.Audifonos;
import Clases.Bebida;
import Clases.Carro;
import Clases.Circulo;
import Clases.Computadora;
import Clases.Consola;
import Clases.ControlV;
import Clases.Equipo;
import Clases.Mochila;
import Clases.Mouse;
import Clases.Musica;
import Clases.Pelicula;
import Clases.Pluma;
import Clases.Rectangulo;
import Clases.Tablet;
import Clases.Telefono;
import Clases.Triangulo;
import Clases.USB;
import Clases.Videojuego;
import Herencia.Animal;
import Herencia.Delfin;
import Herencia.Perro;

/**
 *
 * @author dany_
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangulo rec1 = new Rectangulo(6.2, 4.1, "Morado");
      
        Carro carro1 = new Carro("Ford", 200, "Rojo");
       
        Bebida beb1 = new  Bebida(250, "Pepsi", "Cola");
        
        Circulo circ = new Circulo(5, 2.5, "Rojo");
        
        Videojuego juego = new Videojuego("Battle Royale", "PUBG", 600);
        Videojuego juegazo = new Videojuego("Shooter", "COD", 600);
        System.out.println(juego.toString());
        System.out.println(juegazo.equals(juego));
        
        Consola consola1 = new Consola("Nintendo", "Nintendo Switch", 6500);
       
        Triangulo t1 = new Triangulo(5.2, 3.1, "Amarillo");
       
        Telefono tel = new Telefono("Huawei", "P30", 15000);
      
        Musica music = new Musica("Rock", "DLD", "Sigo siendo yo");
     
        Equipo eq = new Equipo("España", "LaLiga", "FC Barcelona");
        
        Pelicula peli = new Pelicula("Doctor Strange", "Ciencia Ficcion", "Scott Derrickson");
        
        Computadora comp = new Computadora("HP", "Core i7", 14000);
        
        Mouse m1 = new Mouse("logitech", "Inalambico", 150);
        System.out.println(m1.getMarca());
        
        USB memo = new USB("ADATA", "16GB", 250);
        
        ControlV cont = new ControlV("Inalambrico", "Nintendo", "Rojo");
        
        Mochila moch = new Mochila("Nike", "Morada", 890);
        
        Tablet tableta = new Tablet("Samsung", 2000, "Rojo");
        
        Audifonos aud = new Audifonos("Samsung", "Inalambricos", 680);
        
        Pluma pluma1 = new Pluma("BIC", "Morado", 10);
        
        Animal perro = new Animal("Carne", "Desconocida", "Animal", 20, 0.90, "Canis lupus");
        Perro perro1 = new Perro("Carne", "Labrador", "Animal", 35, 0.60, 
                                 "Labrador retriever", 2, "Doggi", 14);
        Delfin pancho = new Delfin("Peces", "Desconocida", "Animal", 250, .6, "Delphinidae", "Cetaceo", 500);
        
        System.out.println();
        
        
    }
    
}
