
package es.iespuertodelacruz.javier.poo.ii.ejercicio5;

/**
 *
 * @author Javi
 */
public class Empleados {
    private final String NOMBRE;
    private final String DNI;
    private double sueldoBruto;
    private int edad;
    private int telefono;
    private String direccion;

    public Empleados(String nombre, String dni, double sueldoBruto, int edad, int telefono, String direccion) {
        this.NOMBRE = nombre;
        this.DNI = dni;
        this.sueldoBruto = sueldoBruto;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getDNI() {
        return DNI;
    }

    public Empleados(String nombre, String dni, double sueldoBruto) {
        this.NOMBRE = nombre;
        this.DNI = dni;
        this.sueldoBruto = sueldoBruto;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
    
    /**
     * Funcion para calcular el sueldo neto de un empleado.
     * @param sueldoBruto
     * @return double
     */
    public double calcularSueldoNeto(){
        double sueldoBrutoAnual = sueldoBruto*12;
        double sueldoNeto=0;
        if(sueldoBrutoAnual<12000){
            sueldoNeto = sueldoBruto-(sueldoBruto*0.2);
        }else if(sueldoBrutoAnual>=12000 && sueldoBrutoAnual<=25000){
            sueldoNeto = sueldoBrutoAnual-(sueldoBrutoAnual*0.3);
        }else if(sueldoBrutoAnual>25000){
            sueldoNeto = sueldoBrutoAnual-(sueldoBrutoAnual*0.4);
        }
        return sueldoNeto;
    }
    
    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + NOMBRE + ", dni=" + DNI +
                ", sueldoBruto=" + sueldoBruto + ", edad=" + edad + 
                ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
    
    
}
