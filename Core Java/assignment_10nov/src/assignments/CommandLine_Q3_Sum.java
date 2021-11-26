package assignments;

public class CommandLine_Q3_Sum {

	public static void main(String[] args) {
		int sum=0;
		
		for(String s:args)
		{
			System.out.println(s);	
		}
		for(int i=0;i<args.length;i++) {
			int x=Integer.parseInt(args[i]);
			 sum=sum+x;
		
}
	System.out.println("Sum:"+sum);
}
}