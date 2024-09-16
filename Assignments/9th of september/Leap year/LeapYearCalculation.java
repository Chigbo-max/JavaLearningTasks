public class LeapYearCalculation{



public static void isLeapYear(int year){

if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
System.out.print(year + " " + "is a leap year");
else
System.out.print(year + " " + "is not a leap year");


	}

}