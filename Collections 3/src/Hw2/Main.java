package Hw2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        ArrayList<Integer> g1 = new ArrayList<>();
        g1.add(90); g1.add(85); g1.add(88);

        ArrayList<Integer> g2 = new ArrayList<>();
        g2.add(70); g2.add(75); g2.add(80);

        ArrayList<Integer> g3 = new ArrayList<>();
        g3.add(95); g3.add(92); g3.add(93);

        students.add(new Student("nata", "kvat", new Date(104, 5, 10), g1));
        students.add(new Student("stu1", "ertadze", new Date(102, 3, 20), g2));
        students.add(new Student("stu2", "oradze", new Date(105, 1, 5), g3));

        System.out.println("1)");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("2)");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getLastName().compareTo(s2.getLastName());
            }
        });
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("3)");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getAverageGrade(), s1.getAverageGrade());
            }
        });
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("4)");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getDateOfBirth().compareTo(s2.getDateOfBirth());
            }
        });
        for (Student s : students) {
            System.out.println(s);
        }




    }
}
