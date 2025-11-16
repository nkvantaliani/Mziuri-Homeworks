import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 1
//        int[] arr = {1, 2, 3};
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

        // 2
//        int[] prices = {1,5,23,5,9,24,77};
//        int minPrice = prices[0];
//        int minDay = 0;
//        int maxProfit = 0;
//        int buyDay = 0;
//        int sellDay = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if(prices[i]<minPrice) {
//                minPrice = prices[i];
//                minDay = i;
//            }
//
//            int profit = prices[i] - minPrice;
//            if (profit > maxProfit) {
//                maxProfit = profit;
//                buyDay = minDay;
//                sellDay = i;
//            }
//        }
//        System.out.println("perfect day to buy product which costs " + prices[buyDay] + "$ is day " + buyDay);
//        System.out.println("perfect day to sell product is day " + sellDay + " which will sell for " + prices[sellDay] + "$");
//        System.out.println("and your profit will be " + maxProfit+ "$");

    // 3
//        int[] arr = {1,2,3,2,1};
//        int[] reversedArr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            reversedArr[i] = arr[arr.length-i-1];
//        }
//        boolean palindrome = true;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] != reversedArr[i]){
//                palindrome = false;
//                break;
//            }
//        }
      // 4
//        int[] arr = {1,2,3,4,5,2,4,5,5,5};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        Scanner input = new Scanner(System.in);
//        System.out.print("enter number you want to remove: ");
//        int num = input.nextInt();
//
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] != num){
//                count ++;
//            }
//        }
//        int[] newArr = new int[count];
//        int numIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] != num){
//                newArr[numIndex] = arr[i];
//                numIndex ++;
//            }
//        }
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.print(newArr[i] + " ");
//        }
    }
}