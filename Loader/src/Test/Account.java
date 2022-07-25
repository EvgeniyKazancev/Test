package Test;

public class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }
    void withdraw(int n){
        balance -= n;
        if (n > balance) balance = 0;
    }
    void put(int n){
        n +=balance;
    }

    int checkBalance() {
        return balance;
    }

}
