package string;

public class StringPractice {

	public static void main(String[] args) {

		String name = "abcsg";

		boolean isUnique = checkUnique(name);
		if (isUnique) {
			System.out.println("Unique");
		} else {
			System.out.println("Not Unique");
		}
	}

	static boolean checkUnique(String str) {

//		boolean[] unique = new boolean[128];
//		for (int i = 0; i < str.length(); i++) {
//			int asciiNum = str.charAt(i);
//
//			if (unique[asciiNum]) {
//				return false;
//			}
//			unique[asciiNum]=true;
//		}
//		return true;
		
		int checker=0;
		for (int i = 0; i < str.length(); i++) {
			int val=str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0) {
				return false;
			}
			checker|=(1 << val);
		}
		return true;
	}
}
