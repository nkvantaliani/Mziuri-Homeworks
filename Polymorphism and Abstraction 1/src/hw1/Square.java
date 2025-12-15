package hw1;

public class Square extends Shape {

    public Square(double sideLength) {
        super(4, sideLength);
    }

    @Override
    public double getPerimeter() {
        return 4 * getSideLength();
    }
}
