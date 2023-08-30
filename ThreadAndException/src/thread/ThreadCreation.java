package thread;

import java.util.TreeSet;

public class ThreadCreation {
    public static void main(String[] args) {
        MyTest test = new MyTest();
        test.start();
        Runnable runnable = new Exp();
        Thread t = new Thread(runnable);
        t.start();
    }

}


class MyTest extends Thread {

}

class Exp implements  Runnable{
    public void run(){
        System.out.print("Hell Yeah");
    }
}