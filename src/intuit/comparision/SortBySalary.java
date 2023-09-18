package intuit.comparision;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        //return o1.getName().compareTo(o2.getName());
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}
