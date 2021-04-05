package io;

import java.util.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
public class FindFactorial{
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		FastReader reader = new FastReader();
		int t = reader.nextInt();

		while (t-- > 0) {
			int n = reader.nextInt();
			System.out.println(findFactorial(n));
		}

	}

	static BigInteger findFactorial(int n) {
		BigInteger fact = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			if (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
