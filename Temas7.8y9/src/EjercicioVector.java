import java.util.Vector;

public class EjercicioVector {

    public static void main(String[] args) {
        primerVector();
        segundoVector();
    }

    //TODO Crea un vector del tipo de dato que prefieras, y añádele 5 elementos,
    // Elimina el 2o y 3o elemento y muestra el resultado final
    public static void primerVector() {
        System.out.println("---Mostrar solo 3 elementos----");
        Vector<String> vector = new Vector<>();
        vector.add("Real Madrid");
        vector.add("Real Sociedad");
        vector.add("Barsa");
        vector.add("Bayern de Munich");
        vector.add("Club Atletico de Madrid");
        vector.remove(2);
        vector.remove(3);
        System.out.println("Hemos eliminado dos elementos con remove() y ahora son "+vector.size()+" elementos:");
        for (String equipo : vector) {
            System.out.println(equipo);
        }
    }

    //FIXME indica cuál es el problema de utilizar un vector
    // con la capacidad por defecto si tuviésemos 1000 elementos
    // para ser añadidos al mismo
    public static void segundoVector() {
        System.out.println("----------");
        System.out.println("Indica cual es el problema de utilizar un vector" +
                "con la capacidad por defecto su tuviesemos 1000 elementos " +
                "para ser añadidos al mismo");
        System.out.println("Respuesta--->  No hay ningún problema si el vector puede incrementar la capacidad.\n" +
                "Pero si sólo tiene el inicio de capacidad por ejemplo 10 posiciones y no incrementa, entonces si\n" +
                "podría tener problemas");
    }

}
