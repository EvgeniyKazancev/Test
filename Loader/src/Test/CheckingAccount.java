package Test;

public class CheckingAccount extends Account {


    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    void withdraw(int n) {
        super.withdraw(n);
    }

    @Override
    void put(int n) {
        super.put(n);
        if (n > balance) balance -= n;
    }

    @Override
    int checkBalance() {
        return super.checkBalance();
    }
    protected int getDebt() {
        if (balance < 0) {
            return balance;
        }else return 0;
    }
}
