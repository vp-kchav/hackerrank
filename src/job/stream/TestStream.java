package job.stream;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        Person person1 = new Person("person1", 20, 200);
        Person person2 = new Person("person2", 21, 300);
        Person person3 = new Person("person3", 20, 500);
        Person person4 = new Person("person4", 25, 500);
        Person person5 = new Person("person5", 24, 400);
        Person person6 = new Person("person6", 24, 600);
        Person person7 = new Person("person7", 25, 800);
        Person person8 = new Person("person8", 25, 900);
//        Class aClass = Class.forName("Simple");
//        Simple p = (Simple) aClass.newInstance();
//        p.message();
        List<Person> personList = new ArrayList<>();
        personList.add(person1);personList.add(person2);personList.add(person3);personList.add(person4);
        personList.add(person5);personList.add(person6);personList.add(person7);personList.add(person8);
        Map<Integer, List<Person>> groupByAge = personList.stream().collect(
                //Collectors.groupingBy(p -> p.getAge())
                Collectors.groupingBy(Person::getAge));
        List<Person> result = new ArrayList<>();
        for(Map.Entry<Integer, List<Person>> entry : groupByAge.entrySet()) {
                   result.addAll(entry.getValue().stream().sorted(
                            (a,b) -> Integer.compare(b.salary, a.salary))
                            .limit(2).collect(Collectors.toList()));
        }
        System.out.println(result);

    }

    public static List<String> bigSorting(List<String> unsorted) {
       Collections.sort(unsorted, (a,b) -> {
           int n = a.length(), m = b.length();
           if (n == m) {
               return a.compareTo(b);
           }
           return n - m;
       });
       return unsorted;
    }

}
