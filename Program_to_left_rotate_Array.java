package Program_practise;

import java.util.Arrays;

public class Program_to_left_rotate_Array {

	public static void main(String[] args) {
		int[] arr1 = { 1,2,3,4,5};
		int first=arr1[0];;
		System.out.println(Arrays.toString(arr1));
	for (int i=0;i<arr1.length-1;i++)
	{
		
		arr1[i]=arr1[i+1];
	}
	
	arr1[arr1.length-1]=first;
	System.out.println(Arrays.toString(arr1));
	
	
	
		
		
		

	}

}
