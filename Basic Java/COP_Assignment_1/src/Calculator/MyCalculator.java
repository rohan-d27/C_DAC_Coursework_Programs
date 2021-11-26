package Calculator;

public class MyCalculator {
	public int num1;
	public int num2;

	public MyCalculator() {
		num1=1;
		num2=1;
	}
	public MyCalculator(int num1, int num2) {
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
	public void setNum2(int num2) 
	{
		this.num2 = num2;
	}
	public void addition()
	{
		int add=num1+num2;
		System.out.printf("\nAddition is %d",add);
	}
	public void substraction()
	{
		int sub=num1-num2;
		System.out.printf("\nSubstraction is %d",sub);
	}
	public void multiplication()
	{
		int mul=num1*num2;
		System.out.printf("\nMultiplication is %d",mul);
	}
	public void  division()
	{
		int div=num1/num2;
		System.out.printf("\nDivision is %d",div);
	}

	public void  modulus()
	{
		int mod=num1%num2;
		System.out.printf("\nModulus is %d",mod);
	}

}
