package Wallet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bank {
    Cbn cbn = new Cbn();
    List<Account> accounts = new ArrayList<Account>();
    private int id;
    private String name;


    public Bank(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Bank() {

    }

    public static String generateNubanSerialNumber() {
        Random rand = new Random();
        String nubanSerialNumber = Integer.toString(rand.nextInt(1_000_000_000));
        return nubanSerialNumber;
    }

    public Account createAccount(String firstName, String lastName, String pin) {

        String accountNumber = getAccountNumber();
        long accountNumberInt = Long.parseLong(accountNumber);
        String name = firstName + " " + lastName;
        Account newAccount = new Account(name, pin, accountNumberInt);
        accounts.add(newAccount);
        return newAccount;
    }

    private static String getAccountNumber() {
        int sum = getSum();
        int modulus = sum % 10;
        int checkDigit = (10 - modulus) % 10;
        String checkDigitString = "" + checkDigit;
        String accountNumber = generateNubanSerialNumber() + checkDigitString;
        return accountNumber;
    }

    private static int getSum() {
        String threeDigitCode= "070";
        String nubanCode = threeDigitCode + generateNubanSerialNumber();
        int sum = 0;
        int[] checkers = {3,7,3,3,7,3,3, 7, 3, 3, 7, 3};
        for(int i = 0; i < nubanCode.length(); i++) {
            sum += Character.getNumericValue(nubanCode.charAt(i)) * checkers[i];
        }
        return sum;
    }

    public int getBankId() {
        return id;
    }

    public String getBankName(){
        return name;
    }


    public void deposit(long accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public double getBalance(long accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        return account.getBalance(pin);
    }

    public void withdraw(long accountNumber, double amount, String pin) {
        Account account =  findAccount(accountNumber);
        validatePin(pin, account);
        account.withdraw(amount, pin);
    }

    public void transfer(long senderAccount, long recipientAccount, double amount, String pin) {
        Account sender = findAccount(senderAccount);
        Account recipient = findAccount(recipientAccount);
        validatePin(pin, sender);
        recipient.deposit(amount);
        sender.withdraw(amount, pin);
    }


    public Account findAccount(long accountNumber){
        for(Account account : accounts) {
            if(account.getNumber() == accountNumber) {
                return account;
            }
        }
        throw new IllegalArgumentException(accountNumber + " is not a valid account number");
    }


    private void validatePin(String pin, Account account) {
        if(!pin.equals(account.getPin())) throw new IllegalArgumentException("Invalid credentials");
    }


}