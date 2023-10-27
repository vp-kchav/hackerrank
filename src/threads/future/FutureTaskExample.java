package threads.future;

import threads.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class FutureTaskExample {
    public static void main(String[] args) {
        // create two object of MyRunnable class
        // for FutureTask and sleep 1000, 2000
        // millisecond before checking again
        FutureRunnable myrunnableobject1 = new FutureRunnable(1000);
        FutureRunnable myrunnableobject2 = new FutureRunnable(2000);

        FutureTask<String> futureTask1 = new FutureTask<>(myrunnableobject1,
                "FutureTask1 is complete");
        FutureTask<String> futureTask2 = new FutureTask<>(myrunnableobject2,
                "FutureTask2 is complete");

        // create thread pool of 2 size for ExecutorService
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // submit futureTask1 to ExecutorService
        executor.submit(futureTask1);

        // submit futureTask2 to ExecutorService
        executor.submit(futureTask2);

        while (true) {
            try {

                // if both future task complete
                if (futureTask1.isDone() && futureTask2.isDone()) {

                    System.out.println("Both FutureTask Complete");

                    // shut down executor service
                    executor.shutdown();
                    return;
                }

                if (!futureTask1.isDone()) {

                    // wait indefinitely for future
                    // task to complete
                    System.out.println("FutureTask1 output = "
                            + futureTask1.get());
                }

                System.out.println("Waiting for FutureTask2 to complete");

                // Wait if necessary for the computation to complete,
                // and then retrieves its result
                String s = futureTask2.get(250, TimeUnit.MILLISECONDS);

                if (s != null) {
                    System.out.println("FutureTask2 output=" + s);
                }
            }

            catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }
    }
}
