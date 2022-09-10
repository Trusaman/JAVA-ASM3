public class Manager extends Staff implements ICalculator{
    protected String title;

    public Manager(String id, String name, int age, double salaryBase, String startingDate, String department, double leaveDays, String t) {
        super(id, name, age, salaryBase, startingDate, department, leaveDays);
        this.title = t;
    }
    @Override
    void displayInformation() {
        System.out.println(this.title);
    }
    @Override
    public double calculateSalary() {
        return 0;
    }
}
