import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Country[] countries = new Country[5];
        for (int i = 0; i < 5; i++) {

            System.out.print("enter country name: ");
            String name = scanner.nextLine();
            System.out.print("enter population: ");
            double population = scanner.nextDouble();
            System.out.print("enter area: ");
            double area = scanner.nextDouble();
            scanner.nextLine();

            countries[i] = new Country(name, population, area);
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Serialization 1/countries.txt"))) {
            oos.writeObject(countries);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Serialization 1/countries.txt"))) {

            Country[] countries2 = (Country[]) ois.readObject();
            for (int i = 0; i < countries2.length; i++) {
                System.out.println(countries2[i]);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}