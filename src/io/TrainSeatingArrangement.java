package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TrainSeatingArrangement {
	
	public static void main(String[] args) {
		
		FirstReader reader=new FirstReader();
		int t=reader.nextInt();
		
		while(t-->0) {
			
			int n=reader.nextInt();
			if(n%12==1) {
				n=n+11;
				System.out.println(n+" WS");
			}else if(n%12==2) {
				n=n+9;
				System.out.println(n+" MS");
			}else if(n%12==3) {
				n=n+7;
				System.out.println(n+" AS");
			}else if(n%12==4) {
				n=n+5;
				System.out.println(n+" AS");
			}else if(n%12==5) {
				n=n+3;
				System.out.println(n+" MS");
			}else if(n%12==6) {
				n=n+1;
				System.out.println(n+" WS");
			}else if(n%12==7) {
				n=n-1;
				System.out.println(n+" WS");
			}else if(n%12==8) {
				n=n-3;
				System.out.println(n+" MS");
			}else if(n%12==9) {
				n=n-5;
				System.out.println(n+" AS");
			}else if(n%12==10) {
				n=n-7;
				System.out.println(n+" AS");
			}else if(n%12==11) {
				n=n-9;
				System.out.println(n+" MS");
			}else if(n%12==0) {
				n=n-11;
				System.out.println(n+" WS");
			}
			
//			System.out.println(12%12);
//			if(n%8==1) {
//				n=n+7;
//				System.out.println(n+" SS");
//			}else if(n%8==2) {
//				n=n+5;
//				System.out.println(n+" AS");
//			}else if(n%8==3) {
//				n=n+3;
//				System.out.println(n+" MS");
//			}else if(n%8==4) {
//				n=n+1;
//				System.out.println(n+" WS");
//			}else if(n%8==5) {
//				n=n-1;
//				System.out.println(n+" WS");
//			}else if(n%8==6) {
//				n=n-3;
//				System.out.println(n+" MS");
//			}else if(n%8==7) {
//				n=n-5;
//				System.out.println(n+" AS");
//			}else if(n%8==0) {
//				n=n-7;
//				System.out.println(n+" SS");
//			}
			
		}
	}
	
	static class FirstReader {

		BufferedReader br;
		StringTokenizer st;

		public FirstReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			if (st == null || !st.hasMoreElements()) {
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

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}
