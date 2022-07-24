public class Loader3 {
    private static int source = 30;
    private static int receiver = 0;

    public static void main(String[] args) {
        while (source > 0) {
            source--;
            if (source % 10 != 0) {
                receiver++;
            }
            System.out.println(source);
            System.out.println(receiver);
        }

    }
}
 class Loader4 {
    private static int source = 30;
    private static int receiver = 0;

    public static void main(String[] args) {
        while (source > 0) {
            source--;
            if (source % 10 != 0) {
                receiver++;
            }
            System.out.println(source);
            System.out.println(receiver);
        }

    }
}
