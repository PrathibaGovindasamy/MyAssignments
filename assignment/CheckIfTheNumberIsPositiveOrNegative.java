package week1.assignment;
import java.util.Scanner;

public class CheckIfTheNumberIsPositiveOrNegative {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Number:");
		int number = scan.nextInt(); 
		if (number > 0) {
			System.out.println("The number is positive");
		}else if (number < 0){
			System.out.println("The number is negative");
		}
			else
			System.out.println("The number is neither positive nor negative");
		scan.close();
		
	}

}

