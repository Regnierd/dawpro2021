
package es.iespuertodelacruz.javier.poo.i.ejercicio3;

import es.iespuertodelacruz.javier.poo.i.ejercicio1.Punto;
import java.util.Random;

/**
 *
 * @author Javi
 */
public class Rectangulo {
   private int x1; 
   private int y1;
   private int x2;
   private int y2;
   final private int MIN = 0;
   final private int MAX = 100;

    public Rectangulo() {
        x2 = 100;
        y2 = 100;
    }
    
    public Rectangulo(int x1, int y1, int x2, int y2) {
        if(x1>MIN && x1<MAX && y1>MIN && y1<MAX && x2>MIN && x2<MAX 
                && y2>MIN && y2<MAX){
            if(x1<x2 && y1<y2){
                this.x1 = x1;
                this.y1 = y1;               
                this.x2 = x2;
                this.y2 = y2;
            }else {
                System.err.println("Error al instanciar Rectangulo...");
            }
        }
    }

    public Rectangulo(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        if(x1<x2 && x1>MIN && x1<MAX){
            this.x1 = x1;
        }else{
            System.err.println("Error no se guardará el valor " + x1);
        }
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        if(y1<y2 && y1>MIN && y1<MAX){
            this.y1 = y1;
        }else{
            System.err.println("Error no se guardará el valor " + y1);
        }
       
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        if(x1<x2 && x2>MIN && x2<MAX){
            this.x2 = x2;
        }else{
            System.err.println("Error no se guardará el valor " + x2);
        } 
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        if(y1<y2 && y2>MIN && y2<MAX){
            this.y2 = y2;
        }else{
            System.err.println("Error no se guardará el valor " + y2);
        }
    }
    
    /**
     * Funcion para calcular el perimetro
     * @return int
     */
    public int getPerimetro(){
        int ancho = x2 - x1;
        int altura = y2 - y1;
        return (ancho*2)+(altura*2);
    }
    
    /**
     * Funcion para calcular el area
     * @return int
     */
    public int getArea(){
        int ancho = x2 - x1;
        int altura = y2 - y1;
        return ancho*altura;
    }
    
    public void setX1Y1(int x1, int y1){
        setX1(x1);
        setY1(y1);
    }
    
    public void setX2Y2(int x2, int y2){
        setX2(x2);
        setY2(y2);
    }
    
    public void setAll(int x1, int y1, int x2, int y2){
        setX1Y1(x1, y1);
        setX2Y2(x2, y2);
    }
    
    /**
     * Funcion para crear un rectangulo aleatorio.
     * @return 
     */
    public static Rectangulo crearRectanguloAleatorio(){
        Random numero = new Random();       
        Rectangulo rectangulo = new Rectangulo();
        
        rectangulo.setAll(numero.nextInt(100+1), numero.nextInt(100+1), 
                numero.nextInt(100+1), numero.nextInt(100+1));
        
        return rectangulo;
    }
    
    /**
     * Funcion para imprimir el rectangulo
     * @return 
     */
    public String imprimir() {
        return "Rectangulo{" + "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + '}';
    }
   
   
}
