package Day10.Tasks.WordFrequencyCounter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String inputFile = "Day10/Tasks/WordFrequencyCounter/input.txt";
        String outputFile = "Day10/Tasks/WordFrequencyCounter/output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            Map<String, Integer> wordFrequencyMap = new HashMap<>();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" "); // Split by whitespace

                for (String word : words) {
                    word = word.toLowerCase(); // Convert to lowercase for case-insensitive counting
                    wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                }
            }

            // Write word frequencies to the output file
            //for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
             //   writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            //}

            wordFrequencyMap.forEach((word, count) -> {
                try {
                    writer.write(word + ": " + count + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });


            System.out.println("Word frequencies have been written to " + outputFile);

        } catch (IOException e) {
            System.err.println("Error reading or writing files: " + e.getMessage());
        }
    }
}
