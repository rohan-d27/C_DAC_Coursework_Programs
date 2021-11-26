package assignments;

public class CommandLine_Q5 {

	public static void main(String[] args) {
		
		for(String s:args)
		{
			Integer k=Integer.parseInt(s);
			if(k==1)
			{for (int table = 1; table <= 100; table++) {
				for (int i = 1; i <= 10; i++) {

					System.out.println(table + " * " + (i) + " = " + (table * (i)));
				}
				System.out.println("----------");

			}
				
			}
			else if(k==2)
			{
				System.out.println("With death being the only certainty of life, "
						+ "life is just a bit too short for regrets.\r\n"
						+ "Let's live while we're alive.\r\n"
						+ "Let's love while we're alive.\r\n"
						+ "Let's live and not just survive.");
			}
			else if(k==3)
			{
				System.out.println("WelCome!!");
			}
			else
			{
				System.out.println("Incorrect Option!!!!S");
			}
		}
	}

}
