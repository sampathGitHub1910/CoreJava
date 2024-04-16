package Day8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*Task 4: Map interface
Create a Java class that uses a Map to store the frequency of each word that appears in a given string. */

public class wordFrequency {

    public static void main(String[] args) {
        String text = "Hello world hello java world java programming";
        Map<String, Integer> res = Arrays.stream(text.toLowerCase().split(" ")).collect(Collectors.toMap(w -> w, c -> 1, Integer::sum, HashMap::new));

        res.forEach((w, c) -> System.out.println(w + " : " + c));
    }
    
}
