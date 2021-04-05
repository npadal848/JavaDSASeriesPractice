package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindFirstAndLastDigitSum {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		FastReader reader=new FastReader();
		int t=reader.nextInt();
		
		while(t-->0){
		    String n=reader.next();
		    char[] ch=n.toCharArray();
		    int sum=Character.getNumericValue(ch[0])+Character.getNumericValue(ch[ch.length-1]);
		    System.out.println(sum);
		}
	}
	
	static class FastReader{
	    BufferedReader br;
	    StringTokenizer st;
	    
	    public FastReader(){
	        br=new BufferedReader(new InputStreamReader(System.in));
	    }
	    
	    String next(){
	        try {
	            if(st==null || !st.hasMoreTokens()){
	                st=new StringTokenizer(br.readLine());
	            }
	        } catch(IOException e) {
	        }
	        return st.nextToken();
	    }
	    int nextInt(){
	        return Integer.parseInt(next());
	    }
	}
}
