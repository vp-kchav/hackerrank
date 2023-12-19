package job.stream;

public class Person {
    public Person(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    String name;
    int age;

    int salary;

    public void message() {
        System.out.println("helle world!!!");
    }

    @Override
    public String toString() {
        return name + " : " + age +" : " + salary;
    }

}
