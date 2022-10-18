package Game;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IIOException {
        System.out.println("Enter name:");
        Scanner scanner = new Scanner(System.in);
        Hero hero = new Hero(scanner.nextLine(), 100, 8, 10, 10, 12);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = null;
        try {
            x = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
            e.printStackTrace();
        }
        System.out.println("Where do you want to go :");
        System.out.println("1.In the  city ");
        System.out.println("2.In to battle ");
        System.out.println("3.Exit");
        //    int x = Integer.parseInt(scanner.nextLine());
        switch (x) {
            case "1":
                String y = null;
                try {
                    y = reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Welcome to the city!");
                System.out.println("1.Healer ");
                System.out.println("2.Blacksmith ");
                switch (y) {
                    case "1":
                        new Healer();
                        sellPotion();
                        //  if (y == "1") {
                        break;
                    case "2":

                }
            case "2":
                new Battle();
                randomMonster();
                break;
            case "3":
                System.exit(1);
        }

    }

    private static boolean sellPotion(Hero buyer, Healer seller, Merchant merchant) {

        seller.sell(Merchant.Goods.POTION);
        int treatment = buyer.getHp() + 10;
        if (buyer.getGold() <= 10) {
            System.out.println("You don't have enough gold");
            return false;
        } else {
            System.out.println("To your hp + \n" + treatment + "Your hp =" + buyer.getHp());
        }
        return true;
    }


    private static Сharacter randomMonster() {
        int random = (int) (Math.random() * 10);
        if (random % 2 == 0) {
            return new Skelet("Skelet", 100, 30, 12, 4, 5);

        } else return new Goblin("Goblin", 100, 50, 10, 1, 3);
    }

    private static boolean sellWeapon(Hero buyer, Blacksmith seller, Merchant merchant) {

    }

}