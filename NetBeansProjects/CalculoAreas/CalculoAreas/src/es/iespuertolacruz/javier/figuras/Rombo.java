
package es.iespuertolacruz.javier.figuras;

/**
 *
 * @author javier
 */
public class Rombo extends Figura{
    
    /**
     * Constructor vacio.
     */
    public Rombo() {
        super();
    }
  
    /**
     * Constructor con los parametros del padre.
     * @param diagonalMayor
     * @param diagonalMenor 
     */
    public Rombo(int diagonalMayor, int diagonalMenor){
               
        if((diagonalMayor <= 0) || (diagonalMenor <= 0)){
            throw new ArithmeticException("Error. Ha introducido una diagonal igual o menor a cero");
        }
        this.altura = diagonalMayor;
        this.base = diagonalMenor;
    }

    //Getter/Setter
    public float getBase() {
        return base;
    }

    public void setBase(float diagonalMayor) {
        this.base = diagonalMayor;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float diagonalMenor) {
        this.altura = diagonalMenor;
    }
    

    
    /**
     * Funcion que calcula el area de un rombo
     * @return 
     */
    @Override
    public float area() {
       return (float)(altura*base)/2;
    }
    
    
    
}
