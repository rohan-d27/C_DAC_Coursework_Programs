package study;

public class Binary_To_Decimal {

	public static void main(String[] args) {

		System.out.println(convertToDecimal(100));
	}

	private static int  convertToDecimal(int binary) {
		int decimal=0;
		int i=0;

		while(true)
		{
			if(binary==0)
			{
				break;
			}
			else {
					int temp=binary%10;
					decimal+=temp*Math.pow(2,i);
					binary=binary/10;
					i++;
			    }
		}
		return decimal;


	}

}
