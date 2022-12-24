package polyankina_kvbo0821.prac6.hw6_11;

public class Temperature implements Convertable {

    private float kelvin;

    public Temperature(float kelvin) {
        this.kelvin = kelvin;
    }

    public float getKelvin() {
        return kelvin;
    }

    public void setKelvin(float kelvin) {
        this.kelvin = kelvin;
    }

    public void convert() {
        System.out.println(getKelvin() + " kelvin in Fahrenheit: ");
        System.out.println((getKelvin()-273.15)*(9./5)+32);
    }
}
