package es.iespuertodelacruz.javier.vista;

import es.iespuertodelacruz.javier.animales.Animal;
import es.iespuertodelacruz.javier.animales.Diagnostico;
import es.iespuertodelacruz.javier.empleados.Personal;
import static es.iespuertodelacruz.javier.vista.MenuAnimal.animales;
import static es.iespuertodelacruz.javier.vista.MenuPersona.sn;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class MenuDiagnostico {
    static Scanner sn = new Scanner(System.in);
    static Scanner intsn = new Scanner(System.in);
    public static void subMenu(Personal personal) {
        
        boolean salir = false;
        int opcion;
        ArrayList<Diagnostico> diagnosticos = new ArrayList();
        Animal animal = null;
        while (!salir) {
            System.out.println("---------------------------------------------");
            System.out.println("-- ¿Quiere crear un diagnostico del animal?--");
            System.out.println("---------------------------------------------");
            System.out.println("--    1. Si                                --");
            System.out.println("--    2. No                                --");
            System.out.println("---------------------------------------------");

            try {
                System.out.print("Opción: ");
                opcion = intsn.nextInt();
                
                switch (opcion) {
                    case 1:
                        String datos[] = pedirDatos();
                        animal = buscarAnimal(datos[2]);
                        if (animal != null) {
                            Diagnostico diagnostico = new Diagnostico(datos[0], datos[1], personal, animal);
                            diagnosticos.add(diagnostico);
                            personal.getDiagnosticos().add(diagnostico);
                            animal.getDiagnosticos().add(diagnostico);
                            System.out.println("Diagnostico creado!");
                            System.out.println(diagnostico.toString());
                            MenuFactura.subMenu(diagnostico);
                        } else {
                            System.out.println("El animal no existe");
                        }
                        
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
     * Metodo para buscar el nombre del animal 
     * @param nombre
     * @return Animal
     */
    public static Animal buscarAnimal(String nombre) {
        Animal animal = null;
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getNombre().equals(nombre)) {
                animal = animales.get(i);
            }
        }
        return animal;
    }
    
    /**
     * Metodo para pedir datos al usuario
     * @return String[]
     */
    public static String[] pedirDatos(){
        String resultado[] = new String [3];
        System.out.println("Ingrese la fecha del diagnostico");
        resultado[0] = sn.nextLine();
        System.out.println("Ingrese la descripcion del diagnostico");
        resultado[1] = sn.nextLine();
        System.out.println("Introce el nombre del animal al que le vas hacer el diagnostico");
        resultado[2] = sn.nextLine();
        return resultado;
    }
}
