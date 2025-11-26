public class Book {
    String title;
    String author;
    int pages;

    Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    void displayBookInfo(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pages);
    }
}
