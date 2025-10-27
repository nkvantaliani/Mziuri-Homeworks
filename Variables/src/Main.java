//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    // 1
        int a = 2;
        int b = 20;
        int x = a;
        a = b;
        b = x;
        System.out.println("a = " + a + " b = " + b );
    // 1 (a)
        int num1 = 7;
        int num2 = 5;
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1 = " + num1 + " num2 = " + num2);
    // 2
        double floatN = 10.234;
        long wholeN = (long)floatN;
        System.out.println(floatN-wholeN);
    // 3
        int num = 1234;
        double number = num / 1000;
        System.out.println(number < 1);
    // 4
//        char lowerCaseChar = "a";

    // 5
        double doubleN = 14.534;
        int whole = (int) doubleN;
        double res = doubleN - whole;
        if (res >= 0.5){
            doubleN = doubleN + (1-res);
        }else{
            doubleN = doubleN - res;
        }
        System.out.println((int)(doubleN));
    // 6
        int a1 = 6;
        int b1 = 5;
        int k = 3;
        int x1 = a1 / k;
        if (a1 % k >= 1){
            x1 = x1 +1;
        }
        int y1 = b1 / k;
        if(b1 % k >=1){
            y1 = y1 +1;
        }
        int res1 = x1 * y1;
    // 7
        int secs = 4321;
        int hours=0;
        int minutes = 0;
        if(secs > 3600){
            hours = secs / 3600;
            secs = secs - hours * 3600;
        }
        if(secs>60){
            minutes = secs / 60;
            secs = secs - minutes *60;
        }
        System.out.println(hours + ":" + minutes + ":" + secs);
    // 8
        int seconds = 4321;
        int hours1 = seconds / 3600;
        seconds = seconds % 3600;
        int minutes1 = seconds / 60;
        int seconds1 = seconds % 60;

        System.out.println(hours1 + ":" + minutes1 + ":" + seconds1 );
    }
}