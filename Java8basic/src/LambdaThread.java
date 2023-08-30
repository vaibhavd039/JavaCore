public class LambdaThread {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };

        Runnable r2 = ()->{
          System.out.println(Thread.currentThread().getName());
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
