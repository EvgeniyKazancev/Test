package All;

public class Type extends Thread {
    static Object lock = new Object();
    String massage;
    public Type(String massage) {
        this.massage = massage;
    }
    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < massage.length(); i++) {
                System.out.println(massage.charAt(i));
            }
        }
        try {
            Thread.sleep(500);

        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
