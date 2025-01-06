package CompundInterest;

public class Calculation {


    public static double getInterestFactorResult(double interestRate, int compoundFrequency, int time) {
        if(interestRate < 1 || time < 1 || compoundFrequency < 1){
            throw new IllegalArgumentException("Input cannot be less than 1");
        }
        double interestFactor = 1 + (interestRate / compoundFrequency);
        double interestFactorResult = Math.pow( interestFactor, compoundFrequency * time);
        return interestFactorResult;
    }

    public static double getCompoundInterest(double interestFactorResult, double principal) {
        double compoundInterest = interestFactorResult * principal;
        return compoundInterest;
    }



    public static double getInterestFactorFromContribution(double interestRate, int compoundFrequency, int time) {
        double interestFactorFromContribution = (getInterestFactorResult(interestRate, compoundFrequency, time) - 1) / getDenominator(interestRate, compoundFrequency);
        return interestFactorFromContribution;
    }

    private static double getDenominator(double interestRate, int compoundFrequency) {
        double denominator = interestRate / compoundFrequency;
        return denominator;
    }

}
