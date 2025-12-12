class FantasyBook extends Book {
    private String country;

    public FantasyBook(String title, int pages, String author, boolean hardcover, String country) {
        super(title, pages, author, hardcover);
        this.country = country;
    }

    public String getCountry() { return country; }

    @Override
    public String toString() {
        return super.toString() + " - Country: " + country;
    }
}