import java.util.Objects;

public class Toy {
    private String type;
    private int difficultyLevel;

    public Toy(String type, int difficultyLevel) {
        this.type = type;
        this.difficultyLevel = difficultyLevel;
    }
    public boolean isChallenging(){
        if(difficultyLevel > 7){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "type='" + type + '\'' +
                ", difficultyLevel=" + difficultyLevel +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return difficultyLevel == toy.difficultyLevel && Objects.equals(type, toy.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, difficultyLevel);
    }
}
