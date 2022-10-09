
import java.util.*;

public class Account
{
	private int Id;
	private double Balance;
	private double annualInterestRate;
	private Date dateCreated;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public Account()
	{
		Id = 0;
		Balance = 0;
		annualInterestRate =0 ;
	}
	
	public Account(int Id,double Balance)
	{
		this.Id = Id;
		this.Balance = Balance;
	}
	
	public double getMonthlyInterestRate()
	{
		double MonthlyInterestRate;
		MonthlyInterestRate = annualInterestRate/12;
		return MonthlyInterestRate;
	}
	
	public double getMonthlyInterest()
	{
		double MonthlyInterest;
		MonthlyInterest = Balance * getMonthlyInterestRate() ;
		return MonthlyInterest;
	}
	
	public void withdraw(double amount) 
	{
        this.Balance -= amount;
    }

    public void deposit(double amount) 
    {
        this.Balance += amount;
    }
    
	public void Deposit(double Amount)
	{
		Balance = Balance + Amount;
		System.out.println("Available Balance after Depositing : " + Balance);
	}
	
	public String toString() 
	{
		return "\nAccount ID: " + Id + "\nDate created: " + getDateCreated() + "\nBalance: $" + String.format("%.2f", Balance) + "\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
	}
}