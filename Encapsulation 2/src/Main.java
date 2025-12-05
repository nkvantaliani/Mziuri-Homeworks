//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ABD123", 1500);
        BankAccount acc2 = new BankAccount("BCA0323", 300);

        acc1.transferMoney(acc2, 500);

        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
    }
}