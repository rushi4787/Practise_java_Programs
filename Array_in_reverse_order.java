package Program_practise;

import java.util.Arrays;

public class Array_in_reverse_order {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5};
		System.out.println("original array");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("reverse array");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			  
				System.out.print(arr[i]+" ");
		}

	
	}

}
