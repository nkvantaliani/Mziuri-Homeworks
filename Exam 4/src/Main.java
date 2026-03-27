import java.util.NoSuchElementException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();

        //1
        System.out.println(list.size());
        try{
            list.removeFirst();
        }catch(NoSuchElementException e){
            System.out.println("list is empty");
        }

        try{
            list.get(0);
        }catch (IndexOutOfBoundsException e){
            System.out.println("index out of bounds");
        }

        // 2
        list.addLast(10);
        System.out.println(list);

        System.out.println(list.removeLast());
        System.out.println(list);

        // 3
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        System.out.println(list);

        // 4
        list.add(0,5);
        System.out.println(list);

        list.add(list.size(),9);
        System.out.println(list);

        // 5

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        // 6
        list.add(2);
        list.add(2);
        System.out.println(list.removeValue(2));

        // 7
        System.out.println(list.get(0));
        System.out.println(list.set(0,100));
        System.out.println(list);

        //8

        int[] arr = list.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(list.toString());





    }
}