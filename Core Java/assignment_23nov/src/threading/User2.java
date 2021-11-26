package threading;


public class User2 {
	
	public static void main(String[] args) {
		
		Account shared = new Account();
		Thread deposit = new Thread(new DepositThread(shared));
		Thread withdraw = new Thread(new WithdrawThread(shared));
		
		deposit.start();
		withdraw.start();
		
		System.out.println("main ends");
	}

}
