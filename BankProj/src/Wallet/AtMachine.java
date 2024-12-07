package Wallet;

import java.util.Scanner;

import static java.lang.System.exit;

public class AtMachine {

    private static Bank bank = new Bank();

    public static void main(String[] args) {
        goToMainMenu();
    }

    public static void goToMainMenu() {

        String mainMenu = """
                1 -> Create account.
                2 -> Deposit money.
                3 -> Withdraw money.
                4 -> Transfer money.
                5 -> Show account balance.
                6 -> Exit app.
                """;


        char userInput = input(mainMenu).charAt(0);
        display("Enter a number: ");
        switch (userInput) {
            case '1': createAccount(); break;
            case '2': deposit(); break;
            case '3': withdraw(); break;
            case '4': transfer(); break;
            case '5': showAccountBalance(); break;
            case '6': exitApp(); break;
            default: display("Invalid number"); goToMainMenu();
        }

    }
    public static String input(String prompt) {
        display(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void display(String message) {
        System.out.println(message);
    }

    public static void createAccount() {
        String firstName = input("Enter first name: ");
        String lastName = input("Enter last name: ");
        String password = input("Enter password: ");
        var account = bank.createAccount(firstName, lastName, password);
        display("Account created");
        display(String.format("Your account number is %d", account.getNumber()));
        goToMainMenu();
    }

    public static void deposit() {
        double amount = Double.parseDouble(input("Enter amount"));
        int accountNumber = Integer.parseInt(input("Enter account number"));
        bank.deposit(accountNumber, amount);
        display("Deposited " + amount + " to account number " + accountNumber);
        goToMainMenu();
    }

    public static void withdraw() {
        int accountNumber = Integer.parseInt(input("Enter account number"));
        double amount = Double.parseDouble(input("Enter amount to withdraw"));
        String pin = input("Enter pin");
        bank.withdraw(accountNumber, amount, pin);
        display("Withdrawn " + amount + " from account number " + accountNumber);
        goToMainMenu();
    }

    public static void transfer() {
        int sender = Integer.parseInt(input("Enter sender number"));
        int receiver = Integer.parseInt(input("Enter receiver number"));
        double amount = Double.parseDouble(input("Enter amount to transfer"));
        String pin = input("Enter pin");
        bank.transfer(sender, receiver, amount, pin);
        display(String.format("balance is %.2f",bank.findAccount(sender).getBalance(pin)));
        goToMainMenu();
    }

    public static void showAccountBalance() {
        int accountNumber = Integer.parseInt(input("Enter account number"));
        String pin = input("Enter pin");
        display(String.format("balance is %.2f", bank.getBalance(accountNumber, pin)));
        goToMainMenu();
    }

    public static void exitApp() {
        display("Thank you for banking with us");
        exit('4');
    }



}
