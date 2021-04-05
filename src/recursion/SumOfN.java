package recursion;

public class SumOfN {
	
	public static void main(String[] args) {
		
		//input 5
		//output: 1+2+3+4+5=15
		System.out.println(sumN(5));
	}
	
	static int sumN(int n) {
		if(n==1) {
			return 1;
		}
		return n+sumN(n-1);
	}

}
