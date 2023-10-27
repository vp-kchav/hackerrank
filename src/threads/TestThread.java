package threads;

public class TestThread {
    public static void main(String arg[]) throws InterruptedException {
        Thread t2 = new Thread(
                new Runnable() {
                    public void run () {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("T2 here");
                    }
                }
        );
        Thread t1 = new Thread(
                new Runnable() {
                    public void run () {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("T1 here");
                    }
                }
        );

        t2.start(); //Line 11
        t1.start(); //Line 12
//        t2.join();  //Line 13
//        t1.join();  //Line 14
        System.out.println("<Want to print something that was being modified by t2 and t1>");
    }
}
