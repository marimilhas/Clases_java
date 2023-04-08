package Clase6.Ejercicio1;

public class MainDibujable {
    public static void main(String[] args) {
        Circulo circ = new Circulo();
        circ.setRadio(10);

        Rectangulo rect = new Rectangulo();
        rect.setLado_a(4);
        rect.setLado_b(2);

        FormaLibre formalibre = new FormaLibre();
        Dibujable[] dibujable_array = new Dibujable[3];
        dibujable_array[0] = circ;
        dibujable_array[1] = rect;
        dibujable_array[2] = formalibre;

        for (Dibujable dibujo : dibujable_array){
            dibujo.dibujar();
        }

        /*Figura[] figuras = new Figura[2];
        figuras[0] = circ;
        figuras[1] = rect;

        for (Figura fig : figuras){
            System.out.println("Perimetro: " + fig.calcularPerimetro());
        }*/
    }
}
