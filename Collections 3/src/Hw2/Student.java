package Hw2;

import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String name;
    private String lastName;
    private Date dateOfBirth;
    private ArrayList<Integer> grades;

    public Student(String name, String lastName, Date dateOfBirth, ArrayList<Integer> grades) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return (double) sum / grades.size();
    }
    @Override
    public String toString() {
        return name + " " + lastName +
                " | Birth: " + dateOfBirth +
                " | Avg: " + getAverageGrade();
    }
}
