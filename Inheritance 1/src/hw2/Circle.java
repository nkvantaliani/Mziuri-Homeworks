package hw2;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return 3.1415926 * radius * radius;
    }

    public  double getPerimeter(){
        return 2* 3.1415926 *radius;
    }
}
