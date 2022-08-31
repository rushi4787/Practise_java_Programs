package Program_practise;

import java.util.Arrays;

public class Program_to_copy_all_elements_of_one_array {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {

			arr2[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr1)); 
		System.out.println(Arrays.toString(arr2));

	}

}
