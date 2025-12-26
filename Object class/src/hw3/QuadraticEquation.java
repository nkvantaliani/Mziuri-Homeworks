package hw3;
import java.lang.Math;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private Double x1;
    private Double x2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        double d = b * b - 4 * a * c;

        if (d < 0) {
            x1 = null;
            x2 = null;
        } else if (d == 0) {
            x1 = -b / (2 * a);
            x2 = x1;
        } else {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
        }
    }

    @Override
    public String toString() {
        if (x1 == null && x2 == null) {
            return "The equation has no solution";
        }
        return "a=" + a + ", b=" + b + ", c=" + c +
                ", x1=" + x1 + ", x2=" + x2;
    }
}
