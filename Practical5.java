public class Practical5 
{
	public static void main(String[] args) 
	{
		Account account = new Account(1122, 20000);
		SavingsAccount savings = new SavingsAccount(1001, 20000);
		CheckingAccount checking = new CheckingAccount(1004, 20000, -20);

		account.setAnnualInterestRate(4.5);
		savings.setAnnualInterestRate(4.5);
		checking.setAnnualInterestRate(4.5);

		account.withdraw(2500);
		savings.withdraw(2500);
		checking.withdraw(2500);

		account.deposit(3000);
		savings.deposit(3000);
		checking.deposit(3000);

		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
		
		System.out.println();
		System.out.println("ID : 21CE142 \nName : Krishna M. Thakor");
	}
}
