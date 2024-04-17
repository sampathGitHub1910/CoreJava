package Day9.Task6;

public class ThreadEx{
    public static void main(String[] args) {
        Thread th1 = new Thread(){
            @Override
            public void run(){
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Thread 1 : " + i);
                    try {
                        Thread.sleep(1000); // Sleep for 1 second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread th2 = new Thread(){
            @Override
            public void run(){
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Thread 2 : " + i);
                    try {
                        Thread.sleep(1000); // Sleep for 1 second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
