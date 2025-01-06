package CompundInterest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompoundInterestCalculatorTest {


    @Test
    public void testThatExceptionIsThrownForNegativeInterestRate(){
        double interestRate = 0;
        int compoundFrequency = -5;
        int time = 10;
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,() -> {Calculation.getInterestFactorFromContribution(interestRate, compoundFrequency, time);});
        assertEquals("Input cannot be less than 1", illegalArgumentException.getMessage());
    }

    @Test
    public void functionReturnsCorrectTheInterestFactor(){

        double interestRate = 5;
        int compoundFrequency = 12;
        int time = 10;
        double actual = Calculation.getInterestFactorResult(interestRate,compoundFrequency, time);
        double result = 1.4194530740392837E18;
        assertEquals(result,actual);

    }

    @Test
    public void functionReturnsCompoundInterest(){
        double interestFactorResult = 1.4194530740392837E18;
        int principal = 1000;
        double actual = Calculation.getCompoundInterest(interestFactorResult, principal);
        double result = 1.4194530740392836E21;
        assertEquals(result,actual);

        }

        @Test
    public void functionReturnsInterestFactorFromContribution(){
            double interestRate = 5;
            int compoundFrequency = 12;
            int time = 10;
            double actual = Calculation.getInterestFactorFromContribution(interestRate, compoundFrequency, time);
            double result = 3.4066873776942807E18;
            assertEquals(result,actual);
            }





}