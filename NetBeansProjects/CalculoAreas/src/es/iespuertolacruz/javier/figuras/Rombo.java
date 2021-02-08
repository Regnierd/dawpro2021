package es.iespuertolacruz.javier.figuras;

/**
 *
 * @author javier
 */
public class Rombo extends Figura{
    
    public Rombo(){
        super();
         
    }

    public Rombo(double diagonalMayor, double diagonalMenor) {
        
        if ((diagonalMayor <= 0) || (diagonalMenor <= 0)) {
            throw new ArithmeticException("Error,"
                    + " ha introducido una diagonal igual"
                    + " o menor a cero");
        }
        
        this.altura = diagonalMayor;
        this.base = diagonalMenor;
    }

    public double getDiagonalMayor() {
        return altura;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.altura = diagonalMayor;
    }

    public double getDiagonalMenor() {
        return base;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.base = diagonalMenor;
    }
    
    /**
     * Funcionp para calcular el area de un rombo.
     * @return
     */
    @Override
    public double area() {
        return (altura*base)/2;
    }

    @Override
    public String toString() {
        return "Rombo: diagonalMayor{ " + altura + " }" + "diagonalMenor{ " + base + " }"; 
    }
    
    
}
