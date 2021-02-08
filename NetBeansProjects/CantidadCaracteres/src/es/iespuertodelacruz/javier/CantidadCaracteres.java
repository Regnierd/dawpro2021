
package es.iespuertodelacruz.javier;
import es.iespuertodelacruz.javier.caracteres.CalcularDigitos;
import es.iespuertodelacruz.javier.caracteres.CalcularEspacioBlancos;
import es.iespuertodelacruz.javier.caracteres.CalcularLetras;
import java.util.Scanner;
/**
 *
 * @author javier
 */
public class CantidadCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Introduce una cadena de texto.");
        String cadena = sn.nextLine();
        
        CalcularLetras calcularLetra = new CalcularLetras(cadena);
        System.out.println("La cantidad de letras son: "+calcularLetra.calcular());
        
        CalcularDigitos calcularDigito = new CalcularDigitos(cadena);
        System.out.println("La cantidad de digitos son: "+calcularDigito.calcular());
        
        CalcularEspacioBlancos calcularEspacioBlanco = new CalcularEspacioBlancos(cadena);
        System.out.println("La cantidad de espacios en blanco son: "+calcularEspacioBlanco.calcular());
    }
    
}
