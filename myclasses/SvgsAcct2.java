package myclasses;

public class SvgsAcct2 extends BankAcct
{
	private static double interestRate =0.04; 
	int count = 0; //added to count withdraw
	
	
	public SvgsAcct2(int acctNbr, double balance)
	{
		super(acctNbr, balance);
	}

	@Override
	public void monthEnd()
	{  
		double interest;
	    int serviceCharge = (count-1)*3; //added for new functionality
	    
	    interest = ((getBalance()*interestRate)/12)-serviceCharge;
		double newBalance =getBalance()+interest;
		setBalance(Math.round((newBalance)*100)/100.0); 
		count = 0;
		
	}

	public static double getInterestRate()
	{
		return interestRate;
	}

	public static void setInterestRate(double interestRate)
	{
		SvgsAcct2.interestRate = interestRate;
	}
	
	public void withdraw(double amount)
	{  
		double newBalance = getBalance()-amount;
	    setBalance(newBalance);
	    count++;
	    
	}
	

}
