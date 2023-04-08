package Clase7.EjercicioCarrito;
import java.time.LocalDateTime;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDateTime fechanac;
    public void setFechanac(LocalDateTime fechanac) {
        this.fechanac = fechanac;
    }

    public Persona(String nombrepers, String apellidopers){
        this.nombre = nombrepers;
        this.apellido = apellidopers;
    }
}