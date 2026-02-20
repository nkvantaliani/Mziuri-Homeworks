import java.util.ArrayList;
import java.util.Random;

public class Hw1 {
        public static void main(String[] args) {

            ArrayList<Integer> list = new ArrayList<>();
            Random random = new Random();

            while(true){
                int num = random.nextInt(51);
                list.add(num);
                if (num == 40) {
                    break;
                }
            }

            System.out.println("list size: " + list.size());

            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                if (i < list.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 == 0) {
                    list.remove(i);
                    i--;
                }
            }

            System.out.println("after removing even numbers:");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                if (i < list.size() - 1) {
                    System.out.print(", ");
                }
            }
        }
    }

