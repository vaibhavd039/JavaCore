package thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Resource {
    Queue<Integer> consumptionQueue;
    int size;

    Resource(int size) {
        this.size = size;
        consumptionQueue = new LinkedList<>();
    }

    public boolean isEmpty() {
        return consumptionQueue.isEmpty();
    }

    public boolean isFull() {
        return consumptionQueue.size() == size;
    }

    public void produce(int data) {
        this.consumptionQueue.add(data);
    }

    public int consume() {
        return this.consumptionQueue.poll();
    }
}

class Producer implements Runnable {
    Resource resource;

    Producer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (resource) {

                if (resource.isFull()) {
                    try {
                        resource.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    System.out.println("Producing Result");
                    resource.produce(new Random(100).nextInt());
                    System.out.println("Produced Result");
                    resource.notify();
                }
            }
        }
    }
}


class Consumer implements Runnable {
    Resource resource;

    Consumer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (resource) {
                if (resource.isEmpty()) {
                    try {
                        resource.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    System.out.println("Consuming Result");
                    System.out.println(resource.consume());
                    System.out.println("Consumed Result");
                    resource.notify();
                }
            }
        }
    }
}


public class ProducerConsumer {
    public static void main(String[] args) {
        Resource resource = new Resource(10);
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(producer);
        executorService.submit(consumer);
    }
}
