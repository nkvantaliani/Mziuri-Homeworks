import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PhoneContact[] contacts = Data.loadContacts();

        System.out.println("1 - add");
        System.out.println("2 - delete");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            for (int i = 0; i < contacts.length; i++) {
                if (contacts[i] == null) {

                    System.out.print("name: ");
                    String fn = sc.nextLine();

                    System.out.print("lastname: ");
                    String ln = sc.nextLine();

                    System.out.print("phone number: ");
                    String ph = sc.nextLine();

                    System.out.print("email: ");
                    String em = sc.nextLine();

                    contacts[i] = new PhoneContact(fn, ln, ph, em);
                    Data.saveContacts(contacts);
                    break;
                }
            }
        }

        if (choice == 2) {
            for (int i = 0; i < contacts.length; i++) {
                if (contacts[i] != null) {
                    System.out.println(i + " -> " + contacts[i]);
                }
            }

            System.out.print("enter number to remove: ");
            int index = sc.nextInt();

            if (index >= 0 && index < contacts.length) {
                contacts[index] = null;
                Data.saveContacts(contacts);
            }
        }
    }
}