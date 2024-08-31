import java.util.Scanner;

	public class PizzaApp{

		public static void main(String... args){
		

		String menu = """

		MENU

		1-> Sapa size - 4 slices - 2k per box

		2-> Small money - 6 slices - 2.4k per box

		3-> Big boys - 8 slices - 3k per box

		4-> Odogwu - 12 slices - 4.2k per box
		""";

		System.out.println(menu);
		Scanner userInput = new Scanner(System.in);
		System.out.println("Make your choice: ");
		int customerChoice = userInput.nextInt();

		switch(customerChoice)
		{
		case 1 : System.out.println("Sapa Size");
			 System.out.println("Enter number of guests: ");
			 int numberOfGuests = userInput.nextInt();
			 System.out.println("Boxes of pizza to buy: " + PizzaWahala.displayNumberOfBoxesToBuySapa(numberOfGuests));
			 System.out.println("Left over slices : " + PizzaWahala.displayNumberOfLeftOverSlices(numberOfGuests));
			 System.out.println("Price: " + PizzaWahala.displaySapaTotalPrice(numberOfGuests));
			 break;


		case 2 : System.out.println("Small Money Size");
			 System.out.println("Enter number of guests: ");
			 numberOfGuests = userInput.nextInt();
			 System.out.println("Boxes of pizza to buy: " + PizzaWahala.displayNumberOfBoxesToBuySmallMoney(numberOfGuests));
			 System.out.println("Left over slices: " + PizzaWahala.displayNumberOfLeftOverSlicesSmallMoney(numberOfGuests));
			 System.out.println("Price: " + PizzaWahala.displaySmallMoneyTotalPrice(numberOfGuests));
		         break;

		case 3 : System.out.println("Big Boys Size");
			 System.out.println("Enter number of guests: ");
			 numberOfGuests = userInput.nextInt();
			 System.out.println("Boxes of pizza to buy: " + PizzaWahala.displayNumberOfBoxesToBuyBigBoys(numberOfGuests));
			 System.out.println("Left over slices: " + PizzaWahala.displayNumberOfLeftOverSlicesBigBoys(numberOfGuests));
			 System.out.println("Price: " + PizzaWahala.displayBigBoysTotalPrice(numberOfGuests));

		case 4 : System.out.println("Odogwu Size");
			 System.out.println("Enter number of guests: ");
			 numberOfGuests = userInput.nextInt();
			 System.out.println("Boxes of pizza to buy: " + PizzaWahala.displayNumberOfBoxesToBuyOdogwu(numberOfGuests));
			 System.out.println("Left over slices: " + PizzaWahala.displayNumberOfLeftOverSlicesOdogwu(numberOfGuests));
			 System.out.println("Price: " + PizzaWahala.displayOdogwuTotalPrice(numberOfGuests));
			 break;
		
	       default : System.out.println("oops, you entered an invalid number, please try again!");
			 break; 

			}

		}


}