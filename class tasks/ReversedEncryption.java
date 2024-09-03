import java.util.Scanner;

public class ReversedEncryption{

	public static void main(String... args){
	
	Scanner userInput = new Scanner(System.in);
	System.out.println("Enter a four-digit integer: ");
	
	int fourDigits = userInput.nextInt();
	
	int firstDigit = 0;
	int secondDigit = 0;
	int thirdDigit = 0;
	int fourthDigit = 0;

	firstDigit = fourDigits/1000;
	secondDigit = (fourDigits%1000)/100;
	thirdDigit = (fourDigits%100)/10;
	fourthDigit = fourDigits%10;

	int decryptedFirstDigit = 0;
	int decryptedSecondDigit = 0;
	int decryptedThirdDigit = 0;
	int decryptedFourthDigit = 0;
	
	decryptedFirstDigit = (firstDigit - 7);
	if (decryptedFirstDigit < 0)
		decryptedFirstDigit += 10;
	decryptedSecondDigit = (secondDigit - 7);
		if (decryptedSecondDigit < 0)
		decryptedSecondDigit += 10;
	decryptedThirdDigit = (thirdDigit - 7);
		if (decryptedThirdDigit < 0)
		decryptedThirdDigit += 10;
	decryptedFourthDigit = (fourthDigit - 7);
		if (decryptedFourthDigit < 0)
		decryptedFourthDigit += 10;

	int decryptedNewFourDigitInteger = (decryptedThirdDigit * 1000) + (decryptedFourthDigit * 100) + (decryptedFirstDigit * 10) + decryptedFourthDigit;


System.out.println("Decrypted four-digit integer = " + decryptedNewFourDigitInteger);


	}


	}

