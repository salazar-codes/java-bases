import java.util.Map;

public class ExampleEnvironmentVariables {

    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv(); // Diccionario de datos
        System.out.println("Variables de entorno del sistema= " + varEnv);

        System.out.println("---- Listando variables de entorno del sistema ----");
        for (String key: varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }

        String username = System.getenv("USERNAME");
        System.out.println("username= " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("java.home= " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("TEMP= " + temDir);

        String path = System.getenv("PATH");
        System.out.println("PATH= " + path);

        String path2 = varEnv.get("Path"); // retorna null si le ponemos PATH, porque el Map es estricto en la forma como se guarda en el sistema, en este caso sería: Path
        System.out.println("PATH2= " + path2);
    }
}
