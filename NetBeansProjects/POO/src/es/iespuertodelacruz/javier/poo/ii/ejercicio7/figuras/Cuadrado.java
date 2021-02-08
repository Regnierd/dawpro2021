
package es.iespuertodelacruz.javier.poo.ii.ejercicio7.figuras;

/**
 *
 * @author Javi
 */
public class Cuadrado extends Figura {
    
    public Cuadrado(double lado) {
        super(lado);
    }
    
    @Override
    public double perimetro() {
        return getLado()*4;
    }

    @Override
    public double area() {
        return getLado()*getLado();
    }

    @Override
    public void escalar(double escala) {
        if(escala>0){
           setLado(getLado()*escala);
        }else{
           setLado(getLado()/escala);          
        }
    }
    @Override
    public String toString() {
        return "[Cuadrado: " + " lado = " + getLado() + "]";
    }

    
       
}
