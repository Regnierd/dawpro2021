
package es.iespuertodelacruz.javier.poo.ii.ejercicio5;

import java.util.ArrayList;

/**
 *
 * @author Javi
 */
public class Empresas {
    private final String NOMBRE;
    private final String CIF;
    private int telefono;
    private String direccion;   
    ArrayList<Empleados> empleados = new ArrayList();

    public Empresas(String NOMBRE, String CIF, int telefono, String direccion) {
        this.NOMBRE = NOMBRE;
        this.CIF = CIF;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleados> empleados) {
        this.empleados = empleados;
    }
    
    /**
     * Funcion para agregar un empleado a una empresa
     * @param empleado
     * @return boolean
     */
    public boolean addEmpleado(Empleados empleado){ 
        boolean agregado = false;
        agregado = empleados.add(empleado);
        
        return agregado;
      
    }
    
    /**
     * Funcion para eliminar un empleado de una empresa
     * @param empleado
     * @return boolean
     */
    public boolean delEmpleado(Empleados empleado){
        boolean agregado = false;
        agregado = empleados.remove(empleado);
        
        return agregado;
    }
    
    /**
     * Metodo para mostrar todos los empleados de la empresa
     */
    public void mostrarEmpleados(){
        for(int i = 0; i<empleados.size();i++){
            System.out.println(empleados.get(i));
        }
    }
    
    /**
     * Metodo para mostrar algunos datos de los empleados
     */
    public void mostrarDatos(){
        for(int i = 0; i<empleados.size();i++){
            System.out.println("[DNI: "+ empleados.get(i).getDNI() +" Saldo bruto: "+ empleados.get(i).getSueldoBruto()
                    + " Sueldo neto: "+empleados.get(i).calcularSueldoNeto()+"]");
          
        }
    }
    
    /**
     * Funcion para calcular los sueldos brutos de todos los empleados
     * @return 
     */
    public double calcularSueldosBrutos(){
        double sumaTotal=0;
        for(int i = 0; i<empleados.size();i++){          
            sumaTotal += empleados.get(i).getSueldoBruto();
        }
        
        return sumaTotal;
    }
    
    /**
     * Funcion para calcular los sueldos netos de todos los empleados
     * @return 
     */
    public double calcularSueldosNetos(){
        double sumaTotal=0;
        for(int i = 0; i<empleados.size();i++){          
            sumaTotal += empleados.get(i).calcularSueldoNeto();
        }
        
        return sumaTotal;
    }

    
    public void mostrarEmpresa() {
        System.out.println("Empresa{" + "NOMBRE=" + NOMBRE + ", CIF=" + CIF +
                ", telefono=" + telefono + ", direccion=" + direccion + '}');
    }
    
    
    
}
