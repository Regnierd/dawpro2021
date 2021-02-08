
package es.iespuertodelacruz.javier;

/**
 *
 * @author Javi
 */
public class Animal {
    private String nombre;
    private String raza;
    private int edad;
    private boolean chip;

    public Animal(String nombre, String raza, int edad, boolean chip) throws Exception {
        comprobarNombre(nombre);
        comprobarRaza(raza);
        comprobarEdad(edad);
        this.chip = chip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
       comprobarNombre(nombre);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) throws Exception {
        comprobarRaza(raza);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        comprobarEdad(edad);
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }
    
    /**
     * Metodo para comprobar el nombre lanzando una excepcion.
     * @param nombre 
     * @throws Exception 
     */
    private void comprobarNombre(String nombre) throws Exception{
        if(nombre != null){
            this.nombre = nombre;
        }else{
            throw new Exception("El nombre " + nombre + " no es valida, "
                    + " no puede ser nulo");
        }
    }
    
     /**
     * Metodo para comprobar el nombre lanzando una excepcion.
     * @param nombre 
     * @throws Exception 
     */
    private void comprobarRaza(String raza) throws Exception{
        if(raza != null){
            this.raza = raza;
        }else{
            throw new Exception("La raza " + raza + " no es valida, "
                    + " no puede ser nulo");
        }
    }
    
    /**
     * Metodo para comprobar la edad lanzando una excepcion
     * @param edad
     * @throws Exception 
     */
    private void comprobarEdad(int edad) throws Exception{
        if(edad > 0){
            this.edad = edad;
        }else{
            throw new Exception("La edad " + edad + " no es validad,"
                    + "debe ser mayor que 0");
        }
    }


    @Override
    public String toString() {
        return "nombre = " + nombre + ", raza = " + raza + ", edad = " + edad + ", chip = " + chip;
    }
    
}
