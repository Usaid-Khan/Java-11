package Exception_Handling;

class InvalidAgeException extends Exception {
	InvalidAgeException(String msg)
	{
		super(msg);
	}
}

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

class voteCasting {
	public static void vote(int age) throws InvalidAgeException
	{
		if(age < 18)
		{
			throw new InvalidAgeException("Not Eligible for casting vote");
		}
		else
		{
			System.out.println("Eligible for casting vote");
		}
	}
}


public class Assignment {
		
		public static void main(String[] args)
		{
			try
			{
				voteCasting v = new voteCasting();
				BankAccount account = new BankAccount(100.00);
				
				v.vote(14);

				account.withdraw(20.00);
				account.withdraw(150.00);
			}
			catch(InvalidAgeException | InsufficientFundsException ex)
			{
				System.out.println(ex);
			}
	}
}
