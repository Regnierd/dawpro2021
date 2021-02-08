
package es.iespuertodelacruz.javier;
import es.iespuertodelacruz.javier.imc.CalcularImc;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author javier
 */
public class MasaCorporal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        try{
            System.out.println("Inserte su peso");
            double peso = sn.nextInt();
            System.out.println("Inserte su altura");
            double altura = sn.nextDouble();

            CalcularImc calcularImc = new CalcularImc(peso, altura);
            calcularImc.diagnosticar();
            
        }catch(InputMismatchException e){
            System.out.println("Error. Introduce un numero entero o real con ','");
        }
        
    }
    
}
