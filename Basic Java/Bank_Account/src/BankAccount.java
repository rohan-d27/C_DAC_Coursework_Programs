
public class BankAccount {

	/*
	 * Bank account:
	 * - Account number
	 * - Account holder name
	 * - Account balance;
	 */
	private String accountHolderName;
	private int accountNo;
	private int accountBal;

	/*
	 * Account will need name and number at the time of creation
	 * Balance can be added after creating account
	 */

	public BankAccount() {

	}
	public BankAccount(String name, int no) {
		accountHolderName=name;
		accountNo=no;

	}
	public void deposit(int amt) {
		accountBal=accountBal+amt;
	}
	public int withdraw(int amt) {
		accountBal=accountBal-amt;
		return accountBal;
	}
	public String toString() {
		String str= "Account Holder Name:"+accountHolderName+",Account No.:"+accountNo+",Account Balance:"+accountBal;
		return str;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getAccountBal() {
		return accountBal;
	}
	public void setAccountBal(int accountBal) {
		this.accountBal = accountBal;
	}



}
