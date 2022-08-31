package Program_practise;

public class Fibonacci {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		int k;
		for (int p = 1; p <= 10; p++) {
			k = i + j;
			System.out.println(k);
			i = j;
			j = k;

		}
	}

}
