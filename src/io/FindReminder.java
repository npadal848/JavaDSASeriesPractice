package io;

import java.util.*;
import java.io.*;

public class FindReminder{
    
    public static void main (String[] args) {
        
        FastReader reader=new FastReader();
        int t=reader.nextInt();
        
        while(t-->0){
            int a=reader.nextInt();
            int b=reader.nextInt();
            
            System.out.println(a%b);
        }
    }
    
    static class FastReader{
        BufferedReader bf;
        StringTokenizer st;
        
        public FastReader(){
            bf=new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next(){
            if(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(bf.readLine());    
                } catch(IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
    }
}