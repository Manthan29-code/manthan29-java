package bankapp;

public class CurrentAccount extends BankAccount{
    private double overdraftlimit;
    public CurrentAccount(String accountNumber,String accountHolderName,double balance, double overdraftlimit){
        super(accountNumber, accountHolderName, balance);
        this.overdraftlimit=overdraftlimit;
    }

    public void withdrow(double amount){
        if(amount <= (balance + overdraftlimit))
        {
            balance-= amount;
        }
        else{
            System.out.println("Withdrawal exceeds overdraft limit!");

        }
    }
    
}
