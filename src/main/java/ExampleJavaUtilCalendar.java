import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExampleJavaUtilCalendar {
    public static void main(String[] args) {

        // Utilizamos calendar para asignar una fecha en específico
        Calendar calendario = Calendar.getInstance(); // Es una clase abstracta. No se puede utilizar con new

        //calendario.set(2024, Calendar.SEPTEMBER,25, 19, 20, 10); // Permite indicar una fecha en específico. El mes parte en 0.

        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);
        //calendario.set(Calendar.HOUR_OF_DAY, 21); // 9PM
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM); // Para agregar AM, PM
        calendario.set(Calendar.MINUTE, 59);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 123);

        Date fecha = calendario.getTime(); // Devuele un tipo Date
        System.out.println("Calendario = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss:SSS"); // HH: horas de 0 a 24, hh: horas de 0 a 12
        String dateStr = formato.format(fecha);
        System.out.println("Calendario format = " + dateStr);
    }
}
