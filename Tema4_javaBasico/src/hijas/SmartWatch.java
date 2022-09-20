package hijas;

import padre.SmartDevice;

public class SmartWatch extends SmartDevice {
    private boolean impermeable;
    private boolean podometro;
    private boolean mfCardiaca;

    public SmartWatch() {

    }

    public SmartWatch(String marca, String modelo, String memoriaInterna, double precio, String color, int duracionBateria, boolean impermeable, boolean podometro, boolean mfCardiaca) {
        super(marca, modelo, memoriaInterna, precio, color, duracionBateria);
        this.impermeable = impermeable;
        this.podometro = podometro;
        this.mfCardiaca = mfCardiaca;
    }

    @Override
    public String toString() {
        String resultado = "";
        if (podometro == true && mfCardiaca == true) {
            if (impermeable == true) {
                resultado = marca + " " + modelo + "---" + "\n-Carateristicas-" + "\nMemoria interna: " + memoriaInterna + "\nPrecio: " + precio + "\nColor: " + color + "\nDuracion de bateria: " + duracionBateria + "\nEs impermeable" + "\nTiene un podometro" + "\nTiene monitor de frecuencia cardiaca";
            } else {
                resultado = marca + " " + modelo + "---" + "\n-Carateristicas-" + "\nMemoria interna: " + memoriaInterna + "\nPrecio: " + precio + "\nColor: " + color + "\nDuracion de bateria: " + duracionBateria + "\nNo es impermeable" + "\nTiene un podometro" + "\nTiene monitor de frecuencia cardiaca";
            }

        } else if (podometro == false && mfCardiaca == false) {
            if (impermeable == true) {
                resultado = marca + " " + modelo + "---" + "\n-Carateristicas-" + "\nMemoria interna: " + memoriaInterna + "\nPrecio: " + precio + "\nColor: " + color + "\nDuracion de bateria: " + duracionBateria + "\nEs impermeable" + "\nNo tiene un podometro" + "\nNo tiene monitor de frecuencia cardiaca";
            } else {
                resultado = marca + " " + modelo + "---" + "\n-Carateristicas-" + "\nMemoria interna: " + memoriaInterna + "\nPrecio: " + precio + "\nColor: " + color + "\nDuracion de bateria: " + duracionBateria + "\nNo es impermeable" + "\nNo tiene un podometro" + "\nNo tiene monitor de frecuencia cardiaca";
            }

        } else if (podometro == true || mfCardiaca == false) {
            if (impermeable == true) {
                resultado = marca + " " + modelo + "---" + "\n-Carateristicas-" + "\nMemoria interna: " + memoriaInterna + "\nPrecio: " + precio + "\nColor: " + color + "\nDuracion de bateria: " + duracionBateria + "\nEs impermeable" + "\nTiene un podometro" + "\nNo tiene monitor de frecuencia cardiaca";
            } else {
                resultado = marca + " " + modelo + "---" + "\n-Carateristicas-" + "\nMemoria interna: " + memoriaInterna + "\nPrecio: " + precio + "\nColor: " + color + "\nDuracion de bateria: " + duracionBateria + "\nNo es impermeable" + "\nTiene un podometro" + "\nNo tiene monitor de frecuencia cardiaca";
            }

        } else {
            if (impermeable == true) {
                resultado = marca + " " + modelo + "---" + "\n-Carateristicas-" + "\nMemoria interna: " + memoriaInterna + "\nPrecio: " + precio + "\nColor: " + color + "\nDuracion de bateria: " + duracionBateria + "\nEs impermeable" + "\nNo tiene un podometro" + "\nTiene monitor de frecuencia cardiaca";
            } else {
                resultado = marca + " " + modelo + "---" + "\n-Carateristicas-" + "\nMemoria interna: " + memoriaInterna + "\nPrecio: " + precio + "\nColor: " + color + "\nDuracion de bateria: " + duracionBateria + "\nNo es impermeable" + "\nNo tiene un podometro" + "\nTiene monitor de frecuencia cardiaca";
            }
        }
        return "---" + resultado + "\n-------";
    }
}
