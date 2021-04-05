package anagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Anagram3 {

	public static void main(String[] args) {

		String a = "cata";
		String b = "acta";
		
		boolean isAnagram=true;
		HashMap<Character, Integer> aMap=new HashMap<>();
		
		if(a.length()==b.length()) {
			for(char c: a.toCharArray()) {
				if(aMap.containsKey(c)) {
					aMap.put(c, aMap.get(c)+1);
				}else {
					aMap.put(c, 1);
				}
			}
			
			for(char c: b.toCharArray()) {
				if(aMap.containsKey(c)) {
					aMap.put(c, aMap.get(c)-1);
				}else {
					aMap.put(c, 1);
				}
			}
		}
		
	List<Integer> al=List.copyOf(aMap.values());
	for(int item: al) {
		if(item>0) {
			isAnagram=false;
			break;
		}
	}
	
	if(isAnagram) {
		System.out.println("Anagram");
	}else {
		System.out.println("Not Anagram");
	}
	
	}

}