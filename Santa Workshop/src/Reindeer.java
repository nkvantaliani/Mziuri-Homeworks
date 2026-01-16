import java.util.Objects;

public class Reindeer extends WorkshopMember {
    private int flyingSpeed;
    private String noseColor;

    public Reindeer(String name, String nickName, int age, int flyingSpeed, String noseColor) {
        super(name, nickName, age);
        this.flyingSpeed = flyingSpeed;
        this.noseColor = noseColor;
    }
    public void fly(){
        System.out.println("flying");
    }
    public void trainForChristmas(){
        flyingSpeed += 5;
    }
    public char checkFitnessLevel(){
        int score = flyingSpeed - getAge() * 2;
        if (score >= 70) return 'A';
        if (score >= 60) return 'B';
        if (score >= 50) return 'C';
        if (score >= 40) return 'D';
        if (score >= 30) return 'E';
        return 'F';
    }
    @Override
    public String toString() {
        return "Reindeer{" +
                "flyingSpeed=" + flyingSpeed +
                ", noseColor='" + noseColor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reindeer reindeer = (Reindeer) o;
        return flyingSpeed == reindeer.flyingSpeed && Objects.equals(noseColor, reindeer.noseColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flyingSpeed, noseColor);
    }
}
