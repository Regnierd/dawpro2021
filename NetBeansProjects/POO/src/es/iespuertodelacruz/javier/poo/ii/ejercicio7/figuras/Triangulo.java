
package es.iespuertodelacruz.javier.poo.ii.ejercicio7.figuras;

/**
 *
 * @author Javi
 */
public class Triangulo extends Figura{

    public Triangulo(double lado, double altura) {
        super(lado, altura);
    }

    @Override
    public double perimetro() {
        return getLado()*3;
    }

    @Override
    public double area() {
        return (getLado()*getAltura())/2;
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
        return "[Triangulo: " + " base = " + getLado()+ " altura = " +
                getAltura() + "]";
    }

   
    
}
