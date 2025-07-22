package TheSecondWeekOOP.Session2OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainSessionTwoOOP {
    public static void run() {

        List<Employee> employees = new ArrayList<>();
        Employee Chef = new Chef("Ahmed", 21, 5000, "Chef");
        Employee Waiter = new Waiter("Mohamed", 20, 4000, "Waiter");
        employees.addAll(Arrays.asList(Chef, Waiter));

        employees.forEach(employee -> {
            employee.introduce();
            employee.work();
            System.out.println("-------------------------");
        });

        //--- Codeforces ---
        //O. Calculator
        /*
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        int pos;
        if (str.contains("+")) {
            pos = str.indexOf("+");
            int x = Integer.parseInt(str.substring(0, pos));
            int y = Integer.parseInt(str.substring(pos + 1));
            System.out.println(x + y);
        } else if (str.contains("-")) {
            pos = str.indexOf("-");
            int y = Integer.parseInt(str.substring(pos + 1));
            int x = Integer.parseInt(str.substring(0, pos));
            System.out.println(x - y);


        } else if (str.contains("*")) {
            pos = str.indexOf("*");
            int y = Integer.parseInt(str.substring(pos + 1));
            int x = Integer.parseInt(str.substring(0, pos));
            System.out.println(x * y);

        } else if (str.contains("/")) {
            pos = str.indexOf("/");
            int y = Integer.parseInt(str.substring(pos + 1));
            int x = Integer.parseInt(str.substring(0, pos));
            System.out.println(x / y);
        }
        */

        //P - First digit !
        /*
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        if (str.charAt(0) % 2 == 0)
            System.out.println("EVEN");
        else System.out.println("ODD");
        */
    }
}
