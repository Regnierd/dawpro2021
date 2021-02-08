
package es.iespuertodelacruz.javier;
import es.iespuertodelacruz.javier.persona.Persona;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
         
        boolean salir = false;

        while(!salir){
            System.out.println("1. Persona con todos los atributos");
            System.out.println("2. Persona con algunos atributos");
            System.out.println("3. Persona sin atributos");
            System.out.println("4. Salir");
            
            try{
                System.out.print("Elige una opcion: ");
                int opcion = sn.nextInt();
                
                switch(opcion){
                    case 1:
                        System.out.print("Inserte el nombre: ");
                        String nombre = sn.next();
                        System.out.print("Inserte la edad: ");
                        int edad = sn.nextInt();
                        System.out.print("Inserte el sexo: ");
                        char sexo = (char)sn.next().charAt(0);
                        System.out.print("Inserte el peso: ");
                        Double peso = sn.nextDouble();
                        System.out.print("Inserte la altura: ");
                        Double altura = sn.nextDouble();
                        Persona persona = new Persona(nombre, edad, sexo, peso, altura);
                        System.out.println(persona.toString());
                        persona.diagnostico();
                        System.out.println("Mayor de edad: "+persona.esMayorDeEdad());
                        break;
                    case 2: 
                        System.out.print("Inserte el nombre: ");
                        String nombre2 = sn.next();
                        System.out.print("Inserte la edad: ");
                        int edad2 = sn.nextInt();
                        System.out.print("Inserte el sexo: ");
                        char sexo2 = (char)sn.next().charAt(0);
                        Persona persona1 = new Persona(nombre2, edad2, sexo2);
                        System.out.println(persona1.toString());
                        System.out.println("Mayor de edad: "+persona1.esMayorDeEdad());
                        break;
                    case 3:
                        Persona persona2 = new Persona();
                        System.out.println(persona2.toString());                       
                        System.out.println("Mayor de edad: "+persona2.esMayorDeEdad());
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Elige una opcion del menu: 1 y 4.");                      
                }
            }catch(InputMismatchException e){
                System.out.println("Error. Tiene que elegir una opcion del menu (1-4).");   
                sn.next();
            }                       
        }             
    }   
}
