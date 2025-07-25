package TheSecondWeekOOP.Session3OOP;

public class Chef extends Employee implements Eatable{

    public Chef(String name, int age, double salary, String role) {
        super(name, age, salary, role);
    }

    @Override
    public void work() {
        System.out.printf("Chef %s is preparing dishes\n" , getName());
    }

    @Override
    public void eat() {
        System.out.printf("Chef %s is tasting the food.\n" , getName());
    }
}
