public class Main {
    public static void main(String[] args) {
        int value = add ( 3, 4);
        int result = add(value, 10);

        System.out.println(result);
    }

    private static int add(int x, int y){
        int result = x + y;
        return x + y;

    }
}
