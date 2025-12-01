import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "unknown brand";
        car1.model = "unknown model";
        car1.year = 2025;
        car1.plateNumber = "AB-304-CD";
        car1.display();

//        Recursion rec1 = new Recursion();
//        Scanner input = new Scanner(System.in);
//        System.out.print("enter a: ");
//        int a = input.nextInt();
//        System.out.print("enter b: ");
//        int b = input.nextInt();
//        System.out.print("enter k: ");
//        int k = input.nextInt();
//
//        int res = rec1.sum(a, b, k);
//        System.out.println(res);

        SumRecursion sum1 = new SumRecursion();
        System.out.println(sum1.sum(10));


        Power pow = new Power();
        System.out.println(pow.power(2,2));
    }

    }
