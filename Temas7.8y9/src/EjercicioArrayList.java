import java.util.ArrayList;
import java.util.LinkedList;

public class EjercicioArrayList {
    public static void main(String[] args) {
        copiarYPegar();
        rellenoArrayList();
    }

    //TODO Crea un ArrayList de tipo String, con 4 elementos.
    // Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
    public static void copiarYPegar() {
        System.out.println("----Copiar los elementos de ArrayList y pegar con LinkedList----");
        ArrayList<String> lenguajes = new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("JavaScript");
        lenguajes.add("PHP");

        LinkedList<String> lenguajesCopy = new LinkedList<>();

        for (int i = 0; i < lenguajes.size(); i++) {
            lenguajesCopy.add(lenguajes.get(i));
        }
        System.out.println("-->FOREACH CON ARRAYLIST");
        for (String lenguage : lenguajes) {
            System.out.println(lenguage);
        }
        System.out.println("-->FOREACH CON LINKEDLIST");
        for (String lenguaje : lenguajesCopy) {
            System.out.println(lenguaje);
        }
    }

    //TODO Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
    // A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve
    // a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos,
    // siempre y cuando cumplas el primer "for" de relleno.
    public static void rellenoArrayList() {
        System.out.println("----------\n----Mostrar solo números pares----");
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
            for (int j = 0; j < numeros.size(); j++) {
                if (numeros.get(j) % 2 == 0) {
                    numeros.remove(j);
                }

            }
        }
        System.out.println(numeros);
    }
}
