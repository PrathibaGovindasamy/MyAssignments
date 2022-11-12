package week1.assignment;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int input =153;
		int dup =input;
		int sum = 0;
		
		while (input> 0)
		{
			int rem  = input % 10;
			 sum = sum + rem*rem*rem;
			 input = input/10;
			
		}
		System.out.println(sum);
		if (dup ==sum ) {
			System.out.println("The number is Armstrong");
		}else 
			System.out.println("The number is not an Armstrong");
		}
	}
	

