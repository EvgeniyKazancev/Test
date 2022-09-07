package All;

import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int randInt;
        randInt = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
       while (true){
           System.out.println("Enter number : ");
           int a = scanner.nextInt();
           if (a == randInt){
               System.out.println("Bingo");
               break;
           } else if ( a > randInt){
               System.out.println("Number <. ");

           }else if ( a < randInt){
               System.out.println(" Number >. ");
           }


          }




    }
}
