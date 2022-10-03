public class EjercicioArrays {

    public static void main(String[] args) {
        arrayUnidimensional();
        arrayBidimensional();
    }

    //TODO: Crea un array unidimensional Strings y recórrelo, mostrando únicamente sus valores
    public static void arrayUnidimensional() {
        System.out.println("----Array Unidimensional----");
        String[] nombres = {"Angle Lock", "The Sharpshooter", "STF", "Crippler Crossface"};
        System.out.println("-->Estoy utilizando un bucle foreach:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        System.out.println("-->Estoy utilizando un bucle for:");
        //--- O un simple bucle for

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }

    //TODO: Crea un array bidimensional de enteros y recórrelo,
    // mostrando la posición y el valor de cada elemento en ambas dimensiones
    public static void arrayBidimensional() {
        System.out.println("----------\n----Array bidimensional----");
        int[][] bidimensional = {{9, 8, 7, 6}, {1, 2, 3, 4}};
        for (int i = 0; i < bidimensional.length; i++){
            System.out.println("Valor de i (fila) es "+i);
            for (int j =0; j< bidimensional[1].length; j++){
                System.out.println("La posicion (columna) es "+j);
                System.out.println("Resultado -->"+bidimensional[i][j]);
            }
        }
    }
}



