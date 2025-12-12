class Book {
    private String title;
    private int pages;
    private String author;
    private boolean hardcover;

    public Book(String title, int pages, String author, boolean hardcover) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.hardcover = hardcover;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isHardcover() {
        return hardcover;
    }

    public void read() {
        System.out.println("მე ვკითხულობ " + title + " წიგნს");
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + pages + " pages, " + (hardcover ? "hardcover" : "softcover") + ")";
    }
}
