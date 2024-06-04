import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleJavaUtilDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("fecha = " + date);

        // Formateador de fecha
        SimpleDateFormat df = new SimpleDateFormat("dd-MMMM-YYYY"); // MM: Muestra el número de mes, MMMM: Muestra el nombre del mes, puede aceptar dd MMMM YYYY, dd/MMMM/YYYY
        df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
        String fechaStr = df.format(date);

        // En unix se contabilizaban los segundos (marca temporal) -> TimeStamp la representación de la fecha en formato numérico
        // En Java, milisegundos

        long j = 0;
        for (int i = 0; i < 1000000; i++) {
            j += i;
        }
        System.out.println("j = " + j);

        Date date2 = new Date();
        // getTime(): Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.
        long tiempoFor = date2.getTime() - date.getTime(); // Para ver el tiempo que transcurrió en milisegundos
        System.out.println("Tiempo transcurrido en el for = " + tiempoFor);
        System.out.println("fechaStr = " + fechaStr);
    }
}
