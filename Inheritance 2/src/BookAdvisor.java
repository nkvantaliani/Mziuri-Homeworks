import java.util.Random;

class BookAdvisor extends Employee {
    private double rating;
    private Library library;

    public BookAdvisor(String firstName, String lastName, int id, double rating, Library library) {
        super(firstName, lastName, id);
        this.rating = rating;
        this.library = library;
    }

    public double getRating() {
        return rating;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Book recommendBook() {
        Book[] books = library.getBooks();
        if (books.length == 0) return null;

        Random rand = new Random();
        return books[rand.nextInt(books.length)];
    }

    @Override
    public String toString() {
        return super.toString() + " - Book Advisor (Rating: " + rating + ")";
    }
}
