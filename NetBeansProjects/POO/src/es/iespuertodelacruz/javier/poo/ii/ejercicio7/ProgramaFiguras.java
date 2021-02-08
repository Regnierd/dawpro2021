package es.iespuertodelacruz.javier.poo.ii.ejercicio7;

import es.iespuertodelacruz.javier.poo.ii.ejercicio7.figuras.Circulo;
import es.iespuertodelacruz.javier.poo.ii.ejercicio7.figuras.Cuadrado;
import es.iespuertodelacruz.javier.poo.ii.ejercicio7.figuras.Figura;
import es.iespuertodelacruz.javier.poo.ii.ejercicio7.figuras.Rectangulo;
import es.iespuertodelacruz.javier.poo.ii.ejercicio7.figuras.Triangulo;
import java.util.ArrayList;

/**
 *
 * @author Javi
 */
public class ProgramaFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList();

        Cuadrado cuadrado = new Cuadrado(4);
        Rectangulo rectangulo = new Rectangulo(10, 5);
        Triangulo triangulo = new Triangulo(20, 16);
        Circulo circulo = new Circulo(10);
        figuras.add(cuadrado);
        figuras.add(rectangulo);
        figuras.add(triangulo);
        figuras.add(circulo);

        mostrarLista(figuras);
        System.out.print("\n");
        
        System.out.println("Escala de 2");
        escalarFigura(figuras, 2);
        mostrarLista(figuras);
        
        System.out.print("\n");       
        System.out.println("Escala de 0.1");
        escalarFigura(figuras, 0.1);
        mostrarLista(figuras);
        
        System.out.print("\n");
        System.out.println("Area = " + cuadrado.area() + " Perimetro = " + cuadrado.perimetro());
        System.out.println("Area = " + rectangulo.area() + " Perimetro = " + rectangulo.perimetro());
        System.out.println("Area = " + triangulo.area() + " Perimetro = " + triangulo.perimetro());
        System.out.println("Area = " + circulo.area() + " Perimetro = " + circulo.perimetro());
    }
    
    /**
     * Metodo para mostrar la lista
     * @param figuras 
     */
    public static void mostrarLista(ArrayList figuras) {
        for (int i = 0; i < figuras.size(); i++) {
            System.out.println(figuras.get(i));
        }
    }
    
    /**
     * Metodo para escalar todas las figuras
     * @param figuras
     * @param escala 
     */
    public static void escalarFigura(ArrayList figuras, double escala){
        for (int i = 0; i < figuras.size(); i++) {
            //comprueba que en la posicion i sea el objeto cuadrado o etc.
            //instanceof compara un objeto con otro objeto y dice si son iguales(true o false)
            if(figuras.get(i) instanceof Cuadrado){
                Cuadrado cuadrado = (Cuadrado)figuras.get(i);//trycatch de figura a cuadrado
                cuadrado.escalar(escala);
            }else if(figuras.get(i) instanceof Rectangulo){
                Rectangulo rectangulo = (Rectangulo)figuras.get(i);
                rectangulo.escalar(escala);
            }else if(figuras.get(i) instanceof Triangulo){
                Triangulo triangulo = (Triangulo)figuras.get(i);
                triangulo.escalar(escala);
            }else if(figuras.get(i) instanceof Circulo){
                Circulo circulo = (Circulo)figuras.get(i);
                circulo.escalar(escala);
            }
        }
    }
    
}
