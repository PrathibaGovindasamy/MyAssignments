package week1.assignment;

import java.util.Scanner;

public class ConvertANegativeNumberToPositiveNumber {
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter Your Number:");
	int number = scan.nextInt(); 
		if (number < 0)
	{
		 number = number*-1;
	System.out.println("Positivenumber:" +number);
	scan.close();
}
}
}