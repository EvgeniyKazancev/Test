package Test;

public class Deposit extends Account {
    private int period;
    private double percent;

  /**  public Deposit(int balance) {
        super(balance);
    }

   @Override
    void withdraw(int n) {
        super.withdraw(n);
    }

    @Override
    void put(int n) {
        super.put(n);
    }

    @Override
    int checkBalance() {
        return super.checkBalance();
    }**/

    public Deposit(int balance, int period, double percent) {
        super(balance);
        this.period = period;
        this.percent = percent;
    }

    double withdraw() {
        if (period <= 0) {
         double res = Double.parseDouble(String.valueOf(balance * (100 + percent))) / 100;
         balance = 0;
         return res;
        }
        return 0;
    }

    int waitDays(int n) {
        n = period;
        return period;
    }

    boolean isPeriodExpired() {
        if (period < 0) {
            return true;
        } else return false;

    }
}