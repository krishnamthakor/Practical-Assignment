import java.io.*;

public class Practical12 
{
	// Main driver method
	public static void main(String[] args) 
	{
		// Creating objects of bank and Employee class
		Bank bank = new Bank("Bank Of Baroda.");
		Employee emp = new Employee("Krishna Thakor");
		System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());
		
		System.out.println("\nID : 21CE142 \nName : Krishna M. Thakor");
	}
}