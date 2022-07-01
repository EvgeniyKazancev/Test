/** import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double operand1 = scanner.nextDouble();
        double operand2 = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        char C = 'c';
        double result = 0;

        do {
            if (C != 'c')
                System.out.println("Enter operand1 " + operand1);
            System.out.println("Enter operand1 " + operator);
            System.out.println("Enter operand1 " + operand2);
            result = calculator(operand1, operand2, operator);
        } else {
            operator = C;
            System.out.println(operand1 + " " + operator + " " + operand2 + "=" + result);
            while (C != 's');

        }

    }




    public static double calculator(double operand1, double operand2, char operator ){
        return switch (operator){
            case '+' -> operand1 + operand2;
            case '-' -> operand1- operand2;
            case '*' -> operand1 * operand2;
            case '/' -> operand1 / operand2;
            default -> {
                System.out.println("Error")
                        yield 0;
            }
        }
}

**/

