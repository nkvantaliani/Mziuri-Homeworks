package Hw2Hw3Hw4;

import java.util.ArrayList;
import java.util.HashMap;

public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private String lastName;
    private HashMap<String, ArrayList<Integer>> grades;

    public Student(String id, String name, String lastName, HashMap<String, ArrayList<Integer>> grades) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.grades = grades;
    }

    public String getLastName() {
        return lastName;
    }

    public double averageGrade() {
        int sum = 0;
        int count = 0;

        Object[] values = grades.values().toArray();
        for (int i = 0; i < values.length; i++) {
            ArrayList<Integer> list = (ArrayList<Integer>) values[i];

            for (int j = 0; j < list.size(); j++) {
                sum += list.get(j);
                count++;
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    @Override
    public int compareTo(Student o) {
        double avg1 = this.averageGrade();
        double avg2 = o.averageGrade();
        if (avg1 > avg2) {
            return 1;
        } else if (avg1 == avg2) {
            return 0;
        } else {
            return -1;
        }
    }
}
