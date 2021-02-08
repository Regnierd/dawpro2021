
package es.iespuertodelacruz.javier.poo.i.ejercicio4;

/**
 *
 * @author Javi
 */
public class Principal {
    public static void main(String[] args) {        
        Articulo articulo1 = new Articulo("Tornillo", 1.5, 21, 50);       
        Articulo articulo2 = new Articulo("Broca", 2, 21, 25);
        
        System.out.println(articulo1.imprimir()); 
        System.out.println(articulo2.imprimir()); 
        
       
        articulo1.setIva(20);
        articulo2.setIva(10);
        
        articulo1.vender(5);
        System.out.println(articulo1.imprimir());
        articulo2.vender(18);
        System.out.println(articulo2.imprimir());
        
        articulo1.vender(50);
        articulo2.vender(25);
        
        articulo1.almacenar(100);
        articulo2.almacenar(75);       
        System.out.println(articulo1.imprimir());;
        System.out.println(articulo2.imprimir());
        
    }
}
