package Hw2Hw3Hw4;


import java.util.Comparator;

public class LastName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getLastName().compareTo(o2.getLastName()) > 0) {
            return 1;
        } else if (o1.getLastName().compareTo(o2.getLastName()) < 0) {
            return -1;
        }
        return 0;
    }
}
