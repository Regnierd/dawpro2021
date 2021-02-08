
package es.iespuertolacruz.javier;

import es.iespuertolacruz.javier.figuras.Triangulo;
import es.iespuertolacruz.javier.figuras.Circulo;
import es.iespuertolacruz.javier.figuras.Cuadrado;
import es.iespuertolacruz.javier.figuras.Figura;
import es.iespuertolacruz.javier.figuras.Rectangulo;
import es.iespuertolacruz.javier.figuras.Rombo;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author javier
 */
public class CalculoAreas {

    /**
     * Funcion principal.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
 
        while (!salir) {
            System.out.println("---------------------------");
            System.out.println("Menu: ");
            System.out.println("1. Calcular Area Cuadrado");
            System.out.println("2. Calcular Area Circulo");
            System.out.println("3. Calcular Area Triangulo");
            System.out.println("4. Calcular Area Rectangulo");
            System.out.println("5. Calcular Area Rombo");
            System.out.println("6. Salir");
            System.out.println("---------------------------");
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion para calcular el area de un cuadrado.");
                        System.out.print("Introduzca el valor del lado: ");
                        int lado = sn.nextInt();
                        Cuadrado cuadrado = new Cuadrado();
                        System.out.println("El valor del area es: "+ cuadrado.area());
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion para calcular el area de un circulo.");
                        System.out.print("Introduzca el valor del radio: ");
                        int radio = sn.nextInt();
                        Circulo circulo = new Circulo(radio);
                        System.out.println("El valor del area es: "+ circulo.area());
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion para calcular el area de un triangulo.");
                        System.out.print("Introduzca el valor de la base: ");
                        int base = sn.nextInt();
                        System.out.print("Introduzca el valor de la altura: ");
                        int altura = sn.nextInt();
                        Triangulo triangulo = new Triangulo(base, altura);
                        System.out.println("El valor del area es: "+ triangulo.area());
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion para calcular el area de un rectangulo.");
                        System.out.print("Introduzca el valor del lado largo: ");
                        int ladoLargo = sn.nextInt();
                        System.out.print("Introduzca el valor del lado pequenio: ");
                        int ladoPequenio = sn.nextInt();
                        Rectangulo rectangulo = new Rectangulo(ladoLargo, ladoPequenio);
                        System.out.println("El valor del area es :"+ rectangulo.area());
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion para calcular el area de un rombo.");
                        System.out.print("Introduzca el valor de la diagonal larga: ");
                        int diagonalMayor = sn.nextInt();
                        System.out.print("Introduzca el valor de la diagonal pequenia: ");
                        int diagonalMenor = sn.nextInt();
                        Rombo rombo = new Rombo(diagonalMayor, diagonalMenor);
                        System.out.println("El valor del area es :"+ rombo.area());
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Eliga una opcion del menu, 1-5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Debes insertar un número entero del 1-5.");
                sn.next();
            }
        }
        
        
        
    }
    
}
