import java.util.ArrayList;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(51);
            list.add(arr[i]);
        }

        int max = list.get(0);
        int index = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                index = i;
            }
        }

        System.out.println("max:" + max);
        System.out.println("index of max: " + index);
    }
}
