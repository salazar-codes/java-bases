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

        double exp = Math.exp(1); // 2.71828 elevado a la 1
        System.out.println("exp = " + exp);

        double log = Math.log(10); // tiene como constante el número e 2.3085
        System.out.println("log = " + log);

        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("Convertir de radianes a grados" + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("Convertir de grados a radianes" + radianes);

        System.out.println("sin(90): " + Math.sin(radianes)); // en radianes
        System.out.println("cos(90): " + Math.cos(radianes)); // en radianes

        radianes = Math.toRadians(180.00);
        System.out.println("cos(180): " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(180): " + Math.cos(radianes));
    }
}


