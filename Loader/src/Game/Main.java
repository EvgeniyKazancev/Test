package Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter name:");
        Scanner scanner = new Scanner(System.in);

        Hero hero = new Hero(scanner.nextLine(), 100, 8, 10, 10, 12);

while (true) {
    System.out.println("Where do you want to go :");
    System.out.println("1.In the  healer ");
    System.out.println("2.In to battle ");
    System.out.println("3.Exit");
String i = scanner.nextLine();
        switch (i) {
            case "1":
                Healer healer = new Healer();
                sellPotion(hero, healer);
                break;
            case "2":

              Battle b = new Battle();
              b.fight(hero,randomMonster());

                break;
            case "3":
                System.exit(1);
        }
        }

    }

    private static void sellPotion(Hero buyer, Healer seller) {

        if (buyer.getGold() < 10) {
            System.out.println("You don't have enough gold");
        } else if (Healer.getPotionCounter() < 1) {
            System.out.println("You don't have enough potion");

    } else  {

            seller.sell(Merchant.Goods.POTION);

            buyer.setGold(buyer.getGold() - 10);
            buyer.setHp(buyer.getHp() + 10);
            System.out.println("Your hp =" + buyer.getHp() + " Your gold = " + buyer.getGold());
        }

    }


    private static Character randomMonster() {
        int random = (int) (Math.random() * 10);
        if (random % 2 == 0) {
            return new Skelet("Skelet", 100, 30, 12, 4, 5);

        } else return new Goblin("Goblin", 100, 50, 10, 1, 3);
    }


}


