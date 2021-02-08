
package es.iespuertodelacruz.javier.pagos;

/**
 *
 * @author Javi
 */
public class ElementoFactura {
    private String elemento;
    private double precio;
    private double cantidad;
    private Factura factura;

    public ElementoFactura(String elemento, double precio, double cantidad, Factura factura) {
        if(elemento == ""){
            System.err.println("Error. El elemento no puede ir vacio");
        }else if(precio == 0){
            System.err.println("Error. El precio no puede ser 0");
        }else if(cantidad == 0){
            System.err.println("Error. La cantidad no puede ser 0");
        }else{
             this.elemento = elemento;
            this.precio = precio;
            this.cantidad = cantidad;
            this.factura = factura;
        } 
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "ElementoFactura{" + "elemento=" + elemento + ", precio=" + 
                precio + ", cantidad=" + cantidad + ", factura=" + factura + '}';
    }
    
    
    
    
}
