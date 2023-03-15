package Clase6.Ejercicio2;

public class Producto {
    public String nombre;
    public float precio;
    public String codigo;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /*public Producto(String nombreprod, String codigoprod, float precioprod){
        this.nombre = nombreprod;
        this.codigo = codigoprod;
        this.precio = precioprod;
    }*/
}
