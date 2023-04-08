package Clase7;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class Main {
    private static void leer_archivo() throws IOException {
        try {
            String nombre = "C:\\Users\\Usuario\\Desktop\\Desarrollador Java Inicial\\Hola.txt";
            for (String linea : Files.readAllLines(Paths.get(nombre))){
                System.out.println(linea);
            }
        } catch (NoSuchFileException e){
            System.out.println("El archivo no existe.");
        } catch (IOException e){
            System.out.println("ERROR");
        }
    }
    public static void main(String[] args) throws IOException {
        int valor1 = 100;
        int valor2 = 0;

        /*try {
            int resultado_div = valor1 / valor2;
            System.out.println("Hola.");
        } catch (Exception e) {
            System.out.println("Dio error la división.");
        }

        try{
            System.out.println("El segundo parámetro es: " + args[1]);
        } catch (Exception e){
            System.out.println("Error en los parámetros.");
        }*/

        leer_archivo();

    }
}
