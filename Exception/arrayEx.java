package Exception;

public class arrayEx {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        
        for(int i=0;i<=arr.length;i++){
            try {
                System.out.println(arr[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index doesn't exit : " + i);
            }
        }
    }
}
