package Program_practise;

public class Program_to_find_frequency_of_ele_in_array {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 5, 6, 7, 5, 8, 7 };
		int ar[] = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			int count = 0;
			int num = arr1[i];

			for (int j = 0; j < arr1.length; j++) {
				if (num == arr1[j]) {
					count++;
					
				}
			}
			if (count >= 2) {

				System.out.println(arr1[i]);

			}

		}

	}

}
