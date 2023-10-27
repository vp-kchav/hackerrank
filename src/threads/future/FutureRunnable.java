package threads.future;

import threads.MyRunnable;

public class FutureRunnable implements Runnable {
    private final long waitTime;

    public FutureRunnable(int timeInMillis) {
        this.waitTime = timeInMillis;
    }

    @Override
    public void run() {
        try {
            // sleep for user given millisecond
            // before checking again
            Thread.sleep(waitTime);
            // return current thread name
            System.out.println(Thread
                    .currentThread()
                    .getName());
        } catch (InterruptedException ex) {
        }
    }
}
