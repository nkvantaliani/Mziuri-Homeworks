package hw1;

public class Triangle extends Shape{
    public Triangle(double sideLength) {
        super(3, sideLength);
    }
    @Override
    public double getPerimeter() {
        return 3 * getSideLength();
    }
}
