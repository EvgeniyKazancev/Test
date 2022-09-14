package All;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class TwoThread {

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Random random = new Random();
                    while (true) {
                        queue.add(random.nextInt(100));
                        Thread.sleep(100);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Random random2 = new Random();
                    int x = 0;
                    Thread.sleep(100);
                    while (true) {
                        x = random2.nextInt(10);
                        if (x == 5) {
                            System.out.println("First threat: " + queue.take());
                            System.out.println("Second threat: " + x);
                            System.out.println("Queue size: " + queue.size() + "\n");
                        }

                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}

