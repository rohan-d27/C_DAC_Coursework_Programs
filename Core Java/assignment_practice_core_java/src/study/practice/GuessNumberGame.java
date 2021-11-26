package study.practice;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Random obj=new Random();
		int randomNo=obj.nextInt(100);
		System.out.println("Welcome to Guess the number Game:\n"
				+ "Rules:"
				+ "\n1)Number will be between 1 to 100."
				+ "\n2)You will have only 5 chances to Guess the number."
				+ "\nBest of Luck!!");
		for(int i=0;i<5;i++)
		{	
			System.out.println("Enter the number:");
		int un=sc.nextInt();
		if(randomNo==un)
		{
			System.out.println("Bingo!!You Won!!");
			break;
		}
		else if(randomNo<un)
		{
			System.out.println("Hint: Number is smaller than "+un);
		}
		else if(randomNo>un)
		{
			System.out.println("Hint: Number is bigger than "+un);
		}
		}
		System.out.println("You Lose!!!\nNumber was: "+randomNo);
	}
}
