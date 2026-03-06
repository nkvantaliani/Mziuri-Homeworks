import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Student implements Comparable<Student>, Serializable  {
    private int id;
    private String firstName;
    private String lastName;
    private int year;
    private double avgScore;
    ArrayList<String> subjects;

    public Student(int id, String firstName, String lastName, int year, double avgScore, ArrayList<String> subjects) {
        this.id = this.id;
        this.firstName = this.firstName;
        this.lastName = this.lastName;
        this.year = this.year;
        this.avgScore = this.avgScore;
        this.subjects = this.subjects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", avgScore=" + avgScore +
                ", subjects=" + subjects +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(subjects, student.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subjects);
    }

    @Override
    public int compareTo(Student o) {
       return Double.compare(this.avgScore, o.avgScore);
    }
}
