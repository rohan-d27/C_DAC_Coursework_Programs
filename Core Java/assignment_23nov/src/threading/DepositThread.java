package threading;


public class DepositThread implements Runnable{


	Account acct;
	
	public DepositThread(Account a) {
		this.acct =a;
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++)
		{
			acct.deposit(100);
			System.out.println("balance after deposit :"+acct.getBalance());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
