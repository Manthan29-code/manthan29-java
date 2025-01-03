package bankapp;

public class SavingsAccount extends BankAccount{
	private double interestRate;
	public SavingsAccount(String accountNumber, String accountHolderName, double balance ,double interestRate) {
		super(accountNumber, accountHolderName, balance);
		// TODO Auto-generated constructor stub
		this.interestRate= interestRate;
	}

	public void addInterest()
	{
	    
		double interestAmount= balance * (interestRate/100);
        balance = balance+interestAmount;		
		System.out.println("Interest Added: " + interestAmount + ", New Balance: " + balance);
	
	}
      
}
