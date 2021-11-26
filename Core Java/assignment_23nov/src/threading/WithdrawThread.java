package threading;


public class WithdrawThread implements Runnable{

	Account acct;
	
	public WithdrawThread(Account a) {
		this.acct =a;
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++)
		{
			acct.withdraw(1000);
			System.out.println("balance after withdrawal "+acct.getBalance());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
}
