import java.util.Scanner;

public class EjercicioDividirPorCero {
    //TODO Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su
    // llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
    // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en
    // cualquier caso: "Demo de código".
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca dos numeros");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        try {
            System.out.println("El resultado es: "+dividePorCero(num1,num2));
        }catch (ArithmeticException e){
            System.err.println("Esto no puede hacerse "+e.getLocalizedMessage());
        }finally {
            System.out.println("Demo codigo");
        }
    }


    public static int dividePorCero(int num1, int num2) throws ArithmeticException {

        return num1 / num2;
    }


}
