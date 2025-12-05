//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather("Tbilisi", 12.5, 20, false, true, false);
        weather.display();

        Student[] students = new Student[5];
        students[0] = new Student("Nata", "Kvantaliani", 16, 4, 80);
        students[1] = new Student("mimi", "mimi", 21, 3, 92);
        students[2] = new Student("mimi2", "mimi2", 20, 2, 93.5);
        students[3] = new Student("mimi3", "mimi3", 22, 4, 32);
        students[4] = new Student("mimi4", "mimi5", 18, 1, 94);
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }



    }
    public static String highestScore(Student[] students) {

        Student best = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getAverageScore() > best.getAverageScore()) {
                best = students[i];
            }
        }

        return best.getFirstName() + " " + best.getLastName();
    }
}