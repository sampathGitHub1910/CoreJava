package Arrays;

public class arrays {
    public static void main(String[] args) {
        String[] arr = new String[4]; // length of the Array, it is fixed

        arr[0] = "Aaryan";
        arr[1] = "Arush";
        arr[2] = "Lakshya";
        arr[3] = "Rohit";

        // arr.length = 4, range (0 - 3)
        System.out.println("Previous: ");
        for (String str : arr) {
            System.out.print(str + ", ");
        }
        System.out.println("\nNew: ");
        String temp = arr[0]; //swapping
        arr[0] = arr[1];
        arr[1] = temp;

        for (String str : arr) {
            System.out.print(str + ", ");
        }
        System.out.println(arr[arr.length - 1]);
    }
}
