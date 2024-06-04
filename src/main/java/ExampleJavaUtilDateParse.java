import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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

            Date fecha2 = new Date();
            System.out.println("fecha actual = " + format.format(fecha2));

            // Comparar 2 fechas
            if(fecha.after(fecha2)){
                System.out.println("Fecha del usuario es después que fecha2");
            }else if(fecha.before(fecha2)){
                System.out.println("Fecha del usuario es anterior que fecha2");
            }else if (fecha.equals(fecha2)){
                System.out.println("Fecha del usuario es igual que fecha2");
            }

            //Otras formas de comprar fechas
            if(fecha.compareTo(fecha2)>0){
                System.out.println("Fecha1 es después que fecha2");
            } else if (fecha.compareTo(fecha2)<0) {
                System.out.println("Fecha1 es antes que fecha2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Fecha1 es igual que fecha2");
            }

            // Todas estas mismas comparaciones son viables de utilizarla con el Calendario
            Calendar calendar = Calendar.getInstance();
            Date fechaSistema = calendar.getTime();
            System.out.println("Fecha sin formato:" + fechaSistema);

            if(fecha.after(fechaSistema)){
                System.out.println("Calendar: Fecha del usuario es después que fecha2");
            }

        } catch (ParseException e) {
            System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
            System.exit(1); // Para terminar la ejecución
            // main(args); // volver a invocar al main
        }
    }
}
