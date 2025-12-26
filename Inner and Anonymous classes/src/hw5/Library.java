package hw5;

public class Library {
    private int id;
    private String name;

    public Library(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printInfo(){

        class Book{
            private int bookId;
            private String bookName;

            public Book(int bookId, String bookName) {
                this.bookId = bookId;
                this.bookName = bookName;
            }

            public void printBook(){
                System.out.println(id);
                System.out.println(name);
            }
        }

        System.out.println("library ID: " + id);
        System.out.println("library: " + name);
        Book book = new Book(1, "unknown");
        book.printBook();
    }

}
