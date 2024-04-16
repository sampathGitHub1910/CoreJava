/*Task 2: List interface
Implement a method that takes a List as an argument and removes every second element from the list, then prints the resulting list. */

import java.util.ArrayList;
import java.util.List;

public class ListManipulation {

    public static List<Integer> removeSecondElement(List<Integer> a){
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < a.size(); i++){
            if(i % 2 == 0){
                res.add(a.get(i));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println("Original List: " + numbers);
        System.out.println("Modified List: " + removeSecondElement(numbers));
    }
}
