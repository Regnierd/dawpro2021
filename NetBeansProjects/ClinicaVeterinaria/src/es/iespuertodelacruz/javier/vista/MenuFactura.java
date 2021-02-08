
package es.iespuertodelacruz.javier.vista;

import es.iespuertodelacruz.javier.animales.Animal;
import es.iespuertodelacruz.javier.animales.Diagnostico;
import es.iespuertodelacruz.javier.pagos.ElementoFactura;
import es.iespuertodelacruz.javier.pagos.Factura;
import static es.iespuertodelacruz.javier.vista.MenuPersona.sn;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class MenuFactura {
    static Scanner sn = new Scanner(System.in);
    static Scanner intsn = new Scanner(System.in);
    public static void subMenu(Diagnostico diagnostico) {
        
        boolean salir = false;
        int opcion;
        ArrayList<ElementoFactura> elementoFacturas = new ArrayList();
        Factura factura = null;
        while (!salir) {
            System.out.println("---------------------------------------------");
            System.out.println("-- ¿Quiere crear una factura?--");
            System.out.println("---------------------------------------------");
            System.out.println("--    1. Si                                --");
            System.out.println("--    2. No                                --");
            System.out.println("---------------------------------------------");

            try {
                System.out.print("Opción: ");
                opcion = intsn.nextInt();
                
                switch (opcion) {
                    case 1:                       
                        factura = new Factura(diagnostico);                       
                        String datos[] = pedirDatos();
                        ElementoFactura elementoFactura = new ElementoFactura(datos[0], Double.parseDouble(datos[1]), Double.parseDouble(datos[2]), factura);
                        elementoFacturas.add(elementoFactura);
                        System.out.println("Factura creada!");                       
                        factura.getElementoFacturas().add(elementoFactura);
                        System.out.println(elementoFactura.toString());
                        break;
                    case 2:
                        salir = true;                        
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe de inserte un numero");
            }
        }
    }
    
    /**
     * Metodo para pedir datos al usuario.
     * @return String[]
     */
    public static String[] pedirDatos(){
        String resultado[] = new String [3];
        System.out.println("Ingrese el elemento de la factura");
        String elemento = sn.nextLine();
        System.out.println("Ingrese el precio de la factura");
        String precio = sn.nextLine();
        System.out.println("Ingrese la cantidad del elemento");
        String cantidad = sn.nextLine();
        return resultado;
    }
}
