package Y2025M8.D6;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SessionMain {
    public static void run() {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);


        //**** Solution ****
        //Filter even numbers from a list of integers.
        numbers.stream().filter(integer -> integer % 2 == 0)
                .sorted()
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------");

        //Find names starting with a specific letter from a list of strings.
        names.stream().filter(name -> name != null && name.startsWith("A"))
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------");

        //Convert all strings to uppercase using stream.
        names.stream().filter(Objects::nonNull)
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------");

        //Sort a list of integers in descending order using streams.
        numbers.stream().sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------");

        //Remove duplicate elements from a list using distinct().
        numbers.stream().distinct()
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------");

        //🔹 Intermediate Stream Tasks
        //Count the number of strings longer than 5 characters.
        System.out.println(
                names.stream().filter(s -> s != null && s.length() > 5)
                        .count()
        );
        System.out.println("--------------------------------------------------------------------------------------------");

        //Find the first element in a stream that matches a given condition.
        names.stream()
                .filter(s -> s.endsWith("d"))
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------");

        //Check if any number is divisible by 5 in a list.
        System.out.println(
                numbers.stream().anyMatch(integer -> integer % 5 == 0)
        );
        System.out.println("--------------------------------------------------------------------------------------------");

        //Collect elements into a Set instead of a List.
        numbers.stream().collect(Collectors.toSet())
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------");

        //Skip the first 3 elements and return the rest.
        numbers.stream().skip(8)
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------");

        //🔹 Numeric Streams & Reductions
        //Calculate the sum of a list of integers using reduce.
        System.out.println(
                numbers.stream().reduce(0, Integer::sum)
        );
        System.out.println("--------------------------------------------------------------------------------------------");

        //Find the maximum and minimum value in a list.
        numbers.stream().max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
        numbers.stream().min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------");

        //Calculate the average of a list of doubles.
        numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------");

        //Multiply all integers in a list together using reduce.
        System.out.println(
                numbers.stream().reduce(1, (a, b) -> a * b)
        );
        System.out.println("--------------------------------------------------------------------------------------------");

        //Count how many numbers are positive in a list.
        System.out.println(
                numbers.stream().filter(integer -> integer > 0)
                        .count()
        );
        System.out.println("--------------------------------------------------------------------------------------------");

        //🔹 Collectors & Grouping
        List<Student> students = Arrays.asList(
                new Student("Ali", "IT", 85),
                new Student("Mona", "CS", 92),
                new Student("Ahmed", "IT", 60),
                new Student("Sara", "CS", 70),
                new Student("Omar", "IS", 45),
                new Student("Laila", "IS", 78)
        );
        //Group a list of students by their department.
        students.stream().collect(Collectors.groupingBy(student -> student.department))
                .forEach((s, students1) -> {
                    System.out.println(s + ":");
                    students1.forEach(student -> System.out.println("\t" + student.name));
                });
        System.out.println("--------------------------------------------------------------------------------------------");

        //Partition a list of numbers into even and odd using partitioningBy.
        numbers.stream().collect(Collectors.partitioningBy(integer -> integer % 2 == 0))
                .forEach((aBoolean, integers) -> {
                    System.out.println(aBoolean ? "Even: " : "Odd: ");
                    integers.stream().sorted()
                            .forEach(integer -> System.out.println("\t" + integer));
                });
        System.out.println("--------------------------------------------------------------------------------------------");

        //Create a comma-separated string from a list of strings.
        System.out.println(
                names.stream().filter(Objects::nonNull)
                        .collect(Collectors.joining("-"))
        );
        System.out.println("--------------------------------------------------------------------------------------------");

        List<Employee> employees = Arrays.asList(
                new Employee("Ali", 30, "HR", 5000),
                new Employee("Mona", 25, "IT", 7000),
                new Employee("Ahmed", 30, "HR", 5500),
                new Employee("Sara", 27, "IT", 7200),
                new Employee("Omar", 40, "Finance", 8000),
                new Employee("Laila", 35, "Finance", 8200)
        );
        //Group employees by age and count how many per age.
        employees.stream().collect(Collectors.groupingBy(employee -> employee.age))
                .forEach((integer, employees1) -> {
                    System.out.printf("Age -> %d | Count -> %d: \n", integer, employees1.size());
                    employees1.forEach(employee -> System.out.println("\t\t\t\t\t" + employee.name));
                });
        System.out.println("--------------------------------------------------------------------------------------------");

        //Find the average salary per department in a list of employees.
        employees.stream().collect(Collectors.groupingBy(employee -> employee.department))
                .forEach((s, employees1) -> {
                    System.out.print(s + " -> ");
                    employees1.stream().mapToDouble(value -> value.salary)
                            .average()
                            .ifPresent(System.out::println);

                });
        System.out.println("--------------------------------------------------------------------------------------------");

        //🔹 Optional, Map, FlatMap

        List<List<String>> nestedWords = Arrays.asList(
                Arrays.asList("Java", "Stream"),
                Arrays.asList("API", "Lambda"),
                Arrays.asList("FlatMap", "Map")
        );

        //Flatten a list of lists into a single list.
        System.out.println(
                nestedWords.stream().flatMap(Collection::stream).toList()
        );
        System.out.println("--------------------------------------------------------------------------------------------");

        //Extract all unique characters from a list of words.
        System.out.println(
                nestedWords.stream()
                        .flatMap(Collection::stream)
                        .map(s -> s.split(""))
                        .flatMap(Arrays::stream).toList()
                        .stream().distinct()
                        .toList()
        );
        System.out.println("--------------------------------------------------------------------------------------------");

        //Filter a list of Optionals and collect non-empty values.


    }
}
