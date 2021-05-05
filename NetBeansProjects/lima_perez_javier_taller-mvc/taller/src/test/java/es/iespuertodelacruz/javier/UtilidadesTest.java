package es.iespuertodelacruz.javier;


import es.iespuertodelacruz.javier.api.Vehiculo;

public class UtilidadesTest {
    
    public Vehiculo generarVehiculo(String matricula, String marca){
        Vehiculo vehiculo = null;
        if(matricula != null && marca != null){
            vehiculo = new Vehiculo(matricula, marca);
        }else{
            vehiculo = new Vehiculo();
            vehiculo.setMatricula("0123ACV");
            vehiculo.setMarca("Opel");
        }
        return vehiculo;
    }
}
