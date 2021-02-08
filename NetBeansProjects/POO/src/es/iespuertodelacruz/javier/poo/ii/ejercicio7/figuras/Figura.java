
package es.iespuertodelacruz.javier.poo.ii.ejercicio7.figuras;

/**
 *
 * @author Javi
 */
public abstract class Figura{
    private  double lado;
    private  double altura;
    
 
    //Constructores
    public Figura() {
        this.lado = 0;
        this.altura = 0;
        
    }

    public Figura(double lado){
        this.lado = lado;
    }
    
    public Figura(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    
    //Getter/setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public abstract double perimetro();
    
    public abstract double area();
    
    public abstract String toString();
    
    public abstract void escalar(double escala);
  
    
}
