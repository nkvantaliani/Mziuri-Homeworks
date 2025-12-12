class BookShelver extends Employee {
    public BookShelver(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }

    @Override
    public String toString() {
        return super.toString() + " - Book Shelver";
    }
}
