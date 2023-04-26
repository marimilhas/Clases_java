package org.example;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Departamento {
    private String nombre;
    private Integer id;

    @JsonIgnore
    private Persona persona;


    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
