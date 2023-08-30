package thread;


class MyMy extends Thread {

    volatile int counter = 50;
    volatile int init = 0;

    public void run() {
        init = 0;
        try {
            dumdumPrint();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void dumdumPrint() throws InterruptedException {
        synchronized (this) {
            while (init < counter) {
                System.out.println(Thread.currentThread().getName() + " " + init);
                init++;
                Thread.sleep(100);
            }
        }
    }
}

public class SleepTest {
    public static void main(String
                                    [] args) {
        Thread t1 = new MyMy();
        t1.setName("One");
        t1.start();

        Thread t2 = new MyMy();
        t2.setName("Two");
        t2.start();

        Thread t3 = new MyMy();
        t3.setName("Three");
        t3.start();
    }
}
