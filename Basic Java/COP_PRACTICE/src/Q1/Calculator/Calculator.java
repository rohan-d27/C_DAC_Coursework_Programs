package Q1.Calculator;

public class Calculator {
static int num1;
static int  num2;

public Calculator ()
{

}
public Calculator(int num1, int num2) {
	super();
	this.num1 = num1;
	this.num2 = num2;
}
public int getNum1() {
	return num1;
}
public void setNum1(int num1) {
	this.num1 = num1;
}
public int getNum2() {
	return num2;
}
public void setNum2(int num2) {
	this.num2 = num2;
}
public static void addition()
{
	int add=num1+num2;
	System.out.printf("\nAddition is %d",add);	
}

public static void substraction()
{
	int sub=num1-num2;
	System.out.printf("\nSubstraction is %d",sub);	
}
public static void multiplication()
{
	int mul=num1*num2;
	System.out.printf("\nMultiplication is %d",mul);	
}
public static void  division()
{
	int div=num1/num2;
    System.out.printf("\nDivision is %d",div);  
}
	
public static void  modulus()
{
	int mod=num1%num2;
	System.out.printf("\nModulus is %d",mod);
}

}
