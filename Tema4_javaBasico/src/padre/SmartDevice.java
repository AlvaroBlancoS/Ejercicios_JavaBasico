package padre;

public class SmartDevice {
    protected String marca;
    protected String modelo;

    protected String memoriaInterna;
    protected String color;
    protected double precio;

    protected int duracionBateria;


    public SmartDevice() {

    }

    public SmartDevice(String marca, String modelo, String memoriaInterna, double precio, String color, int duracionBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaInterna=memoriaInterna;
        this.precio = precio;
        this.color = color;
        this.duracionBateria = duracionBateria;
    }

}
