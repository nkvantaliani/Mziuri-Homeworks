public class BankAccount {
    private final String accountNumber;
    private int pin;
    private double balance;
    private boolean accountLock = true;


    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void lockAccount() {
        this.accountLock = false;
        System.out.println("account locked");
    }

    public void unlockAccount() {
        this.accountLock = true;
        System.out.println("account unlocked");
    }
    public boolean transferMoney(BankAccount targetAccount, double amount) {

        if (!targetAccount.accountLock) {
            System.out.println("account is locked");
            return false;
        }

        if (amount > 1000) {
            System.out.println("amount should be lower than 1000");
            return false;
        }
        if (amount <= 0) {
            System.out.println("enter valid number");
            return false;
        }
        if (this.balance < amount) {
            System.out.println("not enough money");
            return false;
        }

        this.balance -= amount;
        targetAccount.balance += amount;
        return true;
    }
    public double getBalance() {
        return this.balance;
    }



}
