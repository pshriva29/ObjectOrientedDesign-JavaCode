package myclasses;

public class SvgsAcct extends BankAcct
{
	private static double interestRate =0.04; 
	
	public SvgsAcct(int acctNbr, double balance)
	{
		super(acctNbr, balance);
	}

	@Override
	public void monthEnd()
	{  
		double interest;
		interest = (getBalance()*interestRate)/12;
		double newBalance =getBalance()+interest;
		setBalance(Math.round((newBalance)*100)/100.0); 
		
	}

	public static double getInterestRate()
	{
		return interestRate;
	}

	public static void setInterestRate(double interestRate)
	{
		SvgsAcct.interestRate = interestRate;
	}
	
	

}
