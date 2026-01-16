import java.util.ArrayList;
import java.util.List;

public class Santa extends WorkshopMember implements ChristmasSpirit{
    private List<Child> childrenList;

    public Santa(String name, String nickName, int age) {
        super(name, nickName, age);
        this.childrenList = new ArrayList<>();
    }
    public void addChild(Child child) {
        childrenList.add(child);
    }

    public void deliverGifts(){
        List<Child> goodChildren = checkNaughtyOrNiceList();
        for (Child child : goodChildren) {
            System.out.println("delivering gift to " + child.getName());
        }
    }

    public List<Child> checkNaughtyOrNiceList() {
        List<Child> goodChildren = new ArrayList<>();
        for (Child child : childrenList) {
            if (child.getBehaviorScore() > 5) {
                goodChildren.add(child);
            }
        }
        return goodChildren;
    }
    @Override
    public void spreadJoy() {
        System.out.println("Santa is spreading joy");
    }

    @Override
    public void singCarols() {
        System.out.println("singing");
    }

    @Override
    public void decorateTree() {
        System.out.println("decorating");
}
}
