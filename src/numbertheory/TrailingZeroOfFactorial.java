package numbertheory;

import java.util.Scanner;

public class TrailingZeroOfFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countTrailingZero(n));
	}

	private static int countTrailingZero(int n) {

		int count = 0;
		for (int i = 0; i <= n; i = i * 5) {
			count = count + (n / i);
		}
		return count;
	}
}
