package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinarySearch {

	public static void main(String[] args) {
		FastReader reader=new FastReader();
		int n = reader.nextInt();
		int data = reader.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++) {
			a[i] = reader.nextInt();
		}
		
		int index = binarySearch(a, 0, n-1, data);
		if(index == -1) {
			System.out.println("Not Found");
		}else {
			System.out.println("Data Found "+data+" at index "+index);
		}
	}
	
	static int binarySearch(int[] a, int l, int r, int data) {
		while(l<=r) {
			int mid=(l+r)/2;
			
			if(data == a[mid]) {
				return mid;
			}else if(data<a[mid]) {
				r=mid-1;
				binarySearch(a, l, r, data);
			}else {
				l=mid+1;
				binarySearch(a, l, r, data);
			}
		}
		return -1;
	}
	static class FastReader{
		BufferedReader bf;
		StringTokenizer st;
		
		public FastReader() {
			bf = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			if(st==null || !st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(bf.readLine());
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
