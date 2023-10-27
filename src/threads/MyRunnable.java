package threads;

import java.util.concurrent.Callable;

public class MyRunnable implements Callable<String> {

    private int id;
    public MyRunnable(int i) {
        this.id = i;
    }
    @Override
    public String call() {
        System.out.println("Runnable started id:"+id);
        //System.out.println("Run: "+ Thread.currentThread().getName());
        System.out.println("Runnable ended id:"+id);
        return "Hello";
    }
}
