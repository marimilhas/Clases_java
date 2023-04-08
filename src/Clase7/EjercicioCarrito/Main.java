package Clase7.EjercicioCarrito;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void pausar(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws NoHayStockException {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Presione ENTER para iniciar su compra!");
        entrada.nextLine();
        System.out.println("Agregando productos al carrito...");
        pausar();
        System.out.println("\n↓ Ingrese los siguientes datos ↓");

        Persona cliente1 = new Persona("Ignacio", "Sánchez");
        cliente1.setFechanac(LocalDateTime.parse("2001-10-05T00:00" + ":00"));

        Producto[] productos1 = new Producto[3];
        productos1[0] = new Producto("Jabón en polvo", 1000, 5);
        productos1[1] = new Producto("Esponjas", 200, 20);
        productos1[2] = new Producto("Chocolates", 350, 0);

        Carrito carrito1 = new Carrito(cliente1, productos1);
        carrito1.setFechacompra(LocalDateTime.now());
        DescuentoFijo tope = new DescuentoFijo();
        tope.setValor_descuento(75);

        String tipo_descuento = Descuento.validar_descuento();
        carrito1.setDescuento(Descuento.crear_descuento(tipo_descuento, tope.getValor_descuento()));

        System.out.println("Cargando...\n");
        pausar();
        System.out.println("Precio total del carrito: $" + carrito1.obtenerprecio());
    }
}