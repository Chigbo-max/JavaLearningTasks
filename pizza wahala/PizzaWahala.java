public class PizzaWahala{

	public static double displayNumberOfBoxesToBuySapa(int numberOfGuests){
	
	double numberOfSapaSlices = 4;
	
	double numberOfBoxes = (numberOfGuests / numberOfSapaSlices);

	return Math.ceil(numberOfBoxes);
	}

	public static double displayNumberOfLeftOverSlices(int numberOfGuests){
	
	double numberOfSapaSlices = 4;

	double numberOfSlicesLeft = 0;
	
	double numberOfBoxes = displayNumberOfBoxesToBuySapa(numberOfGuests);
	
	numberOfSlicesLeft = (numberOfSapaSlices *  numberOfBoxes) - numberOfGuests;
	
	return numberOfSlicesLeft;
	}


	public static double displaySapaTotalPrice(int numberOfGuests){
	
	double numberOfBoxes = displayNumberOfBoxesToBuySapa(numberOfGuests);

	double sapaPrice = 2000;
	
	double totalPrice = numberOfBoxes * sapaPrice;

	return totalPrice;
	}

	
	public static double displayNumberOfBoxesToBuySmallMoney(int numberOfGuests){
	
	double numberOfSmallMoneySlices = 6;
	
	double numberOfSmallMoneyBoxes = (numberOfGuests / numberOfSmallMoneySlices) ;

	return Math.ceil(numberOfSmallMoneyBoxes);
	}



	public static double displayNumberOfLeftOverSlicesSmallMoney(int numberOfGuests){
	
	double numberOfSmallMoneySlices = 6;

	double numberOfSmallMoneySlicesLeft = 0;
	
	double numberOfSmallMoneyBoxes = displayNumberOfBoxesToBuySmallMoney(numberOfGuests);
		
	numberOfSmallMoneySlicesLeft = (numberOfSmallMoneySlices *  numberOfSmallMoneyBoxes) - numberOfGuests;


	return numberOfSmallMoneySlicesLeft;
	}

	public static double displaySmallMoneyTotalPrice(int numberOfGuests){
	
	double numberOfSmallMoneyBoxes = displayNumberOfBoxesToBuySmallMoney(numberOfGuests);

	double smallMoneyPrice = 2400;
	
	double totalSmallMoneyPrice = numberOfSmallMoneyBoxes * smallMoneyPrice;

	return totalSmallMoneyPrice;
	}


	public static double displayNumberOfBoxesToBuyBigBoys(int numberOfGuests){
	
	double numberOfBigBoysSlices = 8;
		
	double numberOfBigBoysBoxes = (numberOfGuests / numberOfBigBoysSlices);

	return Math.ceil(numberOfBigBoysBoxes);
	}
	

	public static double displayNumberOfLeftOverSlicesBigBoys(int numberOfGuests){
	
	double numberOfBigBoysSlices = 8;

	double numberOfBigBoysSlicesLeft = 0;
	
	double numberOfBigBoysBoxes = displayNumberOfBoxesToBuyBigBoys(numberOfGuests);
	
	numberOfBigBoysSlicesLeft = (numberOfBigBoysSlices *  numberOfBigBoysBoxes) - numberOfGuests;

	return numberOfBigBoysSlicesLeft;
	}

	public static double displayBigBoysTotalPrice(int numberOfGuests){
	
	double numberOfBigBoysBoxes = displayNumberOfBoxesToBuyBigBoys(numberOfGuests);

	double bigBoysPrice = 3000;
	
	double totalBigBoysPrice = numberOfBigBoysBoxes * bigBoysPrice;

	return totalBigBoysPrice;
	}


	public static double displayNumberOfBoxesToBuyOdogwu(int numberOfGuests){
	
	double numberOfOdogwuSlices = 12;
		
	double numberOfOdogwuBoxes = (numberOfGuests / numberOfOdogwuSlices) ;
	
	return Math.ceil(numberOfOdogwuBoxes);
	
	}


	public static double displayNumberOfLeftOverSlicesOdogwu(int numberOfGuests){
	
	double numberOfOdogwuSlices = 12;

	double numberOfOdogwuSlicesLeft = 0;

	double numberOfOdogwuBoxes = displayNumberOfBoxesToBuyOdogwu(numberOfGuests);

	
	numberOfOdogwuSlicesLeft = (numberOfOdogwuSlices *  numberOfOdogwuBoxes) - numberOfGuests;
	

	return numberOfOdogwuSlicesLeft;
	}


	public static double displayOdogwuTotalPrice(int numberOfGuests){
	
	double numberOfOdogwuBoxes = displayNumberOfBoxesToBuyOdogwu(numberOfGuests);

	double odogwuPrice =4200;
	
	double totalOdogwuPrice = numberOfOdogwuBoxes * odogwuPrice;

	return totalOdogwuPrice;
	}

	

}

