package array;

public class Characterocurrance {
	public static void main(String[] args) {
		String input="welcome to chennai";
		//Method 1
		/*
		 * int count=0; for (int i = 0; i < input.length(); i++) { input.charAt(i);
		 * 
		 * if (input.charAt(i)=='e') { count++; } } System.out.println(count);
		 */
		
		//Method 2
		/*
		 * String newstring= input.replace('e', 'x'); //to replace old character with
		 * new character System.out.println(newstring);
		 */
		
		String ne= input.replace("e","");
		System.out.println(input.length()-ne.length());
		
	}

}
