import java.util.Scanner;
public class Main {


	public static void main(String[] args) {


		BankAccount m=new BankAccount("Rohan",1);
		m.deposit(1000);
		m.withdraw(100);
		m.withdraw(170);
		m.withdraw(130);
		System.out.println(m);
		System.out.println("Enter new Account Holder name:");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		m.setAccountHolderName(name);
		System.out.println("Enter new Account No.:");
		int accountNo=sc.nextInt();
		m.setAccountNo(accountNo);
		System.out.println("Enter new Account Balance:");
		int accountBal=sc.nextInt();
		m.setAccountBal(accountBal);
		System.out.println(m);
		System.out.println("Enter amount to withdraw");
		int amt=sc.nextInt();
		m.withdraw(amt);

		System.out.println("After withdraw Account balance is" + m.getAccountBal());



	}

}
