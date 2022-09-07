package All;

public class Svetofor {
    public static void main(String[] args) {
        char svetofor = 'r';

        switch (svetofor){
            case 'r':
                System.out.println("Stop");
                break;
            case 'y':
                System.out.println("To wait");
                break;
            case 'g':
                System.out.println("GO");
                break;
            default:
                System.out.println("Net takogo signala");
        }
    }
}
