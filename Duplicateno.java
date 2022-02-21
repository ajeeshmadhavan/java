package array;



public class Duplicateno { 
	public static void main(String[] args) {
		int[] a= {1,2,3,4,6,7,8,3,9,0,1,7};
		
		for (int i = 0; i < a.length; i++) {
			int count=1;
			for (int j = i+1; j < a.length; j++) {
			if (a[i]==a[j]) {
				count++;
			}	
			}
			if (count >1) {
				System.out.println(a[i]);
			}
		}
			
	}

}
