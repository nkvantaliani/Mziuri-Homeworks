public class Coworker extends Human{
    private String coworkerID;

    public Coworker(String firstName, String lastName, int age, String coworkerID) {
        super(firstName, lastName, age);
        this.coworkerID = coworkerID;
    }


    public String getCoworkerID() {
        return coworkerID;
    }

    public void setCoworkerID(String coworkerID) {
        this.coworkerID = coworkerID;
    }
}
