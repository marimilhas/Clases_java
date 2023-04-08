package Clase7.EjercicioCarrito;

public class Producto {
    public String nombre;
    public float precio;
    private Integer stock;

    public float getPrecio() throws NoHayStockException{
        if (stock == 0){
            throw new NoHayStockException(this);
        }
        return precio;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Producto(String nombreprod, float precioprod, int stock){
        this.nombre = nombreprod;
        this.precio = precioprod;
        this.stock = stock;
    }
}
