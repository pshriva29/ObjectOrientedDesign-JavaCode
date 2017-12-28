package myclasses;

public class ChkgAcct extends BankAcct
{
	private static double monthlyFee = 3.00;
	private static double perCheckFee = .15;
	private int nbrOfChecks  = 0;
	
	public ChkgAcct(int acctNbr, double balance)
	{
		super(acctNbr, balance);
	}

	@Override
	public void monthEnd()
	{   
		double totalMonthlyFee = getMonthlyFee()+(getPerCheckFee()*getNbrOfChecks());
		double newBalance = getBalance()-totalMonthlyFee;
        setBalance(newBalance);
		setNbrOfChecks(0);
   }

	public static double getMonthlyFee()
	{
		return monthlyFee;
	}

	public static void setMonthlyFee(double monthlyFee)
	{
		ChkgAcct.monthlyFee = monthlyFee;
	}

	public static double getPerCheckFee()
	{
		return perCheckFee;
	}

	public static void setPerCheckFee(double perCheckFee)
	{
		ChkgAcct.perCheckFee = perCheckFee;
	}

	public int getNbrOfChecks()
	{
		return nbrOfChecks;
	}

	private void setNbrOfChecks(int nbrOfChecks)
	{
		this.nbrOfChecks = nbrOfChecks;
	}
	
	public void withdraw(double amount)
	{   
		
		double newBalance = getBalance()-amount;
		int newCheckNbr = getNbrOfChecks()+1;
		setBalance(newBalance);
		setNbrOfChecks(newCheckNbr);
		
	}

}
