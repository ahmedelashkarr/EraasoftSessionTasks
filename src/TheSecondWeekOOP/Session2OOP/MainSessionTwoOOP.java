package TheSecondWeekOOP.Session2OOP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainSessionTwoOOP {
    public static void run() {

        List<Employee> employees = new ArrayList<>();
        Employee Chef = new Chef("Ahmed", 21, 5000, "Chef");
        Employee Waiter = new Waiter("Mohamed", 20, 4000, "Waiter");
        employees.addAll(Arrays.asList(Chef , Waiter));

        employees.forEach(employee -> {
            employee.introduce();
            employee.work();
            System.out.println("-------------------------");
        });
    }
}
