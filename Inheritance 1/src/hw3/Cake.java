package hw3;

public class Cake extends Product{

    private double weight;

    public Cake(double price, double expireDate, double weight) {
        super(price, expireDate);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
