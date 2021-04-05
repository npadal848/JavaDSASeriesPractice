package anagram;

public class Anagram1 {

	public static void main(String[] args) {

		String a = "cat";
		String b = "act";

		boolean isAnagram = false;

		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				for (int j = 0; j < b.length(); j++) {
					if (a.charAt(i) == b.charAt(j)) {
						isAnagram = true;
						break;
					}
				}
			}
		}

		if (isAnagram) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

}
