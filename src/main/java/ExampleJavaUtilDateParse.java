import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExampleJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // Patrón para formatear la fecha a ingresar líneas abajo

        System.out.println("Ingrese una fecha con formato yyyy-MM-dd :");

        try { // Es importante usar el try catch porque al string le podemos pasar cualquier cosa
            // Date fecha = format.parse("2021-01-25"); // La idea es que esto lo ingrese el usuario
            Date fecha = format.parse(scanner.next());
            System.out.println("fecha = " + fecha);
            System.out.println("fecha = " + format.format(fecha));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
