package threading;


public class Account {
	
	private int balance;
	private static final int MAX_BALANCE = 18000;
	private static final int MIN_BALANCE = 100;
	
	public Account(int balance) {
		super();
		this.balance = balance;
	}
	public Account() {
		balance = 10000;
	}

	public int getBalance() {
		return balance;
	}


	public void deposit(int amount)
	{		
		synchronized(this) {  
		while((this.balance + amount) > MAX_BALANCE) 
		{
			try {
				System.out.println("deposit is waiting...");
				this.wait();
			   
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println("deposit wait ended");
		}//end of while
			this.balance = this.balance +amount;
			System.out.println("deposit is notifying");
			this.notifyAll();
		}//end of syncronized 
		
	}
	//synchronized method
	public synchronized void withdraw(int amount)
	{	
		while((this.balance -amount) < MIN_BALANCE) 
		{
			System.out.println("withdraw is waiting...");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.balance=this.balance -amount;
		System.out.println("withdraw is notifying");
		this.notifyAll();
	}
	
	
	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}

	
	
	

}
