
package es.iespuertodelacruz.javier.imc;

/**
 *
 * @author javier
 */
public class CalcularImc {
    double peso;
    double altura;

    public CalcularImc() {
        peso = 0;
        altura = 0;
    }

    public CalcularImc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /**
     * Funcion para calcular el imc.
     * @return double
     */
    public double imc(){
        return peso/Math.pow(altura, 2);
    }
    
    /**
     * Funcion para devolver el diagnostico.
     */
    public void diagnosticar(){
        if (imc()<16){
            System.out.println("Criterio de ingreo en el hospital.");
        }else if(imc() >= 16 && imc() <= 17){
            System.out.println("Infrapeso");
        }else if(imc() >= 17 && imc() <= 18){
            System.out.println("Bajo peso");
        }else if(imc() >= 18 && imc() <= 25){
            System.out.println("Peso normal(saludable)");
        }else if(imc() >= 25 && imc() <= 30){
            System.out.println("Sobrepeso");
        }else if(imc() >= 30 && imc() <= 35){
            System.out.println("Sobrepeso cronico");
        }else if(imc() >= 35 && imc() <= 40){
            System.out.println("Obesidad premorbida");
        }else if(imc() > 40){
            System.out.println("Obesidad morbida");
        }
    }
}
