package hw4;

public class DailyPaid extends Employee{
    private int workDays;
    private double dailySalary;

    public DailyPaid(String firstName, String lastName, String phoneNumber, int workDays, double dailySalary) {
        super(firstName, lastName, phoneNumber);
        this.workDays = workDays;
        this.dailySalary = dailySalary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        if(workDays<0){
            return;
        }
        this.workDays = workDays;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        if(dailySalary<0){
            return;
        }
        this.dailySalary = dailySalary;
    }
    @Override
    public double getWholeSalary(){
        return dailySalary * workDays;
    }
}
