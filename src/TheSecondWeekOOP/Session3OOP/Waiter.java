package TheSecondWeekOOP.Session3OOP;

public class Waiter extends Employee implements Eatable {

    public Waiter(String name, int age, double salary, String role) {
        super(name, age, salary, role);
    }

    @Override
    public void work() {
        System.out.printf("Waiter %s is serving customers\n" , getName());
    }

    @Override
    public void eat() {
        System.out.printf("Waiter %s is having a quick meal break.\n" , getName());
    }
}
