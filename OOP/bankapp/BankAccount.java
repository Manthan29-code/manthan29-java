package bankapp;

public class BankAccount {
	
	protected String acccountNumber;
	protected String accountHolderName;
	protected double balance;
	
	
	public BankAccount(String accountNumber , String accountHolderName ,double balance) {
		this.acccountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}

	public void deposite(int Amount)
	{
		balance += Amount;
		System.out.println("Deposited: "+Amount+",New Balance"+balance);
	}
	
	
	public void withdrow(int Amount)
	{
		if(Amount <= balance) {
			balance -= Amount;
		}else {
			System.out.println("insufficient balance");
		}
	}


	public void displayAccountDetails() {
		System.out.println("AccountNumber" + acccountNumber);
		System.out.println("accountHolderName" + accountHolderName);
		System.out.println("balance" + balance);
	}
}
