
package es.iespuertodelacruz.javier.poo.i.ejercicio4;

/**
 *
 * @author Javi
 */
public class Articulo {
    private String nombre;
    private double precio;
    private int iva;
    private int cuantosQuedan;
    public final int ivaGeneral = 21;
    public final int ivaReducido = 10;
    public final int ivaSuperReducido = 4;
    
    //Constructor
    public Articulo(String nombre, double precio, int iva, int cuantosQuedan) {
        if(nombre == ""){
            System.err.println("Error. El nombre no puede estar vacio");
        }else if(precio <= 0){
            System.err.println("Error. El precio no puede ser menor que 0");
        }else if(iva != this.ivaGeneral && iva != this.ivaReducido && iva != this.ivaSuperReducido){
            System.err.println("Error. IVA incorrecto");
        }else if(cuantosQuedan <= 0){
            System.err.println("Error. No puede haber 0 en el almacen");
        }else {
            this.nombre = nombre;
            this.precio = precio;
            this.iva = iva;
            this.cuantosQuedan = cuantosQuedan;
        }
        
    }
    
    //Getter/Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre == ""){
            System.err.println("Error. El nombre no puede estar vacio");
        }else{
            this.nombre = nombre;
        }
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio <= 0){
            System.err.println("Error. El precio no puede ser menor que 0");
        }else{
            this.precio = precio;
        }
        
    }

    public double getIva() {
        return iva;
    }

    public void setIva(int iva) {
        if(iva != this.ivaGeneral && iva != this.ivaReducido && iva != this.ivaSuperReducido){
            System.err.println("Error. IVA incorrecto");
        }else{
            this.iva = iva;
        }
        
    }
    
    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        if(cuantosQuedan <= 0){
            System.err.println("Error. No puede haber 0 en el almacen");
        }else {
            this.cuantosQuedan = cuantosQuedan;
        }
        
    }
    
    /**
     * Funcion para obtener el PVP.
     * @param precio
     * @param iva
     * @return double
     */
    public double getPVP(){     
        return this.precio*(this.iva/100)+1;
        
    }
    
    /**
     * Funcion para calcular el descuento de un articulo
     * @param descuento
     * @return 
     */
    public double getPVPDescuento(double descuento){       
        return getPVP()-(getPVP()*(descuento/100));
    }
    
    /**
     * Metodo para vender y actualizar articulos
     * @param cantidad
     * @return 
     */
    public boolean vender(int cantidad){      
        if (getCuantosQuedan() < cantidad){
            System.out.println("No se puede vender mas de lo que hay en stock");
            return false;
        }else{
            int cantidadNueva = this.getCuantosQuedan() - cantidad;
            this.setCuantosQuedan(cantidadNueva);
            System.out.println("Vendido!");
            return true;
        }        
       
    }
    
    /**
     * Metodo para almacenar y actualizar articulos
     * @param cantidad
     * @return 
     */
    public boolean almacenar(int cantidad){
       
        if (getCuantosQuedan() >= 0){
            int cantidadNueva = this.getCuantosQuedan() + cantidad;
            this.setCuantosQuedan(cantidadNueva);
            return true;
        }else{
            return false;
        }        
        
    }
    
    /**
     * Metodo para imprimir por pantalla el articulo.
     * @return String
     */
    public String imprimir() {
        return "Articulo{" + "nombre=" + nombre + ", precio=" + precio + ", IVA=" + iva + ", cuantosQuedan=" + cuantosQuedan + '}';
    }
    
    
}
