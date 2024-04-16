package Exception;

public class ex {
    public static void main(String[] args) {
        try {
            int res =3/0;
            //int[] arr = {1,2,3};
            //System.out.println(arr[4]);
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("End of the program.");
    }
}
