import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExampleAssingSystemProperties {
    public static void main(String[] args) {
        // Agregamos el archivo config.properties
        // Primero leeremos el contenido del archivo en bytes para cargarlo a las properties de sistema
        try {
            FileInputStream archivo = new FileInputStream("src/main/java/config.properties");

            // Cargar a properties del sistema
            Properties prop = new Properties(System.getProperties());
            prop.load(archivo);
            prop.setProperty("mi.propiedad.personalizada","valor guardado en código"); // agregando una nueva propertie
            System.setProperties(prop); // cargando a las properties del sistema

            // 2 formas de obtener una propiedad
            System.out.println("Propiedad del sistema ---> mi.propiedad.personalizada " + prop.getProperty("mi.propiedad.personalizada"));
            System.out.println("Propiedad del sistema ---> mi.propiedad.personalizada " + System.getProperty("mi.propiedad.personalizada"));
            System.out.println("Propiedad del sistema ---> otra " + System.getProperty("otra"));

            System.getProperties().list(System.out); // listando todas las properties

        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo =" + e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
