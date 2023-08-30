package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Hell here");
    }
}

public class ExecutorServiceIMpl {
    public static void main(String[] args) {
        Runnable thread = new MyThread();
        Thread myobj = new Thread(thread);
        ExecutorService executor = Executors.newScheduledThreadPool(10);
        executor.submit(myobj);
        executor.submit(myobj);
        executor.submit(myobj);
        executor.submit(myobj);
        executor.submit(myobj);
        executor.submit(myobj);
        executor.shutdown();
    }
}
