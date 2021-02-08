
package es.iespuertodelacruz.javier.poo.i.ejercicio1;

import static es.iespuertodelacruz.javier.poo.i.ejercicio1.Punto.creaPuntoAleatorio;


/**
 *
 * @author Javi
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto punto1 = new Punto(5,0);
        Punto punto2 = new Punto(10,10);
        Punto punto3 = new Punto(-3,7);
        
        System.out.println(punto1.imprime());
        System.out.println(punto2.imprime());
        System.out.println(punto3.imprime());
        
        punto1.desplaza(5,1);
        punto2.desplaza(10,5);
        punto3.desplaza(-3,3);
        punto3.desplaza(7,3);
        
        System.out.println(punto1.imprime());
        System.out.println(punto2.imprime());
        System.out.println(punto3.imprime());
        
        Punto puntoAleatorio = new Punto();
        puntoAleatorio = creaPuntoAleatorio();
        System.out.println(puntoAleatorio.imprime());
    }

    
    
    
}
