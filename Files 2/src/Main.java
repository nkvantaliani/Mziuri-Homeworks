import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter firstname: ");
        String firstName = scanner.nextLine();
        System.out.print("enter lastname: ");
        String lastName = scanner.nextLine();
        System.out.print("enter age: ");
        int age = scanner.nextInt();

        Human person1 = new Human(firstName,lastName,age);
        Human person2 = new Human("Nata", "Kvant", 99);

        person1.walk();
        person1.hangOut(person2);


    }
}