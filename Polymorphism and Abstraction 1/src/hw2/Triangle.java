package hw2;

public class Triangle extends Shape {
    private double z;

    public Triangle(int x, int y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public void displayName() {
        System.out.println("shape: triangle");
    }

    @Override
    public void displayData() {
        System.out.println("x = " + getX() + ", y = " + getY() + ", z = " + z);
    }

    @Override
    public double getPerimeter() {
        return getX() + getY() + z;
    }
}
