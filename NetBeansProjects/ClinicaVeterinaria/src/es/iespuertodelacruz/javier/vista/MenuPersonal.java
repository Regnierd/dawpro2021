package es.iespuertodelacruz.javier.vista;

import es.iespuertodelacruz.javier.animales.Animal;
import es.iespuertodelacruz.javier.animales.ElementoHistorico;
import es.iespuertodelacruz.javier.animales.Historico;
import es.iespuertodelacruz.javier.clientes.Persona;
import es.iespuertodelacruz.javier.empleados.Auxiliar;
import es.iespuertodelacruz.javier.empleados.Personal;
import static es.iespuertodelacruz.javier.empleados.Personal.comprobarFecha;
import es.iespuertodelacruz.javier.empleados.Veterinario;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class MenuPersonal {
    static Scanner sn = new Scanner(System.in);
    static Scanner intsn = new Scanner(System.in);
    private static ArrayList<Personal> personal = new ArrayList();
    private static String expresionFecha = "^\\d{2}\\/\\d{2}\\/\\d{4}$";
    
    public static void subMenu() {
        boolean salir = false;
        int opcion;
        
        
        while (!salir) {
            System.out.println("-------------------------------------------");
            System.out.println("-- ¿Que tipo de personal quieres crear? ---");
            System.out.println("-------------------------------------------");
            System.out.println("--    1. Veterinario                     --");
            System.out.println("--    2. Auxiliar                        --");
            System.out.println("--    3. Salir                           --");
            System.out.println("-------------------------------------------");

            try {
                System.out.print("Opción: ");
                opcion = intsn.nextInt();
                String datos[];
                switch (opcion) {
                    case 1:
                        datos = pedirDatos();               
                        if(datos[0] != "" || datos[1] != "" || datos[2] != ""){
                            Veterinario veterinario = new Veterinario(datos[0], datos[1], datos[2]);
                            getPersonal().add(veterinario);
                            System.out.println("Veterinario registrado");
                            System.out.println(veterinario.toString());
                            MenuDiagnostico.subMenu(veterinario);
                        }else{
                            System.err.println("Error al registrar al personal");
                        }
                        
                        break;
                    case 2:
                        datos = pedirDatos();
                        if(datos[0] != "" || datos[1] != "" || datos[2] != ""){
                            Auxiliar auxiliar = new Auxiliar(datos[0], datos[1], datos[2]);
                            getPersonal().add(auxiliar);
                            System.out.println("Auxiliar registrado!");
                            System.out.println(auxiliar.toString());
                            MenuDiagnostico.subMenu(auxiliar);
                        }else{
                            System.err.println("Error al registrar al personal");
                        }
                        
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe de inserte un numero");
            }
        }
    }
    
    /**
     * Metodo para pedir datos al usuario
     * @return String[]
     */
    public static String[] pedirDatos() {
        String resultado[] = new String[3];
        System.out.println("Inserte su nombre");
        resultado[0] = sn.nextLine();
        System.out.println("Ingrese sus apellidos");
        resultado[1] = sn.nextLine();
        System.out.println("Ingrese la fecha de su contratacion");
        resultado[2] = sn.nextLine();
        return resultado;
    }
    
    /**
     * Metodo para mostrar todas las personas
     * @param personas 
     */
    public static void listarPersonal(ArrayList personal){
        for (int i = 0; i < personal.size(); i++) {
            System.out.println(personal.get(i));
        }
    }
    
    /**
     * Funcion para crear el array list
     * @return 
     */
    public static ArrayList<Personal> getPersonal(){
        if(personal == null){
            personal = new ArrayList();
        }
        return personal;
    }
}
