package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class VowelRecognization {

	public static void main(String[] args) {
		FirstReader reader=new FirstReader();
		int t=reader.nextInt();
		
		String[] arr=new String[t];
		StringBuilder sb=null;
		LinkedHashMap<String, ArrayList<String>> map=new LinkedHashMap<>();
		ArrayList< String> list=null;
		
		int count=0;
		for(int i=0; i<t; i++) {
			arr[i]= reader.nextLine();
		}
		
		for(int i=0; i<arr.length; i++) {
			String str=arr[i];
			char[] ch=str.toCharArray();
			list=new ArrayList<>();
			for (int j = 0; j < ch.length; j++) {

				sb=new StringBuilder();
				for (int k = j; k < ch.length; k++) {
					sb = sb.append(ch[k]);
					list.add(sb.toString());
				}
			}
			map.put(str, list);
		}
		
		for(String str: map.keySet()) {
			ArrayList<String> l= map.get(str);
			
			for(String s: l) {
				s=s.toLowerCase();
				char[] ch=s.toCharArray();
				for(int i=0; i<ch.length; i++) {
					if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
						count++;
					}
				}
			}
			System.out.println(count);
			count=0;
		}
	}

	static class FirstReader {

		BufferedReader br;
		StringTokenizer st;

		public FirstReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			if(st==null || !st.hasMoreElements()) {
				try {
					st=new StringTokenizer(br.readLine());
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
