package myclasses;

public class Birthday
{
  private String name;
  private Date date;
  
public String getName()
{
	return name;
}

public void setName(String name)
{
	this.name = name;
}

public Birthday(String name,Date birth)
{
	setName(name);
	this.date = birth;
}

public String toString()
	{
	   return getName()+"'s birthday is "+date.toString();
	}
}
