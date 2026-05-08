public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private int subjectId;
    private double salary;

    public Teacher(String firstName, String lastName, int subjectId, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjectId = subjectId;
        this.salary = salary;
    }
    public Teacher(int id, String firstName, String lastName, int subjectId, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjectId = subjectId;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public double getSalary() {
        return salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subjectId=" + subjectId +
                ", salary=" + salary +
                '}';
    }
}
