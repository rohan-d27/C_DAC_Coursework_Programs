package Calculator;

import java.util.Scanner;

public class MainCalculator {

	public static void main(String[] args) {
		
		
		System.out.println("\nEnter two numbers: ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		menu(num1,num2);
	
}
		
static void menu(int num1,int num2)
{
	System.out.println("\nEnter a choice from following: \n1.Addition \n2.Substraction \n3.multiplication \n4.Division \nModulas");
	Scanner bc=new Scanner(System.in);
	int c=bc.nextInt();
	
	if(c==1)
	{
		addition(num1,num2);
	}	
	if(c==2)
	{
		substraction(num1,num2);   
	}
	if(c==3)
	{
		multiplication(num1,num2);  
	}
	if(c==4)
	{
		division(num1,num2);
	}
	if(c==5)
	{
		modulus(num1,num2);
	}

}

	
static void addition(int num1,int num2)
{
	int add=num1+num2;
	System.out.printf("\nAddition is %d",add);
	 menu(num1,num2);
}

static void substraction(int num1,int num2)
{
	int sub=num1-num2;
	System.out.printf("\nSubstraction is %d",sub);
	menu(num1,num2);
}
static void multiplication(int num1,int num2)
{
	int mul=num1*num2;
	System.out.printf("\nMultiplication is %d",mul);
	menu(num1,num2);
	
}
static void  division(int num1,int num2)
{
	int div=num1/num2;
    System.out.printf("\nDivision is %d",div);
    menu(num1,num2);    
}
	
static void  modulus(int num1,int num2)
{
	int mod=num1%num2;
	System.out.printf("\nModulus is %d",mod);
	menu(num1,num2);
}
}
