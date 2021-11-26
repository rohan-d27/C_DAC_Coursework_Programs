package string1;

public class Main {

	public static void main(String[] args) {
		
		String s1="Hello"; 
		System.out.println(s1);
		
		String s2=new String("Hello");
		System.out.println(s2);
		 
		char crr[] = { 'H', 'e', 'l', 'l', 'o' }; 
		String s3 = new String(crr); 
		System.out.println(s3);
		
		char crr2[] = { 'H', 'e', 'l', 'l', 'o' }; 
		 String s4 = new String(crr2, 0,4); 
		 System.out.println(s4); 
		
		

	}

}
