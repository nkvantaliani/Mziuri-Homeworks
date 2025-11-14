import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//    // 1
//        int b[] = new int[12];
//        Random random = new Random();
//        for (int i = 0; i <b.length ; i++) {
//            b[i] = random.nextInt(100)+1;
////            System.out.println(b[i]);
//        }
//    //2
//        //1
//        int sum = 0;
//        for (int i = 0; i < b.length; i++) {
//            sum += b[i];
//        }
//        System.out.println(sum);
//        // 2
//        int multp = 1;
//        for (int i = 0; i < b.length; i++) {
//            multp = multp * b[i];
//        }
//        System.out.println(multp);
//        //3
//        double avg = sum / 12;
//        System.out.println(avg);

//    // 3
//        //1
//        int[] b = new int[20];
//        Random random = new Random();
//        for (int i = 0; i < b.length; i++) {
//            b[i] = random.nextInt(21);
//            System.out.println(b[i]);
//        }
//        //2
//        int min = b[0];
//        int max = b[0];
//        for (int i = 1; i < b.length; i++) {
//            if(b[i] < min){
//                min = b[i];
//            }
//            if (b[i] > max){
//                max = b[i];
//            }
//        }
//        System.out.println(min);
//        System.out.println(max);
//    // 4
//        int[] a = new int[15];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = i +1;
//            System.out.println(a[i]);
//        }
//
//    // 5
//        //1
//        int sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum += a[i];
//
//        }
//        System.out.println(sum);
//        // 2
//        int multp = 1;
//        for (int i = 0; i < a.length; i++) {
//            multp = multp * a[i];
//        }
//        System.out.println(multp);
//        // 3
//        double avg = sum / a.length;
//        System.out.println(avg);
     // 6
//        Random random = new Random();
//        int x = random.nextInt(100);
//        int[] arr = {12,23,45,15,43,14,48,68,20,55,37,75};
//        boolean isPresent = false;
//        for (int i = 0; i < arr.length; i++) {
//            if(x == arr[i]){
//                isPresent = true;
//                break;
//            }
//        }
//        System.out.println(isPresent);
     // 7
//        int[] arr = {1,2,3,4,5,6,7};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = input.nextInt();
//        int[] newArr = new int[arr.length+1];
//        newArr[0] = n;
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i+1] = arr[i];
//        }
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.println(newArr[i]);
//        }

     // 8
//        int num = 8;
//        int[] arr = {1,2,3,4,5};

     // 9
//        int[] arr = {1,2,3};
//        Scanner input = new Scanner(System.in);
//        while (true) {
//
//            boolean allIsZero = true;
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] != 0) {
//                    allIsZero = false;
//                    break;
//                }
//            }
//            if (allIsZero) {
//                System.out.println("every number is 0");
//                break;
//            }
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();
//            System.out.print("enter number to make it 0: ");
//            int n = input.nextInt();
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == n) {
//                    arr[i] = 0;
//                }
//            }
//        }
    }
}