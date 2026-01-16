import java.util.Objects;

public class Elf extends WorkshopMember implements ChristmasCelebrator {
    private int skillLevel;
    private String elfType;
    private int experience;

    public Elf(String name, String nickName, int age, int skillLevel, String elfType) {
        super(name, nickName, age);
        this.skillLevel = skillLevel;
        this.elfType = elfType;
    }
    public void makeToy(){
        System.out.println("making toys");
        increaseExperience();
    }
    public void wrapGifts(){
        System.out.println("wrapping gifts");
        increaseExperience();
    }
    private void increaseExperience(){
        experience++;
    }

    @Override
    public String toString() {
        return "Elf{" +
                "skillLevel=" + skillLevel +
                ", elfType='" + elfType + '\'' +
                ", experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Elf elf = (Elf) o;
        return skillLevel == elf.skillLevel && experience == elf.experience && Objects.equals(elfType, elf.elfType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillLevel, elfType, experience);
    }
    @Override
    public void celebrateChristmas() {
        System.out.println(getName() + " is celebrating Christmas");
    }

    @Override
    public void hostChristmasParty() {
        System.out.println(getName() + " is hosting a Christmas party");
    }
}
