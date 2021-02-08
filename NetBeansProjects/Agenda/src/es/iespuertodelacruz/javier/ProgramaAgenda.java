
package es.iespuertodelacruz.javier;

import es.iespuertodelacruz.javier.usuarios.contactos.Agenda;
import es.iespuertodelacruz.javier.usuarios.contactos.Contacto;
import es.iespuertodelacruz.javier.usuarios.contactos.EmpresaContacto;
import es.iespuertodelacruz.javier.usuarios.contactos.PersonaContacto;


/**
 *
 * @author Javi
 */
public class ProgramaAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaContacto contacto1 = new PersonaContacto("25/4/1996", "33333333R", "javier", 600828776);
        PersonaContacto contacto2 = new PersonaContacto("11/06/1991","00000000E", "jonay", 682475205);
        EmpresaContacto contacto3 = new EmpresaContacto("www.empresa1.com","11111111G", "adrian", 688233584);
        EmpresaContacto contacto4 = new EmpresaContacto("www.empresa2.com","22222222F", "ruben", 623447877);
        
        Agenda agenda = new Agenda();
        System.out.println("Contacto 1: " + agenda.addContacto(contacto1));
        System.out.println("Contacto 2: " +agenda.addContacto(contacto2));
        System.out.println("Contacto 3: " +agenda.addContacto(contacto3));
        System.out.println("Contacto 4: " +agenda.addContacto(contacto4));
        
        System.out.print("\n");
        agenda.listarContactos();
        System.out.print("\n");
        System.out.println("Posicion: " + agenda.buscaContacto("adrian"));
        System.out.print("\n");
        System.out.println("Existe: " + agenda.existeContacto("ruben"));
        System.out.print("\n");
        System.out.println("Eliminar contacto");
        System.out.println(agenda.delContacto("jonay"));
        agenda.listarContactos();
        System.out.print("\n");
        System.out.println("Agregar usuario");
        PersonaContacto contacto5 = new PersonaContacto("13/09/1997","33333333R", "daniel", 687962123);
        System.out.println("Contacto 5: " + agenda.addContacto(contacto5));
        agenda.listarContactos();   
        
    }
    
}
