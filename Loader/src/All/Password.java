package All;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner na = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = na.nextLine();
        System.out.println("Enter Password");
        String pw = na.nextLine();
        if (pw.length() < 8 || pw.length() > 15 ) {
            do {
                System.out.println("Enter new password from 8 before 15");
                pw = na.nextLine();

            }while (pw.length() > 8 || pw.length()<15 );

        }else{
            System.out.printf("%s, Your new password: %s", name,pw );
        }
    }
}



