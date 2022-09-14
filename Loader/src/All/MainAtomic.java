package All;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class MainAtomic {
    private static AtomicIntegerArray integerArray = new AtomicIntegerArray(new int[10]);

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < integerArray.length(); i+=2) {
                    integerArray.addAndGet(i, 5);
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < integerArray.length(); i++) {
                    integerArray.addAndGet(i, 3);
                }
            }
        };

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(integerArray);
    }

}

