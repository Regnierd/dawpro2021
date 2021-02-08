
package es.iespuertodelacruz.javier.poo.ii.ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Javi
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de productos
        Producto p1 = new Producto("camiseta S", 20);
        Producto p2 = new Producto("camiseta M", 40);
        Producto p3 = new Producto("camiseta L", 20);
        Producto p4 = new Producto("camiseta XL", 15);
        Producto p5 = new Producto("camiseta XXL", 10);
        
        //Creacion del arrayList y agregandole los productos creados anteriormente
        ArrayList<Producto> productos = new ArrayList();
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        
        //Recorremos la lista con un iterator
        Iterator iter = productos.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
        //Eliminamos 2 productos de la lista              
        productos.remove(p4);
        productos.remove(p3);
        System.out.print("\n");
        //Agregamos un nuevo producto en mitad de la lista
        productos.add(1, new Producto("camiseta XS", 20));
        
        //Recorremos la lista con un iterator
        iter = productos.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
        //
        productos.clear();
        System.out.println(productos.isEmpty());
        
    }
}
