package TheSecondWeekOOP.Session3OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainSessionThreeOOP {
    public static void run() {

        List<Employee> employees = new ArrayList<>();
        Employee Chef = new Chef("Ahmed", 21, 5000, "Chef");
        Employee Waiter = new Waiter("Mohamed", 20, 4000, "Waiter");
        employees.addAll(Arrays.asList(Chef, Waiter));

        employees.forEach(employee -> {
            employee.introduce();
            employee.work();
            // I think we should make Employee class implement Eatable instead of Waiter and Chef
            if(employee instanceof Waiter) ((Waiter) employee).eat();
            else ((Chef) employee).eat();
            System.out.println("-------------------------");
        });


    }
}
