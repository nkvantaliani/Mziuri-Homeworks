package hw3;

public class Car extends Toy {
    private double interiorCost;
    private double wheelCost;
    private int wheelCount;

    public Car(double otherCosts, double interiorCost, double wheelCost, int wheelNumber) {
        super(otherCosts);
        this.interiorCost = interiorCost;
        this.wheelCost = wheelCost;
        this.wheelCount = wheelNumber;
    }

    public double getInteriorCost() {
        return interiorCost;
    }

    public void setInteriorCost(double interiorCost) {
        this.interiorCost = interiorCost;
    }

    public double getWheelCost() {
        return wheelCost;
    }

    public void setWheelCost(double wheelCost) {
        this.wheelCost = wheelCost;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    @Override
    public double calculatePrice() {
        return interiorCost + (wheelCost * wheelCount) + getOtherCosts();
    }
}
