package myclasses;

import exceptions.BottomOfLadderException;
import exceptions.TopOfLadderException;

public class Ladder
{
  private int currentRung, topRung ;

public int getCurrentRung()
{
	return currentRung;
}

private void setCurrentRung(int currentRung)
{
	this.currentRung = currentRung;
}

public int getTopRung()
{
	return topRung;
}

private void setTopRung(int topRung)
{
	this.topRung = topRung;
}

public Ladder()
{
	setCurrentRung(0);
	setTopRung(4);
	
}

public void stepUp() throws TopOfLadderException
{
	if(currentRung == topRung )
	{
		throw new TopOfLadderException();
	}
	else
	{ 
		setCurrentRung(getCurrentRung()+1);
		
	}
}

public void stepDown() throws BottomOfLadderException
{
	if(currentRung == 0 )
	{
		throw new BottomOfLadderException();
	}
	else
	{
		setCurrentRung(getCurrentRung()-1);
	}
}

public String toString()
{
 return "You are on rung "+getCurrentRung()+".";
}

}
