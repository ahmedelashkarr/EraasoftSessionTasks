package TheSecondWeekOOP.Session2OOP;

public class Waiter extends Employee{

    public Waiter(String name, int age, double salary, String role) {
        super(name, age, salary, role);
    }

    @Override
    public void work() {
        System.out.printf("Waiter %s is serving customers\n" , getName());
    }
}
