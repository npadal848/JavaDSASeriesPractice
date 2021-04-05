package numbertheory;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(findFactorial(n));
	}
	static int findFactorial(int n) {
		if(n<=1) return 1;
		
		return n*findFactorial(n-1);
	}
}
