import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileTime;
import java.util.Scanner;

public class Clase5 {
    public static void main(String[] args) throws IOException {

        /*int[] numeros = new int[] {1, 37, 16};
        int resultado = sumatoria(numeros);
        resultado = resultado / numeros.length;
        System.out.println("Resultado: " + resultado);*/

        /*int resultado = 0;
        for (String arg : args) {
            int numero = Integer.parseInt(arg);
            resultado = resultado + numero;
        }
        System.out.println(resultado);*/

        //leerarchivo();
        //escribirarchivo();
        //manipulararchivos();
        //copiararchivo();
        //probarencodingarchivo();
        //sumatoriaparametrosconsola();
    }
    private static int sumatoria(int[] numerosasumar){
        int suma = 0;
        for (int j : numerosasumar) {
            suma += j;
        }
        return suma;
    }
    public static void leerarchivo() throws IOException{
        String nombre = "C:\\Users\\Usuario\\Desktop\\Desarrollador Java Inicial\\Ejercicio4.txt";
        for (String linea : Files.readAllLines(Paths.get(nombre))){
            System.out.println(linea);
        }
    }
    public static void escribirarchivo() throws IOException {
        Files.writeString(Paths.get("C:\\Users\\Usuario\\Desktop\\Desarrollador Java Inicial\\Recursos\\Clase5_1." +
                "txt"), "hola que tal");
    }
    public static void manipulararchivos() throws IOException {
        Path unarchivo = Paths.get("C:\\Users\\Usuario\\Desktop\\Desarrollador Java Inicial\\Recursos\\Clase5_1.txt");
        System.out.println(unarchivo.toAbsolutePath());

        FileTime ultimamodificacion = Files.getLastModifiedTime(unarchivo);
        System.out.println(ultimamodificacion);

        Path otroarchivo = Paths.get("C:\\Users\\Usuario\\Desktop\\Desarrollador Java Inicial\\Recursos\\Clase.txt");
        System.out.println(Files.exists(otroarchivo));

        //Files.createFile(otroarchivo);
        //System.out.println(Files.exists(otroarchivo));

        Path untemporal = Files.createTempFile("unprefijo", "txt");
        System.out.println(untemporal);

        System.out.println(Files.isDirectory(untemporal));
    }
    private static void copiararchivo() throws IOException {
        Path archivo1 = Paths.get(("C:\\Users\\Usuario\\Desktop\\Desarrollador Java Inicial\\Recursos\\Clase5_1.txt"));
        Path archivo2 = Paths.get("C:\\Users\\Usuario\\Desktop\\Desarrollador Java Inicial\\Recursos\\Clase5_2.txt");
        Path archivo3 = Paths.get("C:\\Users\\Usuario\\Desktop\\Desarrollador Java Inicial\\Recursos\\Clase5_3.txt");

        Files.copy(archivo1, archivo2);
        Files.move(archivo1, archivo3);

    }

    public static void probarencodingarchivo() throws IOException {

        Path utfFile = Files.createTempFile("some", ".txt");

        Files.write(utfFile, "un texto \n con eñes ".getBytes()); // UTF 8

        Files.write(utfFile, (System.lineSeparator() + "y acentos á ").getBytes(), StandardOpenOption.APPEND);

        System.out.println(Files.readAllLines(utfFile) .size());
        System.out.println(utfFile);

        for (String line: Files.readAllLines(utfFile) ) {
            System.out.println(line);
        }

        Path iso88591File = Files.createTempFile("some", ".txt");
        Files.write(iso88591File, "otro texto con eñes".getBytes(StandardCharsets.ISO_8859_1));
    }

    public static void sumatoriaparametrosconsola(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingrese números separados por UN espacio");
        String numeros = scn.nextLine();
        int resultado = 0;
        for (String numeroStr : numeros.split(" ")) {
            int numero = Integer.parseInt(numeroStr);
            resultado = resultado + numero;
        }
        System.out.println(resultado);
    }
}