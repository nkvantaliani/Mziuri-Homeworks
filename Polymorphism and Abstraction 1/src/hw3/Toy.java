package hw3;

public abstract class Toy {
    private double otherCosts;

    public Toy(double otherCosts) {
        this.otherCosts = otherCosts;
    }

    public double getOtherCosts() {
        return otherCosts;
    }

    public void setOtherCosts(double otherCosts) {
        if(otherCosts<0){
            return;
        }
        this.otherCosts = otherCosts;
    }
    public abstract double calculatePrice();
}
