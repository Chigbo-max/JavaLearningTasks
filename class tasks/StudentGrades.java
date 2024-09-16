import java.util.Scanner;

public class StudentGrades{


	public static void main(String... args){
		
		Scanner userInput = new Scanner(System.in);

		int gradeA = 0;
		int gradeB = 0;
		int gradeC = 0;
		int gradeD = 0;
		int gradeCounter = 1;		
		


		while(gradeCounter <= 5){


		System.out.println("Enter name of student: ");
		String studentName = userInput.nextLine();


		System.out.println("Enter grade of student (A - D): ");
		char studentGrade = Character.toUpperCase(userInput.next().charAt(0));
		userInput.nextLine();
		gradeCounter++;
		


		switch(studentGrade){
			case 'A': gradeA++;break;
			case 'B': gradeB++;break;
			case 'C': gradeC++;break;
			case 'D': gradeD++;break;
			default: System.out.print("invalid grade, enter grade between A - D");break;

				}

		System.out.println(studentName + " " + studentGrade); 

			}

		System.out.println(studentName + "has" + " " + gradeA + "As"); 
		
		System.out.println(studentName + "has" + " " + gradeB + "Bs"); 

		System.out.println(studentName + "has" + " " + gradeC + "Cs"); 

		System.out.println(studentName + "has" + " " + gradeD + "Ds"); 


		}


}