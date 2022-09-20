package hijas;

import padre.SmartDevice;

public class SmartPhone extends SmartDevice {
    private String cobertura;

    private int numeroCamaras;

    public SmartPhone() {

    }

    public SmartPhone(String marca, String modelo, String memoriaInterna, int numeroCamaras, double precio, String color, int duracionBateria, String cobertura) {
        super(marca, modelo, memoriaInterna, precio, color, duracionBateria);
        this.numeroCamaras = numeroCamaras;
        this.cobertura = cobertura;
    }

    @Override
    public String toString() {
        return "---" + marca + " " + modelo + "---" + "\n-Caracteristicas-" + "\nMemoria interna: " + memoriaInterna + "\nNumero de camaras: " + numeroCamaras +
                "\nPrecio: " + precio + "\nColor: " + color + "\nDuracion de bateria " + duracionBateria + "\nCobertura: " + cobertura + "\n-------";
    }
}
