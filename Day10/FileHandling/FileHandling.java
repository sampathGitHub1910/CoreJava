package Day10.FileHandling;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        File f = new File("Day10/FileHandling/names.txt");
        System.out.println(f.getAbsolutePath());
        try {
            //f.createNewFile(); // create
            //f.deleteOnExit(); // delete
            FileWriter fw = new FileWriter(f);
            fw.append("Aaryan is a Trainer");
            
            fw.close();
        } catch (IOException e) {
            System.out.println("File not found");
            // e.printStackTrace();
        }
    }
}
