package Clase6.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Circulo circ = new Circulo();
        circ.setRadio(10);

        Rectangulo rect = new Rectangulo();
        rect.setLado_a(4);
        rect.setLado_b(2);

        Figura[] figuras = new Figura[2];
        figuras[0] = circ;
        figuras[1] = rect;

        for (Figura fig : figuras){
            System.out.println("Perimetro: " + fig.calcularPerimetro());
        }
    }
}
