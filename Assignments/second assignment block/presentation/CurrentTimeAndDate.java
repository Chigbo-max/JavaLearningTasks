public class CurrentTimeAndDate{

	public static void main(String... args){

	long currentTimeMillis = System.currentTimeMillis();


	long seconds = currentTimeMillis/1000;
	long minutes = seconds / 60;
	long hours = minutes / 60;
	long days = hours / 24;

	long currentSeconds = seconds % 60;
	long currentMinutes = minutes % 60;
	long currentHour = (hours % 24) + 1;

	System.out.print("Current time is " + " " + currentHour + ":" + currentMinutes + ":" + currentSeconds);

}


}







