public class Main {
    public static void main(String[] args) {

    // 1
        int res = 0;
        for(int i=10; i <= 100; i+=5 ){
            res += i;
        }
        System.out.println(res);
    // 2
        int num = -1234;
        int result = 0;
        if(num==0){
            result = 0;
        }else if(num<0){
            num = -num;
        }
        for(int i=0; num > 0; num/=10 ){
            result ++;
        }
        System.out.println(result);

    // 3
        int number = 2;
        boolean isPrime = true;
        if(number <= 1){
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }

        }}
        if (isPrime) {
            System.out.println("მარტივია");
        } else {
            System.out.println("არ არის მარტივი");
        }

    // 4
        int number1 = 48;
        int number2 = 16;
        while (true) {
            if (number1 == number2) {
               break;
            } else if (number1 < number2) {
               number2 -= number1;
           } else if (number1 > number2) {
                number1 -= number2;
            }
        }
        System.out.println(number2);

    // 5
        for (int i = 100; i <= 999; i++) {
            int num1 = i / 100;
            int num2 = (i / 10) % 10;
            int num3 = i % 10;

            int sum = num1 + num2 + num3;

            if (i % sum == 0) {
                System.out.println(i);
            }
        }
    // 6
        int first = 0;
        int second = 1;
        int next;
        System.out.print(first+" " +second+" ");
        for (int i = 3; i <= 10; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }

    }

}