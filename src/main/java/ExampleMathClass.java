public class ExampleMathClass {

    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("Valor absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("Valor absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2); // El máximo entre 2 números
        System.out.println("máximo = " + max);

        double min = Math.min(3.5, 1.2); // El máximo entre 2 números
        System.out.println("mínimo = " + min);

        double techo = Math.ceil(3.5); // Redondea hacia arriba
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5); // Redondea hacia abajo
        System.out.println("techo = " + piso);

        long rounded = Math.round(3.2); // Redondea un decimal a entero
        System.out.println("rounded = " + rounded);
    }
}


