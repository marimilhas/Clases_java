package Clase6.Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Descuento_fijo desc_fijo = new Descuento_fijo();
        desc_fijo.setValor(1000);

        Descuento_porcentaje desc_porcentaje = new Descuento_porcentaje();
        desc_porcentaje.setValor(0.5f);

        float valor_total_compra = 5000f;
        System.out.println("El descuento total es " + desc_fijo.obtenerdescuento(valor_total_compra));
        System.out.println("El descuento total es " + desc_porcentaje.obtenerdescuento(valor_total_compra));

        Producto[] productos = new Producto[3];
        Persona unapersona = new Persona("Mariana", "Milhas");
        Carrito uncarrito = new Carrito(unapersona, productos);

        Producto unprod = new Producto();
        unprod.setNombre("Yerba");
        unprod.setPrecio(600);
        uncarrito.productos[0] = unprod;

        Producto otroprod = new Producto();
        otroprod.setNombre("Azúcar");
        otroprod.setPrecio(400);
        uncarrito.productos[1] = otroprod;

        uncarrito.setDescuento(desc_porcentaje);

        /*Descuento descc;
        if (args[0] == "FIJO"){
            descc = new Descuento_fijo();
        } else{
            descc = new Descuento_porcentaje();
        }*/
    }
}
