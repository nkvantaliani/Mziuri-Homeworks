package hw2;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public double getPerimeter(){
        return side1 + side2 +side3;
    }

    public double getArea(){
        double halfP = getPerimeter() / 2;
        return Math.sqrt(halfP * (halfP - side1) * (halfP - side2) * (halfP - side3));
    }
}
