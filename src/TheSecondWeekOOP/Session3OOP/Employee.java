package TheSecondWeekOOP.Session3OOP;

public abstract class Employee extends Person {
    private double salary ;
    private String role ;

    public Employee(String name, int age, double salary, String role) {
        super(name, age);
        this.salary = salary;
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public abstract void work();
}
