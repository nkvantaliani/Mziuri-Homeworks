import hw1.*;
import hw3.*;
import hw4.*;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(4.0);
        Triangle triangle = new Triangle(3.0);
        System.out.println("square perimeter: "+ square.getPerimeter());
        System.out.println("triangle perimeter: "+ triangle.getPerimeter());

        Doll doll = new Doll(2.1, 100.0, 10.0);
        Car car = new Car(5.4, 45.3, 16, 4);
        System.out.println("doll price = " + doll.calculatePrice());
        System.out.println("car price = " + car.calculatePrice());

        Employee emp1 = new FixedSalary("Nata", "Kvant", "000000000", 25000);
        Employee emp2 = new DailyPaid("Nata", "Kvant", "000000000", 4, 400);

        emp1.displayInfo();
        System.out.println("Salary: " + emp1.getWholeSalary());
        System.out.println();
        emp2.displayInfo();
        System.out.println("Salary: " + emp2.getWholeSalary());

    }

}
