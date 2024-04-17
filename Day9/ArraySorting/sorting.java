package Day9.ArraySorting;

//import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] a = {1, 5, 2, 10, -4, -2, 6, -9};

        //Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i : a) {
            System.out.print(i+ " ");
        }
    }
}