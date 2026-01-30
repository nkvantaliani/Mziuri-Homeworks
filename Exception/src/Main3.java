import java.util.Scanner;

public class Main3 {

    static double squareRoot(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("number is negative");
        }
        return Math.sqrt(number);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();

        try {
            double res = squareRoot(num);
            System.out.println(res);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
