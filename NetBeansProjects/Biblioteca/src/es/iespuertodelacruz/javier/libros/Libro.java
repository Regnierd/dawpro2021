
package es.iespuertodelacruz.javier.libros;

/**
 *
 * @author javier
 */
public class Libro {
    String titulo;
    String autor;
    int ejemplares;
    int prestados;
    
    //Constructor vacio
    public Libro() {
        titulo = "";
        autor = "";
        ejemplares = 0;
        prestados = 0;
    }
    
    //Constructor con parametros.
    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }
    
    //Getter/setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    
    /**
     * Funcion para hacer un prestamo.
     * @return booleano
     */
    public boolean prestar(){
        boolean prestado = false; 
        
          if(ejemplares > 0){
               prestados++;
               ejemplares--;
               prestado = true;
               
          }
          return prestado;
          
//  FORMA DEL PROFESOR
//        if(prestados < ejemplares){
//            prestados++;
//            prestado = true;
//            
//        }
//                
//        return prestado;

    }
    
    /**
     * Funcion para hacer una devolución.
     * @return booleano
     */
    public boolean devolver(){
        boolean devuelto = false;
        
        if(prestados > 0){
               prestados--;
               ejemplares++;
               devuelto = true;
               
          }
          return devuelto;
          
//FORMA DEL PROFESOR
//        if(prestados < ejemplares){
//            prestados--;
//            devuelto = true;
//        }
//        
//        return devuelto;

    }
    
    /**
     * Funcion para mostrar los datos que van cambiando.
     * @return String
     */
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados=" + prestados + '}';
    }
    
    
    
}
