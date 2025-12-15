package hw4;

public class FixedSalary extends Employee {
    public double salary;

    public FixedSalary(String firstName, String lastName, String phoneNumber, double salary) {
        super(firstName, lastName, phoneNumber);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            return;
        }
        this.salary = salary;
    }

    @Override
    public double getWholeSalary() {
        return salary;
    }
}
