package Calculator;
/*COP_Assignment_1*/
/*Q3.3.Create a class in java MyCalculator with two data members num1,num2.
* Write Parameter less and Parameterized Constructor to initialize your data members.*/ 

import java.util.Scanner;

public class MainCalculator {

	public static void main(String[] args) {

		MyCalculator m=new MyCalculator();
		System.out.println("\nEnter two numbers: ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		m.setNum1(num1);
		int num2=sc.nextInt();
		m.setNum2(num2);
		menu(m);
	}
	static void menu(MyCalculator m)
	{
		System.out.println("\nEnter a choice from following: \n1.Addition \n2.Substraction \n3.multiplication \n4.Division \nModulas");
		Scanner bc=new Scanner(System.in);
		int c=bc.nextInt();

		if(c==1)
		{
			m.addition();
			menu(m);
		}	
		if(c==2)
		{
			m.substraction(); 
			menu(m);
		}
		if(c==3)
		{
			m.multiplication();  
			menu(m);
		}
		if(c==4)
		{
			m.division();
			menu(m);
		}
		if(c==5)
		{
			m.modulus();
			menu(m);
		}

	}
}
