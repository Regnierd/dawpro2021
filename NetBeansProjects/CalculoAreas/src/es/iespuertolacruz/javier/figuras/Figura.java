
package es.iespuertolacruz.javier.figuras;

/**
 *
 * @author javier
 */
public abstract class Figura {
    
    double altura;
    double base;

    public Figura() {
        altura = 0;
        base = 0;
    }
    
    public Figura(double base){
        this.base = base;
    }
    
    public Figura(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public abstract String toString();
    
    public abstract double area();
    
}
