package All;
/**
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class Pizzeria {


    long timeStart;
    LinkedBlockingDeque<Order> orders = new LinkedBlockingDeque<>();
    private static final long TIME_WORKING = 5000;

    Pizzeria() {
        timeStart = System.currentTimeMillis();
        while (System.currentTimeMillis() - timeStart < TIME_WORKING) ;
        try {
            orders.poll(10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        PizzaVagon pizzaVagon1 = new PizzaVagon();
        Thread delivery1 = new Thread(pizzaVagon1);
        delivery1.start();
        PizzaVagon pizzaVagon2 = new PizzaVagon();
        Thread delivery2 = new Thread(pizzaVagon2);
        delivery2.start();

    }
public void order() {

    }
}

class Order {

    public String pizzaName;
    public long timeDelivery;

    public Order(String pizzaName, long timeDelivery) {
        this.pizzaName = pizzaName;
        this.timeDelivery = timeDelivery;
    }
}

class PizzaVagon extends Thread {
    private static final int DELIVER_TIME_IN_MILLISECONDS = 500;

    private void deliver(String p) {
        System.out.println("Start delivery");
        try {
            Thread.sleep(DELIVER_TIME_IN_MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(pizzaName + "is delivered");
    }

    @Override
    public void run() {
        deliver();
    }


}
**/