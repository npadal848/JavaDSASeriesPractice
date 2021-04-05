package string;

public class ReverseStringWithoutSplit {

	public static void main(String[] args) {

		String s = "     I     love   Java    Programming";
		char ch[] = s.toCharArray();
		int startIndex=0;
		int endIndex=0;
		for(int i=0; i<ch.length; i++) {
			boolean foundString=false;
			if(ch[i]!=' ') {
				endIndex=i;
				
			}else {
				startIndex=i;
			}
		}

	}

}
