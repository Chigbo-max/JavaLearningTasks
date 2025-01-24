import Logistics.Admin;
import Logistics.Package;

import java.util.Scanner;

public class Main {

    private static Admin admin = new Admin();
    private static Package parcel = new Package();

    public static void main(String[] args) {
        goToMainMenu();
        mainMenu();
    }

    public static void goToMainMenu(){
       String menu = """
               
               1 -> Register package
               2 -> Display package
               3 -> Get Tracking Number
               
               """;
       display(menu);
       mainMenu();
    }

    public static void mainMenu(){
        char input = input("Enter an option ").charAt(0);

        switch(input){
            case '1': registerPackage(); break;
            case '2': displayPackage(); break;
            case '3': displayTrackingNumber(); break;
            default: System.out.println("Invalid option");
        }
    }

    private static void registerPackage() {
        String receiverName = input("Enter the name of the receiver: ");
        String address = input("Enter the address of the receiver: ");
        String phoneNumber = input("Enter the phone number of the receiver: ");
        String senderName = input("Enter the name of the sender: ");

        admin.registerPackage(receiverName, address,phoneNumber, senderName);

        display("Package successfully registered");
        display(String.format("Here is the tracking number: " + parcel.getTrackingNumber()));
    }

    private static void displayTrackingNumber() {
    }

    private static void displayPackage() {
    }




    public static String input(String prompt){
        display(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }

    private static void display(String message){
        System.out.println(message);
    }
}
