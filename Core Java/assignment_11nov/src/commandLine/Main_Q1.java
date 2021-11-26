package commandLine;

public class Main_Q1 {

	public static void main(String[] args) {
		
		    
			int x=Integer.parseInt(args[0]);
			WordConverter w=new WordConverter (x);
			System.out.println("Input:"+x);
			
			if(x<10000) {
				String str= w.getnumInWord();
				System.out.println(str);
			}
			else
			{
				System.out.println("Number should be smaller than 10000");
			}
	}

}
