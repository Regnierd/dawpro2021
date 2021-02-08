
package es.iespuertodelacruz.javier.poo.ii.ejercicio5;

/**
 *
 * @author Javi
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresas empresa1 = new Empresas("Manolo's", "11111111C", 922364678, "C/Brasil nº10");
        
        Empleados empleado1 = new Empleados("javier", "44444444F", 850);
        Empleados empleado2 = new Empleados("jonay", "11111111A", 900, 24, 688976540, "La montania");
        Empleados empleado3 = new Empleados("daniel", "55555555B", 850);
        Empleados empleado4 = new Empleados("ruben", "22222222W", 800, 20, 687654211, "El puerto");
        
        System.out.println("Agregamos varios empleados");
        empresa1.addEmpleado(empleado1);
        empresa1.addEmpleado(empleado2);
        empresa1.addEmpleado(empleado3);
        empresa1.addEmpleado(empleado4);
        
        empresa1.mostrarEmpresa();
        empresa1.mostrarEmpleados();
        
        System.out.print("\n");
        System.out.println("Eliminamos un empleado");
        empresa1.delEmpleado(empleado4);
        empresa1.mostrarEmpleados();
        System.out.print("\n");
        System.out.println("Sueldo bruto de todos los empleados: " + empresa1.calcularSueldosBrutos());
        System.out.println("Sueldo neto de todos los empleados: " + empresa1.calcularSueldosNetos());
        System.out.print("\n");
        empresa1.mostrarDatos();
        
    }
}
