package paquete;

public class Tema1 {

    public static void main(String[] args) {

        // 1. numericos
        // 1.1 enteros
        byte variable1 = 5;
        short variable2 = 10;
        int variable3 = 30;
        long variable4 = 100;
        // 1.2 decimales
        float variable5 = 5.5f;
        double variable6 = 10.5d;
        System.out.println("---1. Numéricos---\n"+"Tipo byte :"+variable1+"\nTipo short :"+variable2+"\nTipo int :"+variable3+"\nTipo long :"+variable4);
        // 2. booleano
        boolean variable7 = false;
        boolean variable8 = true;
        System.out.println("---2. booleano---\n"+variable7+"\n"+variable8);
        // 3. texto
        char variable9 = 'a';
        String variable10 = "Lorem ipsum dolor sit amet...";
        System.out.println("---3. texto---\n"+"tipo char :"+variable9+"\n"+"String :"+variable10);
    }
}
