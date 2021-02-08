
package es.iespuertodelacruz.javier.poo.ii.ejercicio6;

import es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.Acuaticos;
import es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.Aereos;
import es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.Terrestres;
import es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.Vehiculos;
import es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.acuaticos.Barcos;
import es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.acuaticos.Submarinos;
import es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.aereos.Aviones;
import es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.aereos.Helicopteros;
import es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.terrestres.Coches;
import es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.terrestres.Motos;
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
        Coches coche1 = new Coches(true, 4, "6549CFG", "Opel Astra");
        Motos moto1 = new Motos("Naranja", 2, "3215PÑF", "Honda");
        Barcos barco1 = new Barcos(true, 30, "PKASFF", "Focus");
        Submarinos submarino1 = new Submarinos(1000, 50, "POIYURDGG", "Gotland");
        Aviones avion1 = new Aviones("20", 100, "ASDF654987", "Airbus A320");
        Helicopteros helicoptero1 = new Helicopteros(4, 4, "MNBV987654", "Kamov Ka 32 A 11 BC");
        
        ArrayList<Vehiculos> vehiculos = new ArrayList(); 
        
        vehiculos.add(coche1);
        vehiculos.add(moto1);
        vehiculos.add(barco1);
        vehiculos.add(submarino1);
        vehiculos.add(avion1);
        vehiculos.add(helicoptero1);
        
        mostrarLista(vehiculos);
        System.out.println("\n");
        
        System.out.println("Agregamos nuevos vehiculos");
        Terrestres terrestre1 = new Terrestres(4, "6548LF", "BMW");
        Acuaticos acuatico1 = new Acuaticos(40, "ASFPFF4F", "Focus");
        Aereos aereo1 = new Aereos(150, "AADF98754F", "Gorland");
        
        vehiculos.add(terrestre1);
        vehiculos.add(acuatico1);
        vehiculos.add(aereo1);
        
        mostrarLista(vehiculos);
       
    } 
    
    public static void mostrarLista(ArrayList vehiculo){
        for(int i = 0; i<vehiculo.size();i++){
            System.out.println(vehiculo.get(i).toString());
        }
    }
}
