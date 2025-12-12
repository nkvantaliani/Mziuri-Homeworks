package hw2;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public double getDiagonal(){
        return Math.sqrt(length * length + width * width);
    }

}
