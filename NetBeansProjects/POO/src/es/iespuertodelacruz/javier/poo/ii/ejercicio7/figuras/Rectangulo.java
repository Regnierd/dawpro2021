
package es.iespuertodelacruz.javier.poo.ii.ejercicio7.figuras;

/**
 *
 * @author Javi
 */
public class Rectangulo extends Figura{

    public Rectangulo(double lado, double altura) {
        super(lado, altura);
    }
    
    
    @Override
    public double perimetro() {
        return (getLado()*2)+(this.getAltura()*2);
    }

    @Override
    public double area() {
        return getLado()*getAltura();
    }

    @Override
    public void escalar(double escala) {
        if(escala>0){
           setLado(getLado()*escala);
           setAltura(getAltura()*escala);
        }else{
            setLado(getLado()/escala);
           setAltura(getAltura()/escala);
        }
    }
    
    @Override
    public String toString() {
        return "[Rectangulo: " + " lado = " +getLado() + " altura = "+getAltura()+ "]";
    }

    
}
