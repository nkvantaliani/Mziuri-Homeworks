class BookIssuer extends Employee {
    private int startHour;
    private int endHour;

    public BookIssuer(String firstName, String lastName, int id, int startHour, int endHour) {
        super(firstName, lastName, id);
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public int getEndHour() {
        return endHour;
    }

    public int getStartHour() {
        return startHour;
    }

    @Override
    public String toString() {
        return super.toString() + " - Book Issuer (Hours: " + startHour + "-" + endHour + ")";
    }
}