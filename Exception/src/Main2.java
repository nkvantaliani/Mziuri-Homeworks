import java.util.Scanner;

public class Main2 {

    // 3)
    static boolean isNegative(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("don't enter negative number");
        }
        return true;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();

        try{
            isNegative(num);
            System.out.println(num);

        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }

    }
}
