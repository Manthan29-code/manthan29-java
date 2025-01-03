package bankapp;
/*

 * Bank Application
*****************
A bank system has different types of accounts: 

	===> Savings Account and 
	===> Current Account. 

	Both accounts share some common properties like 
			===> accountNumber, 
			===> accountHolderName, and 
			===> balance. 

	However, they differ in their behaviors, such as:

===> A Savings Account earns interest.// 10000---10000
===> A Current Account has an overdraft limit.// 10000(50000) = 60000
--------------------------------------------------------------------------------------------------------------------
				Dm's
				-----					
					--accountNumber
					--accountHolderName
					--balance	
				Mf's
				----
					  **deposite
					  **withdraw
					  **displayAccountDetails(....)

					BankAccount(Parent Class)
					    |
			------------------------------------------
			|								|
		SavingsAccount				  CurrentAccount
		--double-interestRate			  --overdraftLimit--[10000 + 50000] = 60000/-
		**addInterest				  		**withdraw
*/		
import java.util.Scanner;
public class BankApplication {


      public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1) for saving Account");
        System.out.println("2) For Current Account");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                SavingsAccount savingAccount=new SavingsAccount("aa1", "Manthan", 10000,3.0 );
                boolean exit=false;
                while(!exit){
                    System.out.println("\n--- Savings Account Menu ---");
                    System.out.println("1. Display Account Details");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Deposit");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    int option = sc.nextInt();

                    switch (option) {
                        case 1:
                            savingAccount.displayAccountDetails();
                            break;
                        case 2:
                            System.out.print("Enter amount to withdraw: ");
                            int withdrawAmount = sc.nextInt();
                            savingAccount.withdrow(withdrawAmount);
                            break;
                        case 3:
                            System.out.print("Enter amount to deposit: ");
                            int depositAmount = sc.nextInt();
                            savingAccount.deposite(depositAmount);
                            break;
                        case 4:
                            exit = true;
                            break;
                        default:
                            System.out.println("Invalid choice. Try again.");
                    }
                }   
            break;
            case 2: 
                    CurrentAccount currentAccount = new CurrentAccount("rt4", "Manthan", 10000, 1000);
                    boolean Exit = false;
                while (!Exit) {
                    System.out.println("\n--- Current Account Menu ---");
                    System.out.println("1. Display Account Details");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Deposit");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    int option = sc.nextInt();

                    switch (option) {
                        case 1:
                            currentAccount.displayAccountDetails();
                            break;
                        case 2:
                            System.out.print("Enter amount to withdraw: ");
                            double withdrawAmount = sc.nextDouble();
                            currentAccount.withdrow(withdrawAmount);
                            break;
                        case 3:
                            System.out.print("Enter amount to deposit: ");
                            int  depositAmount = sc.nextInt();
                            currentAccount.deposite(depositAmount);
                            break;
                        case 4:
                            Exit = true;
                            break;
                        default:
                            System.out.println("Invalid choice. Try again.");
                    }
                }
                break;


        }
      }
}
