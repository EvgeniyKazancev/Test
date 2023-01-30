package Tinkoff;

public class Tariff {
    public int paymentCalculation(int a, int b, int c, int d) {
        if (b > d) {
            return a;
        } else {
            return a + c * (d - b);
        }
    }
}