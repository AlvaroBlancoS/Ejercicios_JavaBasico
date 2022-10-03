//TODO Escribe el código que devuelva una cadena al revés.
// Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
public class EjercicioReverse {
    public static void main(String[] args) {
        String texto ="Hola mundo";
        System.out.println(reverse(texto.toLowerCase()));
    }
    public static String reverse(String texto) {
        
        return new StringBuilder(texto).reverse().toString();
    }
}




