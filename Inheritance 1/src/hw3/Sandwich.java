package hw3;

public class Sandwich extends Product {
    private double length;

    public Sandwich(double price, double expireDate, double length) {
        super(price, expireDate);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
