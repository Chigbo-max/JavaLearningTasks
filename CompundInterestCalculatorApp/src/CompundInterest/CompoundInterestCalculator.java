package CompundInterest;

import java.util.Scanner;

public class CompoundInterestCalculator {

    public static void main(String[] args) {
        calculateCompoundInterest();
    }

    public static void calculateCompoundInterest(){
        double principal = collectDoubleInput("Enter initial investment amount: ");
        double interestRate = collectConvertedDouble("Enter annual interest rate e.g 5: ");
        int compoundFrequency = collectIntegerInput("Enter compound frequency: ");
        int time = collectIntegerInput("Enter number of years: ");
        double monthlyContribution = collectDoubleInput("Enter monthly contribution: ");
        double interestFactorResult = getInterestFactorResult(interestRate, compoundFrequency, time);
        double compoundInterest = interestFactorResult * principal;
        double denominator = interestRate/compoundFrequency;
        double interestFactorFromContribution = (interestFactorResult - 1) / denominator;
        double contributionCompoundInterest = monthlyContribution * interestFactorFromContribution;
        double totalAmount = compoundInterest + contributionCompoundInterest;
        display(String.format("The final amount after %d years with $%,.2f contributions is $%,.2f", time, monthlyContribution, totalAmount ));

    }

    private static double getInterestFactorResult(double interestRate, int compoundFrequency, int time) {
        double interestFactor = 1 + (interestRate / compoundFrequency);
        double interestFactorResult = Math.pow( interestFactor, compoundFrequency * time);
        return interestFactorResult;
    }

    private static void display(String message){
        System.out.println(message);
    }



    private static String input(String prompt){
        display(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine().trim();
    }

    private static int collectIntegerInput(String prompt){
        try {
            return Integer.parseInt(input(prompt));
        }
        catch(NumberFormatException e){
            display("Invalid input, try again");
        }
        return collectIntegerInput(prompt);
    }

    private static double collectDoubleInput(String prompt){
        try {
            return Double.parseDouble(input(prompt));
        }
        catch(NumberFormatException e){
            display("Invalid input, try again");
        }
        return collectDoubleInput(prompt);
    }

    private static double collectConvertedDouble(String prompt){
        try {
            return Double.parseDouble(input(prompt)) / 100;
        }
        catch(NumberFormatException e){
            display("Invalid input, try again");
        }
        return collectDoubleInput(prompt);
    }
}
