package Hw4;
public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        library.populateList();

        for (Book book : library.getBooks()) {
            System.out.println(book);
        }
    }
}
