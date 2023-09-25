package intuit.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String []arg) {
        Employee emp1 = new Employee(1,"Kimtey", 200);
        Employee emp2 = new Employee(2,"Kimtey2", 150);
        Employee emp3 = new Employee(3,"Kimtey3", 300);
        Employee emp4 = new Employee(4,"Kimtey4", 500);
        List<Employee> emps = Arrays.asList(emp1, emp2, emp3, emp4);
        for(Employee emp : emps ) {
            System.out.println(emp.toString());
        }

        Collections.sort(emps, new SortBySalary());

        System.out.println("after sort");
        for(Employee emp : emps ) {
            System.out.println(emp.toString());
        }
    }
}
