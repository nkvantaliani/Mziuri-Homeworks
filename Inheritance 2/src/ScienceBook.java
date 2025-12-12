class ScienceBook extends Book {
    private String field;

    public ScienceBook(String title, int pages, String author, boolean hardcover, String field) {
        super(title, pages, author, hardcover);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    @Override
    public String toString() {
        return super.toString() + " - Science Field: " + field;
    }
}
