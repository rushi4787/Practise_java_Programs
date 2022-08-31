package Program_practise;

public class Palindrome {

	public static void main(String[] args) {

		int rev = 0;
		int i = 1234;

		while (i != 0) {
			int count = 0;

			count = i % 10;

			rev = rev * 10 + count;

			i = i / 10;
			count = 0;

		}
		System.out.println(rev);

	}

}
