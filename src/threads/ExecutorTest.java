package threads;

import org.omg.SendingContext.RunTime;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorTest {
    public static void main(String arg[]) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors());


        for(int i = 0; i<5; i++) {
            //executorService.execute(Runnable);
            Future<String> me = executorService.submit(new MyRunnable(i));
            System.out.println(me.get() + me.isDone());
        }
        executorService.shutdown();
        System.gc();
    }

}
