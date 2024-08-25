import java.util.Scanner;

public class FindLargestAndSmallestNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = input.nextInt();
        int largest = number;
        int smallest = number;
        int count = 0;

        while (number != 1000) {
            System.out.println("Enter any number");
            number = input.nextInt();

            if (number >= largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
	
		count = count + 1;

        }
            System.out.println("smallest number" + " " + smallest);
            System.out.println("largest number" + " " + largest);
        }



}