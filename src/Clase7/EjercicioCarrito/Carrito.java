package Clase7.EjercicioCarrito;
import java.time.LocalDateTime;

public class Carrito {
    private Persona cliente;
    private Producto[] productos;
    private LocalDateTime fechacompra;
    private Descuento descuento;

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }
    public void setFechacompra(LocalDateTime fechacompra) {
        this.fechacompra = fechacompra;
    }

    public Carrito(Persona clientecar, Producto[] productoscar){
        this.cliente = clientecar;
        this.productos = productoscar;
    }
    public float obtenerprecio() throws NoHayStockException{
        float acumulador = 0;
        for (int i = 0; i < 3; i ++){
            try {
                acumulador += productos[i].getPrecio();
            } catch (NoHayStockException e) {
                System.out.println("No hay stock de " + productos[i].nombre + ".");
                Main.pausar();
            }
        }
        return descuento.obtener_valor_compra_final(acumulador);
    }
}