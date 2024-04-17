package Day9.comparator;


import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

public class Compare1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        //list.add(new Student("Sampath", 1, 55, 45, 60));
        //list.add(new Student("Ram", 0, 58, 59, 55));

        Collections.sort(list, (s1, s2) -> {
            if(s1.rollno < s2.rollno) {
                return -1; // swap
            }
            return 0;
        });

        Student maxStudent = list.stream().max((s1, s2) -> {
            if(s1.getAverage() < s2.getAverage()) {
                return -1; // swap
            }
            return 0;
        }).get();

        //Student maxStudent = list.stream()
        //    .max(Comparator.comparingDouble(Student::getAverage))
        //   .orElse(null);

        //if (maxStudent != null) {
        //    System.out.println("Highest marks Student is : " + maxStudent.name + " with Average : " + maxStudent.getAverage());
        //} else {
        //    System.out.println("No students found.");
        //}

        System.out.println("Highest marks Student is : " + maxStudent.name + " with Average : " + maxStudent.getAverage());
        list.forEach(System.out::println);
    }
}
