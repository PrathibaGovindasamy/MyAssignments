package week1.assignment;

import java.util.Arrays;

public class FindSecondLargest {
public static void main(String[] args) {
	int[] arr = {3,2,11,4,6,7};
	Arrays.sort(arr);;
	// arr.length-2;
	System.out.println(arr[arr.length-2]);
	//for(int i=0; i<arr.length;i++)
	//System.out.println(arr[i]);
}
}
