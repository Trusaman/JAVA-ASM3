abstract class Staff {
    protected String id;
    protected String name;
    protected int age;
    protected double salaryBase;
    protected String startingDate;
    protected String department;
    protected double leaveDays;
    public Staff(String id, String name, int age, double salaryBase, String startingDate, String department, double leaveDays) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.salaryBase = salaryBase;
        this.startingDate = startingDate;
        this.leaveDays = leaveDays;
    }
    abstract void displayInformation();

}
