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

	int encryptedFirstDigit = 0;
	int encryptedSecondDigit = 0;
	int encryptedThirdDigit = 0;
	int encryptedFourthDigit = 0;
	
	encryptedFirstDigit = (firstDigit - 7)%10;
	if (encryptedFirstDigit < 0)
		encryptedFirstDigit += 10;
	encryptedSecondDigit = (secondDigit - 7)%10;
	if (encryptedSecondDigit < 0)
		encryptedSecondDigit += 10;
	encryptedThirdDigit = (thirdDigit - 7)%10;
	if (encryptedThirdDigit < 0)
		encryptedThirdDigit += 10;
	encryptedFourthDigit = (fourthDigit - 7)%10;
	if (encryptedFourthDigit < 0)
		encryptedFourthDigit += 10;

	int encryptedNewFourDigitInteger = (encryptedThirdDigit * 1000) + (encryptedFourthDigit * 100) + (encryptedFirstDigit * 10) + encryptedFourthDigit;


System.out.println("Encrypted four-digit integer = " + encryptedNewFourDigitInteger);


	}


	}

