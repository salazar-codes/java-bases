public class ExampleMathClassRandom {
    public static void main(String[] args) {

        String[] colores = {"azul","rojo","verde","blanco","negro"};

        double random = Math.random(); // Devuelve aleatorio entre 0 y 1; El 1 se excluye
        System.out.println("ramdom: " + random);

        random *= 7; // Para que el rango vaya entre 0 y 7
        System.out.println("ramdom: " + random);

        random = Math.floor(random);
        System.out.println("ramdom floor: " + random);

        System.out.println("colores = " + colores[(int) random]);
    }
}
