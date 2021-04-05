package array;

import java.util.Scanner;

public class BracketSequence {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int openBracketCount=0;
        int closeBracketCount=0;
		char[] br=s.toCharArray();
		
        if(s.length()%2!=0){
            System.out.println(0);
            return;
        }
		for(char c: br) {
			switch(c) {
				case '(':
					openBracketCount++;
					break;
				case ')':
					closeBracketCount++;
					break;
			}
			
		}
        if(openBracketCount!=closeBracketCount) {
            System.out.println(0);
        }else{
            System.out.println(openBracketCount);
        }
	}
}
