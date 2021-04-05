package string;

public class ReverseString {

	public static void main(String[] args) {

		String s = "     I     love   Java    Programming";
		String arr[] = s.split(" ");
		for (int i=arr.length-1; i>=0;i--) {
			if(arr[i]!="") {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
