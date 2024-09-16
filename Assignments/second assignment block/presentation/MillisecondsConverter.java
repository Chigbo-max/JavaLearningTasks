
import java.util.*;

public class MillisecondsConverter{

	public static void main(String... args){
	Scanner userInput = new Scanner(System.in);
	System.out.println("Enter a long integer: ");
	long milliseconds = userInput.nextLong();
	System.out.println(convertMillis(milliseconds));
	}



	public static String convertMillis(long millis){

	long currentTimeMillis = millis;
	long seconds = currentTimeMillis/1000;
	long minutes = seconds / 60;
	long hours = minutes / 60;
	long days = hours / 24;

	long currentSeconds = seconds % 60;
	long currentMinutes = minutes % 60;
	long currentHour = hours % 24;

	return currentHour + ":" + currentMinutes + ":" + currentSeconds;

	}


}





