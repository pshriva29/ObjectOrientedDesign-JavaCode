package myclasses;

public class Currency2
{
	//Variable declaration
// private int dollars;
// private int cents;
 
 private double amount;
 
 double num = 23.87;
 int integral = (int) (num / 1);
 int remainder = (int)((num % 1) * 100);

 
//Getters and setters
 
public int getDollars()
{
	//return dollars;  //return dollar amount of amount
	
	return ((int) (amount / 1));
}
private void setDollars(int dollars)
{  
	
	/*
	System.out.println("inside setDollars() amount"+amount);
System.out.println("inside setDollars() amount"+ (int)amount);
System.out.println("inside setDollars() amount%1"+ (amount % 1));
	//this.dollars = dollars;
	//double amount1;
	double decimal;
	 decimal = (int)((amount % 1) * 100);
	 System.out.println("inside setDollars() decimal"+decimal);
	*/ 
	
	this.amount = amount +dollars;
	
}
public int getCents()
{
	//return cents;
	
	return ((int)((amount % 1) * 100));
	
	
	
}
private void setCents(int cents)
{  
	
	this.amount= (int)amount + (double)(cents)/100;
	
	
}
 
//Set amount
public void setAmount(int newDollars,int newCents )
{
	this.amount= newDollars + (newCents/100);
	
	
}

//Constructors
public Currency2( )
{
	amount=0;
}

public Currency2(int dollars,int cents)
{
	setAmount(dollars,cents);
}

//toSring() method for display
public String toString()
	{
     return "$"+getDollars()+"." + (getCents()<10 ? "0"+getCents() : getCents());
	}


//Add
public void add(int dollars,int cents)
{ 
	int newDollars = getDollars()+dollars;
	int newCents = getCents()+cents;
	
	setAmount(newDollars,newCents);
}

//Check zero
public boolean isZero()
{
	return getDollars()==0 && getCents()==0 ? true : false;
}


}
