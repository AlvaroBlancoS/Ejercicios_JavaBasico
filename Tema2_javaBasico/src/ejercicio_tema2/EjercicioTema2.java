package ejercicio_tema2;

import java.util.Scanner;

public class EjercicioTema2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe un precio...");
        double precioSinIva = in.nextDouble();
        double resultado = agregarPrecioConIVA(precioSinIva);
        System.out.println("El precio con IVA es : " + resultado);

    }

    private static double agregarPrecioConIVA(double precio) {
        final double IVA = 21;
        return precio + (precio / 100 * IVA);
    }
}
