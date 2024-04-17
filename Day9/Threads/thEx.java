package Day9.Threads;

public class thEx {
    public static void main(String[] args) {
        Thread th1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 15; i++) {
                    System.out.println(i);
                }
            }
        };
        Thread th2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 15; i++) {
                    System.out.println(i * -1);
                }
            }
        };
        th1.start();
        th2.start();
    }
}
