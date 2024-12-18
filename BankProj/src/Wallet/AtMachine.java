package Wallet;

import javax.swing.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class AtMachine {

    private static Cbn cbn = new Cbn();

    public static void main(String[] args) {
        registerBanks();
        goToMainMenu();
    }

    public static void registerBanks(){
        cbn.registerBank("Fidelity bank");
        cbn.registerBank("Correct Bank");
        cbn.registerBank("Sharp Sharp Bank");

    }

    public static void goToMainMenu() {

        String mainMenu = """
                1 -> Create account.
                2 -> Deposit money.
                3 -> Withdraw money.
                4 -> Transfer money.
                5 -> Transfer to other banks.
                6 -> Check account balance.
                7 -> Exit app.
                """;

        display("Enter a number: ");
        char userInput = input(mainMenu).charAt(0);

        getUserInput(userInput);

    }



    public static String input(String prompt) {
        display(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }


    public static void createAccount() {
        try {
            int bankId = selectBank();
            Bank foundBank = cbn.findBank(bankId);

            String firstName = input("Enter first name: ");
            String lastName = input("Enter last name: ");
            String password = input("Enter password: ");

            var account = foundBank.createAccount(firstName, lastName, password);
            display("Account created");
            display(String.format("Your account number is %d", account.getNumber()));
       }
       catch (Exception e) {
            display("Invalid credentials");
        }
        finally {
            goToMainMenu();
        }
    }

    public static void deposit() {

        int bankId = selectBank();
        Bank foundBank = cbn.findBank(bankId);

        double amount = collectDoubleInput("Enter amount");
        long accountNumber = collectLongInput("Enter account number: ");
        try {
            foundBank.deposit(accountNumber, amount);
            display("Deposited " + amount + " to account number " + accountNumber);
        }
        catch (IllegalArgumentException e) {
            display("Invalid credentials");
        }
        finally {
            goToMainMenu();
        }
    }


    public static void withdraw() {

        int bankId = selectBank();
        Bank foundBank = cbn.findBank(bankId);

        long accountNumber = collectLongInput("Enter account number");
        double amount = collectDoubleInput("Enter amount to withdraw");
        try {
            String pin = input("Enter pin");
            foundBank.withdraw(accountNumber, amount, pin);
            display("Withdrawn " + amount + " from account number " + accountNumber);
        }
        catch(IllegalArgumentException e) {
            display("Invalid credentials");
        }
        finally {
            goToMainMenu();
        }
    }


    public static void transfer() {

        int bankId = selectBank();
        Bank foundBank = cbn.findBank(bankId);

        long sender = collectLongInput("Enter sender number");
        long receiver = collectLongInput("Enter receiver number");
        double amount = collectDoubleInput("Enter amount to transfer");
        try {
            String pin = input("Enter pin");
            foundBank.transfer(sender, receiver, amount, pin);
            display("Transfer successful");
            display(String.format("balance is %.2f", foundBank.findAccount(sender).getBalance(pin)));
        }
        catch (IllegalArgumentException e) {
            display("Invalid credentials");
        }
        finally {
            goToMainMenu();
        }
    }


    public static void checkAccountBalance() {
        try {
            int bankId = selectBank();
            Bank foundBank = cbn.findBank(bankId);

            long accountNumber = collectLongInput("Enter account number");
            String pin = input("Enter pin");
            display(String.format("balance is %.2f", foundBank.getBalance(accountNumber, pin)));
        } catch(IllegalArgumentException e) {
            display("invalid credentials");
        }
        finally {
            goToMainMenu();
        }
    }


    public static void exitApp() {
        display("Thank you for banking with us");
        exit(0);
    }

    public static void transferToOtherBank() {

            display("Enter sender-bank number");
            int sendingBankId = selectBank();
            Bank sendingBank = cbn.findBank(sendingBankId);

            display("Enter the recipient-bank number");
            int receivingBankId = selectBank();
            Bank receivingBank = cbn.findBank(receivingBankId);

            long senderAccountNumber = collectLongInput("Enter sender account number");
            long receiverNumber = collectLongInput("Enter account number of recipient");

            double amount = collectDoubleInput("Enter amount to transfer");
        try {
            String pin = input("Enter pin");

            cbn.transfer(sendingBankId, receivingBankId, senderAccountNumber, receiverNumber, amount, pin);
            display("transfer from" + " " + senderAccountNumber + "(" + sendingBank.getBankName() + ")" + " " + "to" + " "+ receiverNumber + "(" + receivingBank.getBankName() + ")" + " " + "was successful");
        }catch (IllegalArgumentException e) {
            display("invalid credentials");
        }
        finally{
            goToMainMenu();
        }
   }


    private static void getUserInput(char userInput) {
        switch (userInput) {
            case '1': createAccount(); break;
            case '2': deposit(); break;
            case '3': withdraw(); break;
            case '4': transfer(); break;
            case '5': transferToOtherBank(); break;
            case '6': checkAccountBalance(); break;
            case '7': exitApp(); break;
            default: display("Invalid number"); goToMainMenu();
        }
    }

    private static int selectBank(){
        for(Bank bank : cbn.banks){
            System.out.println(bank.getBankId() + " " + "->" + bank.getBankName());
        }
        return Integer.parseInt(input("Enter bank number"));
    }


    private static int collectIntegerInput(String prompt) {
        try {
            return Integer.parseInt(input(prompt));
        }
        catch (NumberFormatException e) {
            display("Invalid input");
        }
        return collectIntegerInput(prompt);
    }

    private static Long collectLongInput(String prompt) {
        try {
            return Long.parseLong(input(prompt));
        }
        catch (NumberFormatException e) {
            display("Invalid input");
        }
        return collectLongInput(prompt);
    }


    private static double collectDoubleInput(String prompt) {
        try {
            return Double.parseDouble(input(prompt));
        }
        catch(NumberFormatException e) {
            display("Invalid input");
        }
        return collectDoubleInput(prompt);
    }

    private static void display(String message) {
        System.out.println(message);
    }


    public static void displayAtm(Bank bank){
        JOptionPane.showMessageDialog(null, bank.toString());
    }
}
