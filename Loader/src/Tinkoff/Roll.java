package Tinkoff;

public class Roll {
    public int dividingTheRoll(int n) {
        int cuts = 0;
        if (n <= 1) {
            cuts = 0;
        }else if(n % 2 == 0) {
            cuts = n / 2;
        }else
            cuts = n / 2+1;
        return cuts;
    }
}