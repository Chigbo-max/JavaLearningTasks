package AccountTask;

public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {

        validateWithdrawal(amount);
    }

    private void validateWithdrawal(int amount) {
        if(this.balance == 0 && amount < this.balance){
            this.balance = balance;
        }
        else if (amount > this.balance) {
            this.balance =  balance;
        }
        else this.balance -= amount;
    }


}


