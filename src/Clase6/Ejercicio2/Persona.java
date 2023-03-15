package Clase6.Ejercicio2;

import java.time.LocalDateTime;

public class Persona {
    public String nombre;
    public String apellido;
    public LocalDateTime fechanac;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Persona(String nombrepers, String apellidopers){
        this.nombre = nombrepers;
        this.apellido = apellidopers;
    }
}
