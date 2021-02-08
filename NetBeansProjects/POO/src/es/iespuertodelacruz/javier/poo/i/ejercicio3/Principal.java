
package es.iespuertodelacruz.javier.poo.i.ejercicio3;

import static es.iespuertodelacruz.javier.poo.i.ejercicio3.Rectangulo.crearRectanguloAleatorio;

/**
 *
 * @author Javi
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5,4,8,9);
        Rectangulo rectanguloAleatorio;
        rectangulo.setX1(20);
        System.out.println(rectangulo.imprimir());
        System.out.println("Perimetro: " + rectangulo.getPerimetro());
        System.out.println("Area: " + rectangulo.getArea());
        rectanguloAleatorio = crearRectanguloAleatorio();
        System.out.println(rectanguloAleatorio.imprimir());
        
    }
}
