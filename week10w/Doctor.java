package week10w;

public class Doctor extends Person { //child class

    private String specialization;
    private double consultationFee;

    // Constructor
    public Doctor(int id, String name, double baseSalary,
                  String specialization, double consultationFee) {
        super(id, name, baseSalary); //calls parent class constructor
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    // Getters & Setters
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    // Overridden method
    @Override
    public double calculateSalary() { //overrides from person
        return super.calculateSalary() + consultationFee; //calls parent method using super
    } //adds consultation fee to base salary

    // Overloaded method //same method name different parameter
    public double calculateSalary(int emergencyCases) {
        double emergencyBonus = emergencyCases * 1000;
        return calculateSalary() + emergencyBonus;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Specialization: " + specialization +
                ", Consultation Fee: " + consultationFee +
                ", Total Salary: " + calculateSalary();
    } //combines parent and child details
}


