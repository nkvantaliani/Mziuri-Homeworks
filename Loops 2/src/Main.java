import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     // 1
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = input.nextInt();
//        int sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum += i;
//        }
//        int res = sum / n;
//        System.out.println(res);

//    // 2
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n= input.nextInt();
//        String bin = Integer.toBinaryString(n);
//        for (int i = 0; i < bin.length(); i++) {
//            if (bin.charAt(i) == '1') {
//                int power = bin.length() - i - 1;
//                System.out.print((int) Math.pow(2, power) + " ");
//            }
//        }

      // 3
//        for (int i = 1; i <=15 ; i++) {
//            if(i%2==0 || i == 5 || i == 7 || i == 11){
//                continue;
//            }
//            System.out.println(i);
//        }

      // 4
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        String binaryNum = input.nextLine();
//        int newNum = Integer.parseInt(binaryNum, 2);
//        System.out.println(newNum);

     // 5
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = input.nextInt();
//        String bin = Integer.toBinaryString(n);
//        System.out.println(bin);

      // 6
        Random random = new Random();
        int x = random.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
        int guess;
        do {
            System.out.print("guess the number from 1 to 100: ");
            guess = input.nextInt();
            if(guess > x){
                System.out.println("enter lower number");
            } else if (guess < x) {
                System.out.println("enter higher number");
            }else {
                System.out.println("nice guess");
            }
        }while (guess != x);

    }
}