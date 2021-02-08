/*
 * 10.- Diseña un programa Java que realice las siguientes operaciones, en el orden
 * que se muestran. Se indica la variable y el tipo de dato que recibe el valor
 * o resultado de la operación indicada: 
 */
package Tarea1;

/**
 *
 * @author javier
 */
public class Ejercicio10 {
    
    /**
     * Metodo principal para mostrar todas las operaciones y conversiones.
     * @param args 
     */
    public static void main(String[] args){
        System.out.println("----- Conversiones entre enteros y coma flotante -----");
        float x = 4.5f;
        float y = 3.0f;
        int i = 2;
        int j = (int)(i*x);
        System.out.println("Producto de int por float: j = i*x = " + j);
        double dx = 2.0;
        double dz = dx*y;
        System.out.println("Producto de float por double: dz = dx * y = " + dz);
        System.out.println("----- Operaciones con byte -----");
        byte bx = 5;
        byte by = 2;
        byte bz = (byte)(bx - by);
        System.out.println("byte: " + bx + " - " + by + " = "+ bz);
        bx = -128;
        by = 1;
        bz = (byte)(bx - by);
        System.out.println("byte: " + bx + " - " + by + " = "+ bz);
        int entero = (int)(bx - by);
        System.out.println("byte: " + bx + " - " + by + " = "+ entero);
        System.out.println("----- Operaciones con short -----");
        short sx = 5;
        short sy = 2;
        short sz = (short)(sx-sy);
        System.out.println("short: " + sx + " - " + sy + " = " + sz);
        sx = 32767;
        sy = 1;
        sz = (short)(sx + sy);
        System.out.println("short: " + sx + " - " + sy + " = " + sz);
        System.out.println("----- Operaciones con char -----");
        char cx = '\u000F';
        char cy = '\u0001';
        int z = (char)cx - cy;
        System.out.println("char: cx - cy = " + z);
        z = (int)cx - 1;
        System.out.println("char(" + cx + ") - 1 = " + z);
        cx = '\uFFFF';
        z = cx;
        System.out.println("(int)= " + z);
        sx = (short)cx;
        System.out.println("(short)= " + sx);
        sx = -32768;
        cx = (char)sx;
        z = (int)sx;
        sx = (short)cx;
        System.out.println(z+" short-char-int = " + sx);
        sx = -1;
        cx = (char)sx;
        z = (int)cx;
        System.out.println(sx + " short-char-int = " +z);
       
    }
    
    
}
