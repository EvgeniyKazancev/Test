import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main5 {
    private static final String TOYOTA ="Toyota";
    private static final String BMW ="BMW";
    private static final String KIA ="KIA";

    public static void main(String[] args) {
        Car0 car1 = new Car0(TOYOTA, "Camry", false);
        Car0 car2 = new Car0(KIA, "Rio", false);
        Car0 car3 = new Car0(BMW, "X5", false);
        Car0 car4 = new Car0(BMW, "X3", false);
        Car0 car5 = new Car0(BMW, "X6", false);
        Car0 car6 = new Car0(TOYOTA, "Raw 4", true);
        Car0 car7 = new Car0(KIA, "Ceed", false);
        Car0 car8 = new Car0(TOYOTA, "Yaris", false);
        Car0 car9 = new Car0(BMW, "320i", false);
        Car0 car10 = new Car0(TOYOTA, "Corolla", false);

        List<Car0> car0List = new ArrayList<>();
        car0List.add(car1);
        car0List.add(car2);
        car0List.add(car3);
        car0List.add(car4);
        car0List.add(car5);
        car0List.add(car6);
        car0List.add(car7);
        car0List.add(car8);
        car0List.add(car9);
        car0List.add(car10);
       /** for(Car0 car0 : car0List){
            if (car0.getBrand().equals(KIA)){
                car0List.remove(car0);
            }else if (car0.getBrand().equals(TOYOTA)){
                car0.setOnSale(true);
            }
        }**/
        Iterator<Car0> iterator = car0List.iterator();
        while (iterator.hasNext()){
            Car0 car0 = iterator.next();
            if (car0.getBrand().equals(KIA)){
                iterator.remove();
            }else if (car0.getBrand().equals(TOYOTA)){
                car0.setOnSale(true);
            }

        }
         for (Car0 car0 : car0List){
             System.out.println(car0);
         }
    }
}
