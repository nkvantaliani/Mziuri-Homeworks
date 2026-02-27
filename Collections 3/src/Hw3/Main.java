package Hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "X5", 2018, 120000,
                new Engine("Petrol", 6, 3.0)));

        cars.add(new Car("Toyota", "Corolla", 2015, 180000,
                new Engine("Hybrid", 4, 1.8)));

        cars.add(new Car("Mercedes", "C200", 2020, 90000,
                new Engine("Diesel", 4, 2.0)));

        System.out.println("1)");
        for (Car c : cars) {
            System.out.println(c);
        }

        System.out.println("2)");
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return Integer.compare(c1.getYear(), c2.getYear());
            }
        });
        for (Car c : cars) {
            System.out.println(c);
        }

        System.out.println("3)");
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return Integer.compare(c1.getMileage(), c2.getMileage());
            }
        });
        for (Car c : cars) {
            System.out.println(c);
        }

        System.out.println("4)");
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return Double.compare(
                        c1.getEngine().getVolume(),
                        c2.getEngine().getVolume()
                );
            }
        });
        for (Car c : cars) {
            System.out.println(c);
        }


    }
}
