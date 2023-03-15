package Clase6.Ejercicio2;
import java.time.LocalDateTime;

public class Carrito {
    public Persona cliente;
    public Producto[] productos;
    public LocalDateTime fechacompra;

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    private Descuento descuento;

    public Carrito(Persona clientecar, Producto[] productoscar){
        this.cliente = clientecar;
        this.productos = productoscar;
    }
    public float obtenerprecio(){
        float total_compra_base = 0;
        for (int i = 0; i < 3; i ++){
            if (productos[i] != null){
                total_compra_base += productos[i].getPrecio();
            }
        }
        return total_compra_base - descuento.obtenerdescuento(total_compra_base);
    }
}