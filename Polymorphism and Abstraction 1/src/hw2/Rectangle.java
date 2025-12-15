package hw2;

public class Rectangle extends Shape {

    public Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    public void displayName() {
        System.out.println("Shape: Rectangle");
    }

    @Override
    public void displayData() {
        System.out.println("x = " + getX() + ", y = " + getY());
    }

    @Override
    public double getPerimeter() {
        return 2 * (getX() + getY());
    }
}
