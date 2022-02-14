
package array;

import java.util.Iterator;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class palindrome {
	public static void main(String[] args) {
		String input="madam";
		String rev="";
		System.out.println(input.length());
		
		for (int i = input.length()-1; i >=0; i--) {
			
			//System.out.println(input.charAt(i));
			rev=rev+input.charAt(i);
			//System.out.println(rev);
		}
		if(input.equals(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

	
}
