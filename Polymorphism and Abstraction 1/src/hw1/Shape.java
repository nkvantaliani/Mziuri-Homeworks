package hw1;

public abstract class Shape {
    private int sides;
    private double sideLength;

    public Shape(int sides, double sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        if(sides<0){
            return;
        }
        this.sides = sides;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        if(sideLength<0){
            return;
        }
        this.sideLength = sideLength;
    }

    public abstract double getPerimeter();
}
