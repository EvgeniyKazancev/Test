package All;
import java.util.LinkedList;
import java.util.List;

public class STWExample {
    public static void main(String[] args) {
        // поток, временно выделяющий и освобождающий ~100 Mb памяти
        Thread t1 = new Thread(() -> {
            while (true) {
                List<byte[]> bytes = new LinkedList<>();
                for (int i = 0; i < 100; i++) {
                    bytes.add(new byte[1024 * 1024]);
                    sleep(10);
                }
            }
        });

        // поток, распечатывающий время, прошедшее
        // за время секундной паузы
        Thread t2 = new Thread(() -> {
            while (true) {
                // сохраним текущее время в миллисекундах
                long start = System.currentTimeMillis();
                // приостановим поток на секунду
                sleep(1000);
                // распечатаем количество миллисекунд, прошедших
                // с момента предыдущего сохранения времени
                System.out.println(System.currentTimeMillis() - start);
            }
        });

        t1.start();
        t2.start();
    }


    // метод-обёртка, игнорирующий возможный эксепшн
    // никогда не делайте так в реальных продакшн-приложениях ;)
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ignored) {
        }
    }
}
