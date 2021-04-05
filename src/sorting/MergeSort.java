package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MergeSort {

	public static void main(String[] args) {
		FastReader reader = new FastReader();
		int n = reader.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = reader.nextInt();
		}

		mergeSort(a, 0, a.length - 1);

		for (int e : a) {
			System.out.print(e + " ");
		}
	}

	static void mergeSort(int[] a, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;

			mergeSort(a, start, mid);
			mergeSort(a, mid + 1, end);

			merge(a, start, mid, end);
		}

	}

	static void merge(int[] a, int start, int mid, int end) {

		// Find size of both temp array
		int n1 = mid - start + 1;
		int n2 = end - mid;

		//create temp array for left and right elements
		int[] lArr = new int[n1];
		int[] rArr = new int[n2];

		// copy data to both left and right temp array
		for (int i = 0; i < n1; i++) {
			lArr[i] = a[start+i];
		}

		for (int i = 0; i < n2; i++) {
			rArr[i] = a[mid + 1 + i];
		}

		int i = 0;
		int j = 0;
		int k = start;

		while (i < n1 && j < n2) {
			if (lArr[i] <= rArr[j]) {
				a[k] = lArr[i];
				i++;
			} else {
				a[k] = rArr[j];
				j++;
			}
			k++;
		}
		while (j < n2) {
			a[k] = rArr[j];
			j++;
			k++;
		}
		while (i < n1) {
			a[k] = lArr[i];
			i++;
			k++;
		}
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
