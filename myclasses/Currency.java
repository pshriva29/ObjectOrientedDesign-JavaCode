package myclasses;

public class Currency
{
	//Variable declaration
 private int dollars;
 private int cents;

 
//Getters and setters
 
public int getDollars()
{
	return dollars;
}
private void setDollars(int dollars)
{  
	this.dollars = dollars;
	
}
public int getCents()
{
	return cents;
}
private void setCents(int cents)
{   
	if(cents<=99)
	{
	this.cents = cents;
	}
	else
	{
		dollars = dollars + (cents/100);
		this.cents = cents%100;
	}
}
 
//Set amount
public void setAmount(int newDollars,int newCents )
{
	setDollars(newDollars);
	setCents(newCents);
	
}

//Constructors
public Currency( )
{
	setCents(0);
	setDollars(0);
}

public Currency(int dollars,int cents)
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
