package All;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class Pizzeria {
   private String pizzaName;
    long timeDelivery;
    void order(String pizzaName) {
        this.pizzaName = pizzaName;

    }

    long timeStart;
   LinkedBlockingDeque <String> order = new  LinkedBlockingDeque<>();

    Pizzeria() {
        timeStart = System.currentTimeMillis();
        new VagonPizza().start();
        new VagonPizza().start();
        timeDelivery = System.currentTimeMillis();
    }


    class VagonPizza extends Thread {
        @Override
        public void run() {

            while (System.currentTimeMillis() - timeStart < 5000) {
                try {
                 order =  order.poll(10, TimeUnit.MILLISECONDS );

                }catch (InterruptedException e){
                    break;
                }
                if(timeStart - timeDelivery < 750){
                    System.out.println(order.pizzaName + "is delivery");
                }else
                    System.out.println(order.pizzaName + "is NOT delivery ");
            }
        }
    }
}