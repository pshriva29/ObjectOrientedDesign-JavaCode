package myclasses;
import java.text.DecimalFormat;

public abstract class BankAcct2
{

   private int acctNbr;
   private double balance;
   
   DecimalFormat twoDigits = new DecimalFormat("0.00");
   
public int getAcctNbr()
{
	return acctNbr;
}
protected void setAcctNbr(int acctNbr)
{
	this.acctNbr = acctNbr;
}
public double getBalance()
{
	return balance;
}
protected void setBalance(double balance)
{
	this.balance = balance;
}
   

public BankAcct2(int acctNbr,double balance)
{   
    setAcctNbr(acctNbr);
	setBalance(balance);
}

//toSring() method for display 
public String toString()
	{
	   return "Accnt nbr "+getAcctNbr()+" has balance of $"+twoDigits.format(getBalance());
	}

public void deposit(double amount)
{   
	
	double newBalance = getBalance()+amount;
    setBalance(newBalance);
	
}

public void withdraw(double amount)
{  
	double newBalance = getBalance()-amount;
    setBalance(newBalance);
}

public abstract void monthEnd();


   
}
