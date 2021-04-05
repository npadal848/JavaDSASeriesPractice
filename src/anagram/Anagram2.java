package anagram;

import java.util.Arrays;

public class Anagram2 {

	public static void main(String[] args) {

		String a = "I love u";
		String b = "u love I";
		
		char arr[]=a.toCharArray();
		char brr[]=b.toCharArray();
		
		boolean isAnagram = false;

		Arrays.sort(arr);
		Arrays.sort(brr);
		
		a=new String(arr);
		b=new String(brr);
		
		System.out.println("a sort: "+a);
		System.out.println("b sort: "+b);
		
		
		if (arr.length == brr.length) {
			
			if(a.equals(b)) {
				isAnagram=true;
			}
		}

		if (isAnagram) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

}
