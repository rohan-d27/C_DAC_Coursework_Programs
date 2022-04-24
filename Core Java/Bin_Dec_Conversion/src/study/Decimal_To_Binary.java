package study;

public class Decimal_To_Binary {

	public static void main(String[] args) {
		int[] binary=new int[100];
		int i=0;
		int decimal=4;
		while(decimal>0)
		{
			binary[i++]=decimal%2;
			decimal=decimal/2;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(binary[j]);
		}
		
	}

}
