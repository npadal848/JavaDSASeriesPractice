package recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		
		System.out.println("Factorial of "+n+" is: "+findFactorial(n));
		
	}
	
	static int findFactorial(int n) {
		
		if(n<=1) return 1;
		
		return n*findFactorial(n-1);
	}
}
