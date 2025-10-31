//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //1
        double celsius = 30;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(fahrenheit);
    // 2
        double f = 30;
        double c = (f - 32) * 5/9;
        System.out.println(c);
    // 3
        int year = 1943;
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.println("ნაკიანია");
            } else {
                System.out.println("არ არის ნაკიანი");
            }
    // 4
        int x = 7;
        int y = -3;
        if(x > 0 && y > 0){
            System.out.println("პირველი მეოთხედი");
        }else if(x < 0 && y > 0){
            System.out.println("მეორე მეოთხედი");
        } else if (x < 0 && y < 0) {
            System.out.println("მესამე მეოთხედი");
        }else if(x > 0 && y < 0){
            System.out.println("მეოთხე მეოთხედი");
        }
    // 5
        int a = 5;
        int b = 6;
        String operator = "-";
        switch (operator){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("enter +,-,* or /");
        }



    }
}