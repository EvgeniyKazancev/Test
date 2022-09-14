package Codeword;



public class Clock {
    public static void main(String[] args) {
        System.out.println();
    }
    public static int Past(int h, int m, int s) {
      m += h * 60;
      s += m * 60;
        return s * 1000;
    }

}
