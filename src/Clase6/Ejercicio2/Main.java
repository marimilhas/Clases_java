package Clase6.Ejercicio2;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        DescuentoFijo desc_fijo = new DescuentoFijo();
        desc_fijo.setValor(1000);
        DescuentoPorcentaje desc_porcentaje = new DescuentoPorcentaje();
        desc_porcentaje.setValor(50);

        float valor_compra = 5000;
        System.out.println("El descuento es: $" + desc_fijo.obtener_descuento(valor_compra));
        System.out.println("El descuento es: $" + desc_porcentaje.obtener_descuento(valor_compra));

        Persona cliente1 = new Persona("Ignacio","Sánchez");
        cliente1.fechanac = LocalDateTime.parse("2001-10-05T00:00" + ":00");

        Producto[] productos1 = new Producto[2];
        productos1[0] = new Producto("Yerba", "IN-0085", 600);
        productos1[1] = new Producto("Azúcar", "PDF-417", 400);

        Carrito carrito1 = new Carrito(cliente1, productos1);
        carrito1.fechacompra = LocalDateTime.now();
        //carrito1.setDescuento(desc_fijo);
        carrito1.setDescuento(desc_porcentaje);

        float precio =  carrito1.obtenerprecio();
        System.out.println("Precio total del carrito: $" + precio);
        System.out.println("Producto " + productos1[0].toString());
    }
}
