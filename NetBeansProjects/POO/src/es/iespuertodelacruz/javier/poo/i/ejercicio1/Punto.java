/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier.poo.i.ejercicio1;

import java.util.Random;

/**
 *
 * @author Javi
 */
public class Punto {
    private int x;
    private int y;

    public Punto() {
        x = 0;
        y = 0;
    }

    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Metodo para darle datos a x e y mediante un metodo aparte.
     * @param x
     * @param y 
     */
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    /**
     * Metodo para desplazar el punto
     * @param dx
     * @param dy 
     */
    public void desplaza(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    
    /**
     * Funcion para calcular la distancia entre dos puntos
     * @param p
     * @return int
     */
    public int distancia(Punto p){
        int cateto1 = x - p.getX();
        int cateto2 = y - p.getY();
        int hipotenusa = (int)Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        return hipotenusa;
    }
    
    /**
     * Funcion para crear un punto aleatorio.
     * @return Punto
     */
    public static Punto creaPuntoAleatorio(){
        Random numero = new Random();       
        Punto punto = new Punto();
        
        punto.setXY(numero.nextInt((100-(-100)+1)+(-100)), numero.nextInt((100-(-100)+1)+(-100)));
        return punto;
    }
    
    /**
     * Metodo para imprimir los datos
     * @return String
     */
    public String imprime() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
