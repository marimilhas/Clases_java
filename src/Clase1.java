public class Clase1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int ingresos = 100;
        int unavariable = 10;
        switch (unavariable){
            case 'a':
                System.out.println("Es a!!!!");
                break;
            case 'b':
                System.out.println("Es b!!!");
                break;
            case 'c':
                System.out.println("Es c!!!");
                break;
            default:
                System.out.println("Falsa!!!");
        }
        if (ingresos < 100) {
            System.out.println("Verdadero!!!");
        } else {
            System.out.println("Falso!!!");
        }

        for (int unnum = 0; unnum < 5; unnum++) {
            System.out.println(unnum);
        }
        int cont = 0;
        boolean condicion = true;
        while (condicion) {
            System.out.println("puto");
            cont ++;
            if (cont == 5) {
                condicion = false;
            }
        }

        System.out.println("Fin");
    }
}