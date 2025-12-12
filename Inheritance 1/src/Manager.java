public class Manager extends Coworker{
    private String managerID;

    public Manager(String firstName, String lastName, int age, String coworkerID, String managerID) {
        super(firstName, lastName, age, coworkerID);
        this.managerID = managerID;
    }

    public String getManagerID() {
        return managerID;
    }

    public void setManagerID(String managerID) {
        this.managerID = managerID;
    }
}
