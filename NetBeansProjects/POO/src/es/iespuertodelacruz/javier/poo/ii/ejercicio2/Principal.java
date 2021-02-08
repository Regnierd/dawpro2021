
package es.iespuertodelacruz.javier.poo.ii.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Principal {
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        boolean salir = false;
       
        ArrayList astros = new ArrayList();
       
        Planetas tierra = new Planetas(9.78, 146600000.0, "Tierra", 5.97E24, 365.25, 12742.0, 1.0, 14.05);
        Planetas venus = new Planetas(8.87, 108200000.0, "Venus", 4.869E24, 584.0, 12103.6, 243.02, 463.85 );
        Planetas marte = new Planetas(3.711, 227940000.0, "Marte", 6.42E23, 686.97, 6794.4, 24.62, -46.0);
        
        
        Satelites luna = new Satelites(1.62, 384400.0, tierra, "Luna", 7.349E22, -153.0, 3474.0, 27.5, 27.5 );
        Satelites fobos = new Satelites( 0.008, 6000, marte, "Fobos", 1.072E16, -40.15, 11000.0, 0.0,0.319 );
        Satelites deimos = new Satelites(0.0039, 23460, marte, "Deimos", 2.244E15, -40.15, 12400.0, 0.0, 1.262);
        
        
        tierra.añadirSatelite(luna);
        marte.añadirSatelite(fobos);
        marte.añadirSatelite(deimos);

        astros.add(tierra);
        astros.add(venus);
        astros.add(marte);
        astros.add(luna);
        astros.add(fobos);
        astros.add(deimos);
        
        while(!salir){
            
            mostrarListaAstros(astros);
  
            System.out.print("Elige el astro que quieres ver(-1 para salir): ");
            opcion = in.nextInt();
      
            if (opcion >= 0 && opcion < astros.size()) {
                Astros a = (Astros) astros.get(opcion);
                a.muestra();
            } 
            else if (opcion == -1) {
                return;
            } 
            else {
                System.out.println("Opción incorrecta");
            }

            // Pedimos enter para continuar
            System.out.println("Enter para continuar");
            in.nextLine();
            in.nextLine();

        }
        
        
    }
    
    /**
     * Mostrar la lista de Astros.
     * @param astros 
     */
    public static void mostrarListaAstros(ArrayList astros) {
        for (int i = 0; i < astros.size(); i++) {
            Astros a = (Astros) astros.get(i);
            System.out.println("Astro " + i + ": " + a.getNombre());
        }
    }
}
