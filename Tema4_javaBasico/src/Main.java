import hijas.SmartPhone;
import hijas.SmartWatch;
import padre.SmartDevice;

public class Main {
    /*
        He aprovechado de utilizar polimorfismo y ademas, las clases hijas tengo
        toString() para mostrar salida por pantalla en vez de utilizar un metodo cualquiera
        o los getters
     */
    public static void main(String[] args) {
        SmartDevice smartDevice;
        System.out.println("-> SMARTPHONE");
        smartDevice = new SmartPhone("Samsung", "S22", "8GB", 3, 730.15, "negro", 24, "5G");
        System.out.println(smartDevice.toString());
        System.out.println("-> SMARTWATCH");
        smartDevice = new SmartWatch("TouchElex", "Venus", null, 49.99, "Negro", 24, true, true, true);
        System.out.println(smartDevice.toString());

    }
}

