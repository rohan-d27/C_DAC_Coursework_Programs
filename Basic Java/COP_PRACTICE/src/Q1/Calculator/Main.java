package Q1.Calculator;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
	
			System.out.println("\nEnter two numbers: ");
			Scanner sc=new Scanner(System.in);
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			Calculator cal =new Calculator();
			cal.setNum1(num1);
			cal.setNum2(num2);
			menu(cal);
		
	}
			
	static void menu(Calculator cal)
	{
		System.out.println("\nEnter a choice from following: \n1.Addition \n2.Substraction \n3.multiplication \n4.Division \n5.Modulas");
		Scanner bc=new Scanner(System.in);
		int c=bc.nextInt();
		
		if(c==1)
		{
			Calculator.addition();
			 menu(cal);
		}	
		if(c==2)
		{
			Calculator.substraction();
			menu(cal);
		}
		if(c==3)
		{
			Calculator.multiplication(); 
			menu(cal);
		}
		if(c==4)
		{
			Calculator.division();
			menu(cal);
		}
		if(c==5)
		{
			Calculator.modulus();
			menu(cal);
		}

	}

		
	
}


