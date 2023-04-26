import java.util.regex.Pattern;

public class Clase14 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String linea = "ramonperez@gmail.com";
        //String linea = "pppp";
        System.out.println(linea.matches("([a-z]|[0-9])+@[a-z]+\\.[a-z]+"));


        ////
        //OTRA MANERA

        String expresionRegular = "([a-z]|[0-9])+@[a-z]+\\.[a-z]+";
        final Pattern patron = Pattern.compile(expresionRegular);
        System.out.println( patron.matcher(linea).matches());
        //

        ///
        String linea2 = "META.MAMUT.NARANJA";
        String expresionRegularConContrabarra =  "[A-Z]+\\.[A-Z]+\\.[A-Z]+";
        final Pattern patron2 = Pattern.compile(expresionRegularConContrabarra);
        System.out.println( patron2.matcher(linea2).matches());


    }
}