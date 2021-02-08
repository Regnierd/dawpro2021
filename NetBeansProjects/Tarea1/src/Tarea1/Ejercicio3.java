/**
 * Realiza las siguientes modificaciones en el programa anterior:
 *    a) Añade comentarios, entre otros:
 *       Nombre de clase, descripción y autor
 *       Comentario para la clase main y para cada una de las llaves de cierre
 *    b) Utiliza el operador de asignación para inicializar las variables a los valores que se indican en los mensajes.
 *    c) Utiliza la secuencia de escape correspondiente para generar un tabulador al principio de cada línea salvo de la primera
 */
package Tarea1;

/**
 *
 * @author javier
 */
public class Ejercicio3 {

    /**
     * El metodo principal del programa, donde mostrará los resultados.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean casado = true;
        int valorMaximo = 999999;
        byte diaSemana = 1;
        short diaAnio = 300;
        char sexo = 'M';
        long milisegundos = 1298332800000L;
        double totalFactura = 10350.678;
        long poblacionMundial = 6775235741L;
     
        System.out.println("Con println");
        System.out.println("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
        System.out.println("El valor de la variable casado es " + casado);
        System.out.println("El valor de la variable valorMaximo es " + valorMaximo);
        System.out.println("El valor de la variable diaSemana es " + diaSemana);
        System.out.println("El valor de la variable diaAnio es " + diaAnio);
        System.out.println("El valor de la variable milisegundos es " + milisegundos);
        System.out.println("El valor de la variable totalFactura es " + totalFactura);
        System.out.println("El valor de la variable poblacionMundial es " + poblacionMundial);
        System.out.println("El valor de la variable sexo es " + sexo);
        System.out.println("\n");
        System.out.println("Con print");
        System.out.print("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----" + "\n");
        System.out.print("El valor de la variable casado es " + casado + "\n");
        System.out.print("El valor de la variable valorMaximo es " + valorMaximo + "\n");
        System.out.print("El valor de la variable diaSemana es " + diaSemana + "\n");
        System.out.print("El valor de la variable diaAnio es " + diaAnio + "\n");
        System.out.print("El valor de la variable milisegundos es " + milisegundos + "\n");
        System.out.print("El valor de la variable totalFactura es " + totalFactura + "\n");
        System.out.print("El valor de la variable poblacionMundial es " + poblacionMundial + "\n");
        System.out.print("El valor de la variable sexo es " + sexo + "\n");
        System.out.println("\n");
        System.out.println("Con printf");
        System.out.printf("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS ----- %n");
        System.out.printf("El valor de la variable casado es %s %n", casado);
        System.out.printf("El valor de la variable valorMaximo es %d %n", valorMaximo);
        System.out.printf("El valor de la variable diaSemana es %d %n", diaSemana);
        System.out.printf("El valor de la variable diaAnio es %d %n", diaAnio);
        System.out.printf("El valor de la variable milisegundos es %d %n ", milisegundos);
        System.out.printf("El valor de la variable totalFactura es %f %n", totalFactura);
        System.out.printf("El valor de la variable totalfactura en notación científica es %E %n", totalFactura);
        System.out.printf("El valor de la variable poblacionMundial es %d %n", poblacionMundial);
        System.out.printf("El valor de la variable sexo es %s %n", sexo);
    }

}
