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
        System.out.println("fecha str = " + fechaStr);
    }
}
