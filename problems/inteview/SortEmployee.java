package inteview;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployee {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "reuben", 14000));
        employees.add(new Employee(2, "Anna", 10000));
        employees.add(new Employee(3, "Karthik", 5000));
        employees.add(new Employee(4, "John", 4000));
        employees.add(new Employee(4, "Kohn", 4000));

//        employees = employees.stream()
//                .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
//                .collect(Collectors.toList());

        employees = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary)
                        .thenComparing(Comparator.comparing(Employee::getName).reversed()))
                .collect(Collectors.toList());

        System.out.println(employees);
    }
}
