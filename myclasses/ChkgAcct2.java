package myclasses;

public class ChkgAcct2 extends BankAcct
{
	private static double monthlyFee = 3.00;
	private static double perCheckFee = .15;
	private int nbrOfChecks  = 0;
	
	
	public static double getMonthlyFee()
	{
		return monthlyFee;
	}

	public static void setMonthlyFee(double monthlyFee)
	{
		ChkgAcct2.monthlyFee = monthlyFee;
	}

	public static double getPerCheckFee()
	{
		return perCheckFee;
	}

	public static void setPerCheckFee(double perCheckFee)
	{
		ChkgAcct2.perCheckFee = perCheckFee;
	}

	public int getNbrOfChecks()
	{
		return nbrOfChecks;
	}

	private void setNbrOfChecks(int nbrOfChecks)
	{
		this.nbrOfChecks = nbrOfChecks;
	}
	public ChkgAcct2(int acctNbr, double balance)
	{
		super(acctNbr, balance);
	}

	@Override
	public void monthEnd()
	{   
	    if(getBalance()<500) //added if-else for new functionality
		{
		double totalMonthlyFee = getMonthlyFee()+(getPerCheckFee()*getNbrOfChecks());
		double newBalance = getBalance()-totalMonthlyFee;
        setBalance(newBalance);
		setNbrOfChecks(0);
		}
		else
		{   
			
			double interest;
			double interestRate = .02;
			interest = ((getBalance()*interestRate)/12);
			double newBalance =getBalance()+interest;
			setBalance(Math.round((newBalance)*100)/100.0); 
			setNbrOfChecks(0);
			
		}
   }

	
	
	public void withdraw(double amount)
	{   
		
		double newBalance = getBalance()-amount;
		int newCheckNbr = getNbrOfChecks()+1;
		setBalance(newBalance);
		setNbrOfChecks(newCheckNbr);
		
	}

}
