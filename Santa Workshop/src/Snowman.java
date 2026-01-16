import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Snowman {
    private int height;
    private String hatColor;
    private boolean isMagical;
    private List<String> accessories;

    public Snowman(int height, String hatColor, boolean isMagical) {
        this.height = height;
        this.hatColor = hatColor;
        this.isMagical = isMagical;
        this.accessories = new ArrayList<>();
    }
    public void decorate(String accessory){
        accessories.add(accessory);
    }
    public void melt(){
        if(height==0){
            return;
        }
        height = height / 2;
        if(height<1){
            height =0;
        }
    }
    public void makeMagical(){
        isMagical = true;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "snowMan{" +
                "height=" + height +
                ", hatColor='" + hatColor + '\'' +
                ", isMagical=" + isMagical +
                ", accessories=" + accessories +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snowman snowMan = (Snowman) o;
        return height == snowMan.height && isMagical == snowMan.isMagical && Objects.equals(hatColor, snowMan.hatColor) && Objects.equals(accessories, snowMan.accessories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, hatColor, isMagical, accessories);
    }
}
