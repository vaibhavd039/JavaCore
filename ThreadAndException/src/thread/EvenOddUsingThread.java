package thread;

class Printer {
    int num = 1;
    int max = 100;

    public void printEven() throws InterruptedException {
        synchronized (this) {
            while (num < max) {
                if (num % 2 != 0) {
                    wait();
                } else {
                    System.out.println("Even Thread: " + num);
                    num++;
                    notify();
                }
            }
        }
    }

    public void printOdd() throws InterruptedException {
        synchronized (this) {
            while (num < max) {
                if (num % 2 == 0) {
                    wait();
                } else {
                    System.out.println("Odd Thread: " + num);
                    num++;
                    notify();
                }
            }
        }
    }
}

public class EvenOddUsingThread {
    public static void main(String[] argds) {
        Printer p = new Printer();
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                try {
                    p.printEven();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread1 = new Thread(t1);

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                try {
                    p.printOdd();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ;
            }
        };
        Thread thread2 = new Thread(r2);

        thread1.start();
        thread2.start();

    }

}
