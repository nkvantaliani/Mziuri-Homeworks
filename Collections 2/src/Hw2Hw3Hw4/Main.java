package Hw2Hw3Hw4;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> grades1 = new HashMap<>();

        ArrayList<Integer> geo = new ArrayList<>();
        geo.add(1);
        geo.add(4);
        geo.add(7);
        geo.add(8);
        geo.add(9);

        ArrayList<Integer> math = new ArrayList<>();
        math.add(9);
        math.add(8);
        math.add(9);
        math.add(8);
        math.add(7);

        grades1.put("georgian", geo);
        grades1.put("math", math);

        Student s1 = new Student("12", "nata", "kvat", grades1);

        HashMap<String, ArrayList<Integer>> grades2 = new HashMap<>();
        ArrayList<Integer> geo2 = new ArrayList<>();
        geo2.add(5);
        geo2.add(6);
        geo2.add(7);
        grades2.put("ქართული", geo2);

        Student s2 = new Student("2", "Ana", "Ber", grades2);

        System.out.println(s1.compareTo(s2));

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        System.out.println(new LastName().compare(s1, s2));
    }
}
