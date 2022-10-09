import java.util.Scanner;

public class Practical3 
{
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) 
    {
        Account[] accounts = new Account[10];
        
        for (int i = 1; i < 11; i++) 
        {
            accounts[i - 1] = new Account(i, 100.0);
        }

        System.out.print("Enter an ID (1 - 10): ");
        int id = in.nextInt();
        
        if (id < 1 || id > 10) 
        {
            id = incorrectId(id);
        }

        while (true) 
        {
            menuDisplay();
            System.out.print("Enter a Choice: ");
            int choice = in.nextInt();

            if (choice == 4) {
                System.out.printf("%nEnter an ID (1 - 10): ");
                id = in.nextInt();

                if (id < 1 || id > 10) {
                    id = incorrectId(id);
                }
            }
            performChoice(id, choice, accounts);
        }
    }

    public static int incorrectId(int id) 
    {
        while (id < 1 || id > 10) 
        {
            System.out.print("Please enter a Valid ID: ");
            id = in.nextInt();
            System.out.println();
        }
        return id;
    }

    public static void performChoice(int id, int choice, Account[] accounts) 
    {
    	switch (choice) 
    	{
            case 1: 
                System.out.printf("The balance is $%.1f%n",
                                 accounts[id - 1].getBalance());
                break;
            case 2:
                System.out.print("Enter the amount to Withdraw: ");
                accounts[id - 1].withdraw(in.nextDouble());
                break;
            case 3:
                System.out.print("Enter the amount to Deposit: ");
                accounts[id - 1].deposit(in.nextDouble());
                break;
            default:
                break;
        }
    }

    public static void menuDisplay() 
    {
        System.out.printf("%nMain menu%n");
        System.out.println("1: Check Balance");
        System.out.println("2: Withdraw");
        System.out.println("3: Deposit");
        System.out.println("4: Exit");
    }
}