package TheSecondWeekOOP.Session2OOP;

public class Chef extends Employee{

    public Chef(String name, int age, double salary, String role) {
        super(name, age, salary, role);
    }

    @Override
    public void work() {
        System.out.printf("Chef %s is preparing dishes\n" , getName());
    }
}
