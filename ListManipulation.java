/*Task 2: List interface
Implement a method that takes a List as an argument and removes every second element from the list, then prints the resulting list. */

import java.util.ArrayList;
import java.util.List;

public class ListManipulation {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.stream().skip(1).forEach(System.out::println);
    }
        
}
