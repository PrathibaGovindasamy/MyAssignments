package week1.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		//System.out.println(arr[4]);
		//for(int i=0; i<arr.length;i++)
		//System.out.println(arr[i]);
		for(int i=0; i<arr.length;i++)
			{
			if (arr[i] != i+1)
			{
			System.out.println(i+1);
			break;
		}
	}

}
}
	
