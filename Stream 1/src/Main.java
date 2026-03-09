import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // 1
        ArrayList<Integer> nums = new  ArrayList<>();
        nums.add(7);
        nums.add(13);
        nums.add(11);
        nums.add(10);
        nums.add(5);

        int sum= nums.stream().filter(n->n>=10).map(n->n*n).mapToInt(n->n).sum();
        System.out.println(sum);

        // 2
        ArrayList<String> words = new ArrayList<>();
        words.add("java");
        words.add("hello");
        words.add("mimi");
        words.add("coffee");
        ArrayList<String> res = new ArrayList<>();

        words.stream().filter(w->w.startsWith("j")).map(w->w.toUpperCase()).forEach(res::add);
        System.out.println(res);

        // 3
        ArrayList<String> words2 = new ArrayList<>();
        words2.add("java");
        words2.add("hello");
        words2.add("mimi");
        words2.add("coffee");
        words2.add("coffee");

        Set<String> res2 = new HashSet<>();
                words2.stream().sorted().forEach(res2::add);

        System.out.println(res2);

        // 4
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("nata",17));
        humans.add(new Human("mimi",200));
        humans.add(new Human("levani",4));
        humans.add(new Human("levani",17));

        boolean levani = humans.stream().filter(a->a.getAge()>=15).anyMatch(a->a.getName().equals("levani"));

        System.out.println(levani);

        // 5
        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(3);
        nums2.add(12);
        nums2.add(-1);
        int min = nums2.stream().min(Integer::compare).get();

        System.out.println(min);

    }
}