package customException;

class InsufficientFundsException extends Exception{
	InsufficientFundsException(String msg)
	{
		super(msg);
	}
}

class BankAccount {
	private double balance;
	
	BankAccount(double balance)
	{
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException
	{
		if(amount > balance)
		{
			throw new InsufficientFundsException("Insufficient funds for withdrawal");
		}
		else
		{
			balance -= amount;
			System.out.println("Withdrawal successful. New balance: " + balance);
		}
	}
}

public class main_class {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount(100.00);
		
		try
		{
			account.withdraw(20.00);
			account.withdraw(150.00);
		}
		catch(InsufficientFundsException ex)
		{
			System.out.println("Exception"+ex.getMessage());
		}
	}
}
