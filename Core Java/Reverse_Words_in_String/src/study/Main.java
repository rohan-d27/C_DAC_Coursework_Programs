package study;

public class Main {

	public static void main(String[] args) {
		String str="this is practice for placement";
		String[] arr=str.split(" ");
		String str1=new String();
		for(int i=arr.length-1;i>=0;i--)
		{
			str1+=arr[i]+" ";
		}
		System.out.println(str1);
	}

}
