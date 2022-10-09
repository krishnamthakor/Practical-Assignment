public class AccountMain 
{
	public static void main(String[] args) 
	{
		Account aobj = new Account(1001,5000);
		aobj.setAnnualInterestRate(6);
		
		System.out.println("Account ID : " + aobj.getId());
		System.out.println("Account Balance : " + aobj.getBalance());
		System.out.println("Annual Interest Rate : " + aobj.getAnnualInterestRate());
		
		System.out.println();
		aobj.Deposit(2000);
		
		System.out.println();
		System.out.println("ID : 21CE142 \nName : Krishna M. Thakor");
	}
}
