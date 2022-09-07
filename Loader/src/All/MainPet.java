package All;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainPet {
    public static void main(String[] args) {


        List<Pet> petList = new ArrayList<>();
        petList.add(new Pet("Cat", "Vasay", 2.5));
        petList.add(new Pet("Dog", "Harik", 11.2));
        petList.add(new Pet("Parrot", "Keha", 0.5));
        petList.add(new Pet("Cat", "Rigik", 3.5));
        petList.add(new Pet("Dog", "Jesika", 3.1));
        petList.add(new Pet("Turtle", "Leonardo", 0.3));
        petList.add(new Pet("Cat", "Bagira", 2.8));
        petList.add(new Pet("Dog", "Sheriff", 15.2));
        petList.add(new Pet("Cat", "Kohmarik", 1.9));
        petList.add(new Pet("Dog", "Jeki", 9.2));
        petList.add(new Pet("Parrot", "Roma", 1.1));
        petList.add(new Pet("Cat", "Leha", 2.0));

        Set<Pet> petSet = new TreeSet<>(petList);

        System.out.println(petSet);

    }
}
