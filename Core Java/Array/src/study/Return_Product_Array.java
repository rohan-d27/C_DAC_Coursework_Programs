package study;

public class Return_Product_Array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int[] p=productArr(arr);
		for(int i=0;i<p.length;i++)
		{
			System.out.print(p[i]+" ");
		}
	}

	private static int[] productArr(int[] arr) {
		int[] product=new int[arr.length];
		int mul=1;
		for(int i=0;i<arr.length;i++)
		{
			mul=1;
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
				mul=mul*arr[j];
			}
			product[i]=mul;
		}
		return product;
	}

}
