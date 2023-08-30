package thread;

import java.util.concurrent.*;

class MyCall implements Callable {
    @Override
    public Object call() throws InterruptedException {
        String mystr = "this is my string";
        Thread.sleep(10000);
        return mystr;
    }
}

public class CallableExp {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        Callable call = new MyCall();
        FutureTask task = new FutureTask(call);
        Thread t = new Thread(task);
        t.start();
        while(!task.isDone()){
            System.out.println("task is procesing");
            Thread.sleep(1000);
        }
        System.out.println(task.get());
    }
}
