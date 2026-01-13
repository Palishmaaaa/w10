package week10w;

public class Person { //parent class

    private int id;
    private String name;
    protected double baseSalary;

    // Constructor
    public Person(int id, String name, double baseSalary) {
        this.id = id; //Assigns the constructor values to class variables
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters & Setters
    public int getId() {
        return id; //returns the value of id
    }

    public void setId(int id) {
        this.id = id; //updates the value of id
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Method to be overridden
    public double calculateSalary() {
        return baseSalary;
    }

    // Overrides toString()
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Base Salary: " + baseSalary;
    } 
}

