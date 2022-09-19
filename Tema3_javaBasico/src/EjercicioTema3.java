public class EjercicioTema3 {
    static String[] nombres = {"Alvaro", "Violeta", "Pedro", "Aline"};

    //No sé cuál bucle quiero utilizar pero he dejado los tres ejemplos

    public static void main(String[] args) {
//        bucleFor();
//         bucleForEach();
        bucleWhile();
    }

    private static void bucleFor() {
        System.out.println("---Con bucle for---");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }
    }

    private static void bucleForEach() {
        System.out.println("---Con bucle forEach---");
        for (String nombre : nombres) {
            System.out.print(nombre + " ");
        }
    }

    private static void bucleWhile() {
        System.out.println("---Con bucle while---");
        int contador = 0;
        while (contador < nombres.length) {
            System.out.print(nombres[contador] + " ");
            contador++;
        }
    }
}
