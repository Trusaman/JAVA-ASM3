public class Employee extends Staff implements ICalculator{
    double overtimeHours;

    public Employee(String id, String name, int age, double salaryBase, String startingDate, String department, double leaveDays) {
        super(id, name, age, salaryBase, startingDate, department, leaveDays);
    }

    @Override
    public void displayInformation() {

    }

    @Override
    public double calculateSalary() {
        return this.salaryBase;
    }
}
