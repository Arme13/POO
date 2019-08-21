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
public class Circulo {
    private int diametro;
    private double radio;
    private String color;
    
    public Circulo(){
    
    }
    
    public Circulo(int d, double r, String c){
        this.diametro= d;
        this.radio= r;
        this.color= c;
    }
    
    public int getDiametro(){
        return this.diametro;
    }
    
    public void setDiametro(int diametro){
        this.diametro= diametro;
    }
    
    public double getRadio(){
        return this.radio;
    }
    
    public void setRadio(double radio){
        this.radio= radio;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color= color;
    }
    
}
