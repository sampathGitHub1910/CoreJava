public class basic {
    public static void main(String[] args) {
        int a =5;
        long l = 4l;
        float f = 5.5f;
        double d = 3.53543534;
        String s = "Sam";
        char c = 's';
        boolean b = true;
        System.out.println("a : "+a+" "+ l+" "+ f + " "+ d + " " + s + " " + c + " " + b);    
        // Constants --> value that cannot be changed
        final int a1 = 5;
        System.out.println(a1);
        a = 4;
        // a1 = 6; // compile-time error
        System.out.println("Hello ");   
        System.out.println(a);
    }
}

