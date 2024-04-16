package Day8;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/*Task 3: Set interface
Write a program that reads words from a String variable into a Set and prints out the number of unique words, demonstrating the unique */

public class UniqueWords {
    public static void main(String[] args) {
        String text = "Hello world hello java world java programming";
        Set<String> uniqueWords = Arrays.stream(text.toLowerCase().split(" ")).collect(Collectors.toSet());

        uniqueWords.forEach(System.out::println);

        System.out.println("Number of unique words are : "+uniqueWords.size());
    }
}
