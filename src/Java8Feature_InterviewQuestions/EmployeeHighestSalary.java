package Java8Feature_InterviewQuestions;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

//Write a Java 8 stream code to group employees by department and get the highest salary per department.
public class EmployeeHighestSalary {
    public static void main(String[] args) {

        List<EmployeeObj> employees = Arrays.asList(
                new EmployeeObj("Ravi", "IT", 50000),
                new EmployeeObj("Kiran", "IT", 90000),
                new EmployeeObj("John", "HR", 60000),
                new EmployeeObj("Meera", "HR", 55000),
                new EmployeeObj("Amit", "Finance", 75000),
                new EmployeeObj("Sara", "Finance", 72000)
        );

        // STEP 1: Group employees by department
        Map<String, List<EmployeeObj>> deptMap = employees.stream()
                .collect(Collectors.groupingBy(x->x.getDepartment()));

        // STEP 2: For each department find the highest salary employee
        Map<String, EmployeeObj> highestSalaryByDept = new HashMap<>();

        for (Entry<String, List<EmployeeObj>> entry : deptMap.entrySet()) {
        	EmployeeObj highest = entry.getValue().stream()
                    .max(Comparator.comparing(EmployeeObj::getSalary))
                    .get();

            highestSalaryByDept.put(entry.getKey(), highest);
        }

        // STEP 3: Print results
        highestSalaryByDept.forEach((dept, emp) ->
                System.out.println(dept + " -> " + emp.getName() + " : " + emp.getSalary()));
    }
}

class EmployeeObj {
    private String name;
    private String department;
    private double salary;

    public EmployeeObj(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
}
