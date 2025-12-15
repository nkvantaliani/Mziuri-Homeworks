package hw3;

public class Doll extends Toy{
    private double hairCost;
    private double clothesCost;

    public Doll(double otherCosts, double hairCost, double clothesCost) {
        super(otherCosts);
        this.hairCost = hairCost;
        this.clothesCost = clothesCost;
    }

    public double getHairCost() {
        return hairCost;
    }

    public void setHairCost(double hairCost) {
        this.hairCost = hairCost;
    }

    public double getClothesCost() {
        return clothesCost;
    }

    public void setClothesCost(double clothesCost) {
        this.clothesCost = clothesCost;
    }

    @Override
    public double calculatePrice() {
        return hairCost + clothesCost + getOtherCosts();
    }
}

