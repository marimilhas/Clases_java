package Clase6.Ejercicio2;
import java.time.LocalDateTime;

public class Carrito {
    public Persona cliente;
    public Producto[] productos;
    public LocalDateTime fechacompra;
    private Descuento descuento;

    public Descuento getDescuento() {
        return descuento;
    }
    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public Carrito(Persona clientecar, Producto[] productoscar){
        this.cliente = clientecar;
        this.productos = productoscar;
        this.descuento = new DescuentoCero();
    }
    public float obtenerprecio(){
        float acumulador = 0;
        for (int i = 0; i < productos.length; i ++){
            acumulador += productos[i].precio;
        }
        return descuento.obtener_valor_final(acumulador);
    }
}
