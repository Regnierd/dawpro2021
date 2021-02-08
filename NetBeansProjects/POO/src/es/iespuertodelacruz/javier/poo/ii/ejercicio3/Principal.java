
package es.iespuertodelacruz.javier.poo.ii.ejercicio3;

import es.iespuertodelacruz.javier.poo.ii.ejercicio3.Mascota.Estado;
import java.util.ArrayList;

/**
 *
 * @author Javi
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Mascota> animales = new ArrayList();
        
        Perro lylu = new Perro("Mestizo", false, "Lylu", 12, Estado.Vivo, "27/06/2009" );
        Gato garfield = new Gato("Naranja", true, "Garfield", 10, Estado.Vivo, "20/12/2011");
        Loro paco = new Loro("Africa", false, "", false, "Paco", 5, Estado.Vivo, "15/07/2016" );
        Canario pancho = new Canario("Amarillo", true, "", false, "Pancho", 4, Estado.Vivo, "1/06/2017");
         
        animales.add(lylu);
        animales.add(garfield);
        animales.add(paco);
        animales.add(pancho);
        
        //Mostrar el tipo y el nombre del animal
        for(int i = 0; i < animales.size(); i++){
            String tipo = animales.get(i).getClass().getSimpleName();
            String nombre = animales.get(i).getNombre();
            System.out.println("Tipo: " + tipo + " Nombre: "+ nombre);
        }
        System.out.print("\n");
        
        //Mostrar los datos de un animal enconcreto
        for(int i = 0; i < animales.size(); i++){
            String tipo = animales.get(i).getClass().getSimpleName();
            if(tipo.equals("Perro")){
                System.out.println(animales.get(i).mostrar());
            }
        }
        System.out.println("\n");
        
        //Mostrar los datos de un animal enconcreto
        for(int i = 0; i < animales.size(); i++){
            System.out.println(animales.get(i).mostrar());

        }
        
        System.out.println("\nAgregamos un perro nuevo muerto, por desgracia");        
        Perro hancock = new Perro("Dalmata", true, "Hancock", 8, Estado.Muerto, "3/02/2013");
        animales.add(hancock); 
        for(int i = 0; i < animales.size(); i++){
            String tipo = animales.get(i).getClass().getSimpleName();
            if(tipo.equals("Perro")){
                System.out.println(animales.get(i).mostrar());
            }
        }
        System.out.println("Comprobamos que el animal ladra");
        System.out.println(hancock.hablar());

    }
    
//    public static void mostrarAnimales(ArrayList animales){
//        //Mostrar todos los animales
//        for(int i = 0; i < animales.size(); i++){
//            System.out.println(animales.get(i).mostrar()); //PREGUNTAR
//
//        }
//    }
}
