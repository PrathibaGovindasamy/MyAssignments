package week1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=-1;
		int num2=1;
		int nextNum;
			  	 for(int i=1; i<=8; i++)
		{
			nextNum = num1+num2;
			System.out.println(nextNum);
			num1= num2;
			num2= nextNum;
			
		}
	}
	
}
 