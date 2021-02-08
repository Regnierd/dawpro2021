
package es.iespuertodelacruz.javier;

import es.iespuertodelacruz.javier.formas.Circulo;
import es.iespuertodelacruz.javier.formas.Cuadrado;
import es.iespuertodelacruz.javier.formas.Elipse;
import es.iespuertodelacruz.javier.formas.Rectangulo;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Examen1Trimestre {
    /**
     * 6. ¿Cómo haría para obligar que todas las clases futuras derivadas tengan al menos los métodos “area” y “perimetro”.
     * Creando la clase Forma abstracto y añadiendole en la propia clase Forma los metodos abstractos area y perimetro.
     * ¿Tiene sentido incluir definir dichos métodos en la clase “forma”?
     * Si tiene sentido porque todas heredan de la clase Forma los metodos area y perimetro, porque son metodos abstractos.
     */
    /**
     * Funcion principal del progroma
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        
        Rectangulo rectangulo = new Rectangulo(10, 15, "Rojo", 5, "rectangulo1");
        Elipse elipse = new Elipse(5, 10, "Naranja", 4, "elipse1");
        Cuadrado cuadrado = new Cuadrado(4, 4, "Blanco", 2, "cuadrado1");
        Circulo circulo = new Circulo(3, "Negro", 3, "circulo1");
        
        try{
            while(!salir){
                System.out.println("1. Rectangulo");
                System.out.println("2. Elipse");
                System.out.println("3. Cuadrado");
                System.out.println("4. Circulo");
                System.out.println("5. Calcular area maxima");
                System.out.println("6. Salir");
                System.out.print("Eliga una opcion del menu: ");
                opcion = sn.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println("Has elegido la opcion 1");                  
                        System.out.println("Area: "+rectangulo.area());
                        System.out.println("Perimetro: "+rectangulo.perimetro());
                        System.out.println("Datos: " +rectangulo.imprimir());                      
                        System.out.println("Cambiaremos algunos datos del rectangulo");
                        rectangulo.cambiarColor(rectangulo.cambiarColor("Verde"));
                        rectangulo.cambiarTamanio(2);
                        System.out.println("Datos: "+rectangulo.imprimir());
                        break;
                    case 2:                      
                        System.out.println("Area: " + elipse.area());
                        System.out.println("Datos: " + elipse.imprimir());
                        break;
                    case 3:                        
                        System.out.println("Area: " + cuadrado.area());
                        System.out.println("Datos: " + cuadrado.imprimir());
                        break;
                    case 4:                       
                        System.out.println("Area: " + circulo.area());
                        System.out.println("Datos: " + circulo.imprimir());
                        break;
                    case 5:
                        //Calcular cual es el area mas grande y la imprimimos. Se puede hacer en una funcion aparte para que quede mejor
                        //pero no me dio tiempo.
                        if(circulo.area() > cuadrado.area() && circulo.area() > rectangulo.area() && circulo.area() > elipse.area()){
                            System.out.println(circulo.imprimir());
                        }else if(cuadrado.area() >= circulo.area() && cuadrado.area() >= rectangulo.area() && cuadrado.area() >= elipse.area()){
                            System.out.println(cuadrado.imprimir());
                        }else if(rectangulo.area() > elipse.area() && rectangulo.area() >= circulo.area() && rectangulo.area() > cuadrado.area()){
                            System.out.println(rectangulo.imprimir());
                        }else{
                            System.out.println(elipse.imprimir());
                        }
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5"); 
                        
                }
            }
        }catch(InputMismatchException e){
            System.out.println("Debes insertar un número");
            sn.next();
        }
        
    }
   
    
}
