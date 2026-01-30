import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
//        String text = "hell0w0rld100";
//        int digitCount = 0;
//        for (int i = 0; i < text.length(); i++) {
//            if(Character.isDigit(text.charAt(i))){
//                digitCount ++;
//            }
//        }
//        System.out.println(digitCount);

        //2
//        String text = "Hello! world; hi?";
//        int count = 0;
//        String ending = ".?;!";
//        for (int i = 0; i < text.length(); i++) {
//            char c = text.charAt(i);
//            if(ending.indexOf(c)!=-1){
//                count++;
//            }
//        }
//        System.out.println(count);

        //3
//        String text = "23:32";
//        String reversed = new StringBuilder(text).reverse().toString();
//        if(text.equals(reversed)){
//            System.out.println("palindrome");
//        }else {
//            System.out.println("not palindrome");
//        }

        // 4
//        String s1 = "hello world";
//        String s2 = "world";
//        if(s1.contains(s2)){
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }

        // 5
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter text: ");
//        String text = scanner.nextLine();
//        char lastChar = text.toLowerCase().charAt(text.length() - 1);
//        if (lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u') {
//            System.out.println("last char is vowel");
//        } else {
//            System.out.println("last char is consonant");
//        }

        // 6
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter text: ");
//        String text = scanner.nextLine();
//
//        StringBuilder res = new StringBuilder();
//        int i = 0;
//        while (i < text.length()) {
//            res.append(text.charAt(i));
//            if (i + 1 < text.length() && text.charAt(i) == text.charAt(i + 1)) {
//                i += 2;
//            } else {
//                i++;
//            }
//        }
//        System.out.println(res.toString());
        // 7
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter word: ");
        String text = scanner.nextLine();
        if (text.length() > 10) {
            char first = text.charAt(0);
            char last = text.charAt(text.length() - 1);
            int middle = text.length() - 2;

            System.out.println(first + String.valueOf(middle) + last);
        } else {
            System.out.println("not long word");
        }




    }
}