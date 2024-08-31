import java.util.Scanner;

public class BackToSenderLogistics{
	public static void main(String... args){
		Scanner ridersInput = new Scanner(System.in);
		System.out.println("Enter number of successful delivery: ");
		int successfulDelivery = ridersInput.nextInt();
		System.out.println("Rider's wage for the day = " + successfulDelivery(successfulDelivery));

		}


public static int successfulDelivery(int ridersDelivery){
int ridersWageForTheDay = 0;
int basePay = 5000;

if (ridersDelivery < 50){
	ridersWageForTheDay = (ridersDelivery * 160) + basePay;
	}
else if(ridersDelivery >= 50 && ridersDelivery < 60){
	ridersWageForTheDay = (ridersDelivery * 200) + basePay;
	}
else if(ridersDelivery >= 60 && ridersDelivery < 70){
	ridersWageForTheDay = (ridersDelivery * 250) + basePay;
	}
else if(ridersDelivery >= 70)
	ridersWageForTheDay = (ridersDelivery * 500) + basePay;

return ridersWageForTheDay;

		}

	
}

