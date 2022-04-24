import java.util.Scanner;

public class CheckBothLikeDisLike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter String1:");
	       String str1=sc.nextLine();
	       System.out.println("Enter String2:");
	       String str2=sc.nextLine();
	       int count=0;
	       for(int i=0;(i<str1.length() && i<str2.length());i++){
	           if(str1.charAt(i)==str2.charAt(i))
	           {
	               count++;
	           }
	       }
	    System.out.println(count);

	    }
	

}
