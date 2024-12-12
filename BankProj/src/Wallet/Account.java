package Wallet;

public class Account {
    private double balance;
    private String name;
    private String pin;
    private long number;

    public Account(String name, String pin, long number) {
        this.name = name;
        this.pin = pin;
        this.number = number;
        this.balance = balance;
    }

    public long getNumber() {
        return number;
    }

    public void deposit(double amount) {
        validateAmount(amount);
        this.balance += amount;
    }
    public void withdraw(double amount, String pin) {
        validatePin(pin);
        validateAmount(amount);
        validateWithdrawal(amount);
    }
    public double getBalance(String pin) {
        validatePin(pin);
        return this.balance;
    }

    public String getPin(){
        return this.pin;
    }

    public void updatePin(String oldPin,String newPin) {
        if(oldPin.equals(pin)) this.pin = newPin;
        else throw new IllegalArgumentException("Invalid credentials");

    }

    private void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
    }

    private void validateWithdrawal(double amount){
        if (amount > this.balance) {
            throw new IllegalArgumentException("Insufficient funds, balance is" + " " + this.balance);
        }
        else{
            this.balance -= amount;
        }
    }

    private void validatePin(String pin) {
        if(!pin.equals(this.pin)){
            throw new IllegalArgumentException("Incorrect credentials");
        }
    }


}