import java.util.ArrayList;

public class Hw2 {
        public static void printList(ArrayList<Integer> list) {
            System.out.print("list of {");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                if (i < list.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
}
