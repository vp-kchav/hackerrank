package job.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStream {

    class Simple {
        void message(){
            System.out.println("heelo me");
        }
    }
    public static void main(String arg[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Person person1 = new Person("person1", 20);
        Person person2 = new Person("person2", 21);
        Person person3 = new Person("person3", 20);
        Person person4 = new Person("person4", 25);
        Person person5 = new Person("person5", 24);
        Person person6 = new Person("person6", 24);
        Person person7 = new Person("person7", 25);
        Person person8 = new Person("person8", 25);
        Class aClass = Class.forName("Simple");
        Simple p = (Simple) aClass.newInstance();
        p.message();
        List<Person> personList = new ArrayList<>();
        personList.add(person1);personList.add(person2);personList.add(person3);personList.add(person4);
        personList.add(person5);personList.add(person6);personList.add(person7);personList.add(person8);
        Map<Integer, List<Person>> groupByAge = personList.stream().collect(
                //Collectors.groupingBy(p -> p.getAge())
                Collectors.groupingBy(Person::getAge)
        );
        System.out.println(groupByAge);

        String x = "xyz";
        //x.toUpperCase();
        String y = x.replace('Y', 'y');
        y = y + "abc";
        System.out.println(y);

    }

}
