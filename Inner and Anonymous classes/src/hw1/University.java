package hw1;

public class University {
    private String name;
    private boolean isState;
    private int courseCount;

    public University(String name, boolean isState, int courseCount) {
        this.name = name;
        this.isState = isState;
        this.courseCount = courseCount;
    }
    public void display(){
        System.out.println(name);
        System.out.println(isState);
        System.out.println(courseCount);
    }
    public class Student{
        private String firstName;
        private String lastName;
        private int age;
        private String id;
        private double averageScore;
        private int course;

        public Student(String firstName, String lastName, int age, double averageScore, String id, int course) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.averageScore = averageScore;
            this.id = id;
            this.course = course;
        }
        public void displayStudent(){
            System.out.println(firstName+" " + lastName+ " " + age);
            System.out.println(id);
            System.out.println(course);
        }
    }

}
