import java.util.Scanner;

public class EjercicioSorprender {
    //TODO Sorpréndenos creando un programa de tu elección que utilice
    // InputStream, PrintStream, excepciones, un HashMap y un ArrayList,
    // LinkedList o array.
    // Crear una función si es palindromo o no y el parámetro es un array de char.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe una palabra...");
        String cadena = in.next();
        String minuscula = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
                .replace("ú", "u");
        char[] letras = new char[minuscula.length()];

        for (int i = 0; i < minuscula.length(); i++) {
            if (Character.isLetter(minuscula.charAt(i))) {
                letras[i] = minuscula.charAt(i);
            }
        }

        if (isPalindromo(letras)) {
            System.out.println(cadena + " es palindromo");
        } else {
            System.out.println(cadena + " no es palindromo");
        }

    }
    static public boolean isPalindromo(char[] palabra) {
        // Recorrer letras desde 0 posición hasta la mitad
        for (int i = 0; i <= palabra.length / 2; i++) {
            // y desde la mitad hasta la última posición.
            if (palabra[i] != palabra[palabra.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
