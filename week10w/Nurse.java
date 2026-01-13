package week10w;

public class Nurse extends Person { //child class

    private String shift;
    private double extraAllowance;

    // Constructor
    public Nurse(int id, String name, double baseSalary,
                 String shift, double extraAllowance) {
        super(id, name, baseSalary); //calls parent constructor
        this.shift = shift;
        this.extraAllowance = extraAllowance;
    }

    // Getters & Setters
    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public double getExtraAllowance() {
        return extraAllowance;
    }

    public void setExtraAllowance(double extraAllowance) {
        this.extraAllowance = extraAllowance;
    }

    // Overridden method
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + extraAllowance;
    } //adds allowance to base salary

    @Override
    public String toString() {
        return super.toString() +
                ", Shift: " + shift +
                ", Extra Allowance: " + extraAllowance +
                ", Total Salary: " + calculateSalary();
    }
}

