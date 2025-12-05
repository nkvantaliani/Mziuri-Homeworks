public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int course;
    private double averageScore;

    public Student(String firstName,String lastName, int age , int course, double averageScore) {
        this.firstName = firstName;
        this.averageScore = averageScore;
        this.course = course;
        this.age = age;
        this.lastName = lastName;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            return;
        }
        this.age=age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course<=0){
            return;
        }
        this.age=age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void display(){
        System.out.println(firstName+ " " +lastName);
        System.out.println("age: " + age);
        System.out.println("course: " + course);
        System.out.println("average score: " + averageScore);
    }
}
