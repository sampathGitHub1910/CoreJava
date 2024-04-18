package Day10.Tasks.ImpComarator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Alice", 25));
        list.add(new Person("Bob", 30));
        list.add(new Person("Charlie", 20));

        Comparator<Person> ageComparator = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());

        list.sort(ageComparator);

        list.forEach(e ->{
            System.out.println("Name : " + e.getName() + " Age : " + e.getAge());
        });
    }
}