package string4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter String of 1's and 0's");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int temp =0;
		int count=0;
		int max=0;
		int i=0;
		while (i<s1.length()){
			count=0;
			while(i<s1.length() && s1.charAt(i)!='1') {
				count++;
				if (max< count) {
					max=count;
					temp =i;

				}
				i++;
			}
			i++;
		}


		count=0;
		String final1 = s1.substring(i-max-1,temp+1);
		System.out.println(max +"\n"+final1);
	}	
}
