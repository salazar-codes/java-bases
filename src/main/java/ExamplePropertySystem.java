import java.util.Properties;

public class ExamplePropertySystem {
    public static void main(String[] args) {

        // Referencia a otras properties: https://docs.oracle.com/javase%2Ftutorial%2F/essential/environment/sysprop.html

        String username = System.getProperty("user.name");
        System.out.println("Username: " + username);

        String home = System.getProperty("user.home");
        System.out.println("Home o ruta del usuario del SO: " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("Directorio del proyecto: " + workspace);

        String javaVersion = System.getProperty("java.version");
        System.out.println("Java version: " + javaVersion);

        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator: " + lineSeparator2 + "Una linea nueva");

        Properties p = System.getProperties();
        p.list(System.out);
    }
}
