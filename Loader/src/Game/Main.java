package Game;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter name:");
        Scanner scanner = new Scanner(System.in);


        Hero hero = new Hero()
        Skelet skelet = new Skelet();
        Goblin goblin = new Goblin();
        System.out.println("Where do you want to go : \n" +
                           "1.In the  city  \n" +
                "2.In to the forest \n" +
                "3.In to battle \n" +
                "4.Exit");
       int x = Integer.parseInt(scanner.nextLine());
     switch (x){
         case '1' :
             System.out.println("Welcome to the city!");
     }

    }
}
