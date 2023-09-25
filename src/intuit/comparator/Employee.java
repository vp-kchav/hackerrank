package intuit.comparator;

public class Employee {
    private int regno;
    private String name;
    private int salary;
    //constructor of Employee class
    public Employee(int regno, String name, int salary)
    {
        this.name = name;
        this.regno = regno;
        this.salary = salary;
    }
    public int getRegno()
    {
        return regno;
    }
    public void setRegno(int Regno)
    {
        this.regno = regno;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        return getSalary() == ((Employee) obj).getSalary();
    }
    @Override
    public String toString() {
        return this.getRegno() + " " + this.getName() + " " + this.getSalary() ;
    }

}
