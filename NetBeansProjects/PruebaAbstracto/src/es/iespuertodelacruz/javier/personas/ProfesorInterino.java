
package es.iespuertodelacruz.javier.personas;

/**
 *
 * @author Javi
 */
public class ProfesorInterino extends Profesor{

    public ProfesorInterino(String departamento, String asignatura, String nombre, String apellidos) {
        super(departamento, asignatura, nombre, apellidos);
    }
 
    @Override
    public String mostrarNombre() {
        return "Nombre: " + this.nombre;
    }

    @Override
    public String mostrarApellidos() {
        return "Apellidos: " + this.apellidos;
    }

    @Override
    public String mostrarDepartamento() {
        return "Departamento: " + this.departamento;
    }

    @Override
    public String mostrarAsignatura() {
        return "Asignatura: " + this.asignatura;
    }
    
}
