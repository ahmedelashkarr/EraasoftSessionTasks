package Y2025M8.D6;

public class Employee {
    String name;
    int age;
    String department;
    double salary;

    Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

}
