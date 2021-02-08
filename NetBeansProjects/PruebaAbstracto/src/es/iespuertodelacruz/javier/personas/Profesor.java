
package es.iespuertodelacruz.javier.personas;

/**
 *
 * @author Javi
 */
public abstract class Profesor extends Persona{
    String departamento;
    String asignatura;
    
    public Profesor(String departamento, String asignatura, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.asignatura = asignatura;
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    
    public abstract String mostrarDepartamento();
    
    public abstract String mostrarAsignatura();
}
