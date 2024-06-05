import java.util.Random;

public class ExampleMathClassRandom {
    public static void main(String[] args) {

        String[] colores = {"azul","rojo","verde","blanco","negro","naranja"};

        double random = Math.random(); // Devuelve aleatorio entre 0 y 1; El 1 se excluye
        System.out.println("ramdom: " + random);

        random *= 7; // Para que el rango vaya entre 0 y 7
        System.out.println("ramdom: " + random);

        random = Math.floor(random);
        System.out.println("ramdom floor: " + random);

        System.out.println("colores = " + colores[(int) random]);

        Random randomObj = new Random(); // retorna un double
        // int randomInt = randomObj.nextInt();
        int randomInt = randomObj.nextInt(25 - 15+1); // genera un aleatorio entre 0 y 9, no incluye el 9
        System.out.println("randomInt: " + randomInt);
    }
}
