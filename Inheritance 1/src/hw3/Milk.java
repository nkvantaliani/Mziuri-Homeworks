package hw3;

public class Milk extends Product {
    private double volume;

    public Milk(double price, double expireDate ,double volume) {
        super(price, expireDate);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
